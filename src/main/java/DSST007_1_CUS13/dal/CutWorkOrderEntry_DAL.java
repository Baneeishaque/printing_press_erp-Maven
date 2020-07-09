/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.CutWorkOrder;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author praveen
 */
public class CutWorkOrderEntry_DAL {
    
    String operation = null;
    static boolean proc_stat = false;
    static boolean error = false;
    static int row = 0;
    
    //Insert work order details into db ---------------------------------------
    public void insertWorkOrderDetailsToDB(CutWorkOrder cutWorkOrder)
    {
      
        Connection con = null;
        PreparedStatement prepstmt = null;
        
        try
        {
            con = DatabaseConnection.createConnection();
            
            String sql="INSERT INTO cut_work_order (customer,work_order_id,order_date,delivery_date,work_name,gsm,side_length,side_breadth,string_length,string_breadth,beading_length,beading_breadth,rolls,colour,rate,supplier,manufacturer,u_o_m,cutter_note) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1,cutWorkOrder.getCustomer());
            prepstmt.setString(2,cutWorkOrder.getWork_order_id());
            prepstmt.setString(3,cutWorkOrder.getOrder_date());
            prepstmt.setString(4,cutWorkOrder.getDelivery_date());
            prepstmt.setString(5,cutWorkOrder.getWork_name());
            prepstmt.setString(6,cutWorkOrder.getGsm());
            prepstmt.setString(7,cutWorkOrder.getSide_length());
            prepstmt.setString(8,cutWorkOrder.getSide_breadth());
            prepstmt.setString(9,cutWorkOrder.getString_length());
            prepstmt.setString(10,cutWorkOrder.getString_breadth());
            prepstmt.setString(11,cutWorkOrder.getBeading_length());
            prepstmt.setString(12,cutWorkOrder.getBeading_breadth());
            prepstmt.setString(13,cutWorkOrder.getRolls());
            prepstmt.setString(14,cutWorkOrder.getColour());
            prepstmt.setString(15,cutWorkOrder.getRate());
            prepstmt.setString(16,cutWorkOrder.getSupplier());
            prepstmt.setString(17,cutWorkOrder.getManufacturer());
            prepstmt.setString(18,cutWorkOrder.getU_o_m());
            prepstmt.setString(19,cutWorkOrder.getCutter_note());
          
            row = prepstmt.executeUpdate();
           
            proc_stat = true;
            
            prepstmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : insertWorkOrderDetailsToDB(): "+e);
            error = true;
        }
    }
    
    //Get work order number
    public class GetWorkOrderNo
    {
        String workOrderNo;
        public boolean workOrderNoExist;
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        public void setWorkOrderNo() throws SQLException
        {

            String workOrderId;
            boolean workOrderidExist;

            con = DatabaseConnection.createConnection();

            String sql_1 = "SELECT work_order_id FROM cut_work_order ";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            if(rs.last() == true)
            {
                workOrderidExist = true;
                workOrderId = rs.getString("work_order_id");

                this.workOrderNo = workOrderId;
                this.workOrderNoExist = workOrderidExist;
            }    
            else
            {
                workOrderidExist = false;
                this.workOrderNoExist = workOrderidExist;
            }
            
            System.out.println("workOrderNoExist: "+workOrderNoExist);
         
        }
        
        public boolean getWorkOrderNoExistStatus()
        {
            return workOrderNoExist;
        }
        
        public String getWorkOrderNo()
        { 
            return workOrderNo;
        }

        
    }
    
    //Get customer list from database
    public ArrayList<String> getCustomerNames()
    {
        ArrayList<String> custDetArray = new ArrayList();
            
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        con = DatabaseConnection.createConnection();
        
        try
        {
            String sql_1 = "SELECT id,name FROM customer_registration ";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String name_id = name+" | "+id;
                
                custDetArray.add(name_id);
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL :  getCustomerDetailsFromDB() :"+ex);
        }
        
        return custDetArray;
    }
    
    //Get manufacturers list
    public List getMfrList()
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<String> mfrList = new ArrayList<>();
    
        con = DatabaseConnection.createConnection();

        try
        {
            String sql = "SELECT DISTINCT mfrname FROM mfr_registration";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery();
            while (rs.next())
            {
                mfrList.add(rs.getString("mfrname"));
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : getMfrList() : "+ex);
        }
        
        return mfrList;
    }
    
    //Get job names from cut_work_order
    public List getJobNames()
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<String> mfrList = new ArrayList<>();
    
        con = DatabaseConnection.createConnection();

        try
        {
            String sql = "SELECT DISTINCT work_name FROM cut_work_order";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery();
            while (rs.next())
            {
                mfrList.add(rs.getString("work_name"));
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : getJobNames() : "+ex);
        }
        
        return mfrList;
    }
    
    //Get work work order id's from cut_work_order
    public List getCutWorkOrderIDs()
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<String> workOrderIdList = new ArrayList<>();
    
        con = DatabaseConnection.createConnection();

        try
        {
            String sql = "SELECT DISTINCT work_order_id FROM cut_work_order";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery();
            while (rs.next())
            {
                workOrderIdList.add(rs.getString("work_order_id"));
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : getWorkOrderIDs() : "+ex);
        }
        
        return workOrderIdList;
    }
    
    //Get work order details from cut_work_order
    public List getCutWorkOrderDetails(String workOrderid)
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<CutWorkOrder> workOrderDetList = new ArrayList<>();
    
        con = DatabaseConnection.createConnection();

        try
        {
            String sql = "SELECT * FROM cut_work_order WHERE work_order_id=? ";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, workOrderid);
            rs = prepstmt.executeQuery();
            while (rs.next())
            {
                CutWorkOrder cutWorkOrder = new CutWorkOrder();
                cutWorkOrder.setCustomer(rs.getString("customer"));
                cutWorkOrder.setWork_order_id(rs.getString("work_order_id"));
                cutWorkOrder.setOrder_date(rs.getString("order_date"));
                cutWorkOrder.setDelivery_date(rs.getString("delivery_date"));
                cutWorkOrder.setWork_name(rs.getString("work_name"));
                cutWorkOrder.setWork_name(rs.getString("work_name"));
                cutWorkOrder.setGsm(rs.getString("gsm"));
                cutWorkOrder.setSide_length(rs.getString("side_length"));
                cutWorkOrder.setSide_breadth(rs.getString("side_breadth"));
                cutWorkOrder.setString_length(rs.getString("string_length"));
                cutWorkOrder.setString_breadth(rs.getString("string_breadth"));
                cutWorkOrder.setBeading_length(rs.getString("beading_length"));
                cutWorkOrder.setBeading_breadth(rs.getString("beading_breadth"));
                cutWorkOrder.setRolls(rs.getString("rolls"));
                cutWorkOrder.setColour(rs.getString("colour"));
                cutWorkOrder.setRate(rs.getString("rate"));
                cutWorkOrder.setSupplier(rs.getString("supplier"));
                cutWorkOrder.setManufacturer(rs.getString("manufacturer"));
                cutWorkOrder.setU_o_m(rs.getString("u_o_m"));
                cutWorkOrder.setCutter_note(rs.getString("cutter_note"));
                
                workOrderDetList.add(cutWorkOrder);
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : getCutWorkOrderDetails() : "+ex);
        }
        
        return workOrderDetList;
    }
    
    //Update work order details into db ---------------------------------------
    public boolean updateCutWorkOrder(CutWorkOrder cutWorkOrder)
    {
        Boolean error = false;
        Connection con = null;
        PreparedStatement prepstmt = null;
        
        try
        {
            con = DatabaseConnection.createConnection();
            
            String sql="UPDATE cut_work_order SET customer=?,work_order_id=?,order_date=?,delivery_date=?,work_name=?,gsm=?,side_length=?,side_breadth=?,string_length=?,string_breadth=?,beading_length=?,beading_breadth=?,rolls=?,colour=?,rate=?,supplier=?,manufacturer=?,u_o_m=?,cutter_note=? WHERE work_order_id= ?";
            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1,cutWorkOrder.getCustomer());
            prepstmt.setString(2,cutWorkOrder.getWork_order_id());
            prepstmt.setString(3,cutWorkOrder.getOrder_date());
            prepstmt.setString(4,cutWorkOrder.getDelivery_date());
            prepstmt.setString(5,cutWorkOrder.getWork_name());
            prepstmt.setString(6,cutWorkOrder.getGsm());
            prepstmt.setString(7,cutWorkOrder.getSide_length());
            prepstmt.setString(8,cutWorkOrder.getSide_breadth());
            prepstmt.setString(9,cutWorkOrder.getString_length());
            prepstmt.setString(10,cutWorkOrder.getString_breadth());
            prepstmt.setString(11,cutWorkOrder.getBeading_length());
            prepstmt.setString(12,cutWorkOrder.getBeading_breadth());
            prepstmt.setString(13,cutWorkOrder.getRolls());
            prepstmt.setString(14,cutWorkOrder.getColour());
            prepstmt.setString(15,cutWorkOrder.getRate());
            prepstmt.setString(16,cutWorkOrder.getSupplier());
            prepstmt.setString(17,cutWorkOrder.getManufacturer());
            prepstmt.setString(18,cutWorkOrder.getU_o_m());
            prepstmt.setString(19,cutWorkOrder.getCutter_note());
            prepstmt.setString(20,cutWorkOrder.getWork_order_id());
            prepstmt.executeUpdate();
     
            prepstmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : updateCutWorkOrder(): "+e);
            error = true;
        }
        
        return error;
    }
    
    //Get all cut work order details from cut_work_order
    public List getAllCutWorkOrderDetails(String fromDate, String toDate)
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<CutWorkOrder> workOrderDetList = new ArrayList<>();
    
        con = DatabaseConnection.createConnection();

        try
        {
            String sql = "SELECT * FROM cut_work_order WHERE order_date BETWEEN ? AND ? ";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, fromDate);
            prepstmt.setString(2, toDate);
            rs = prepstmt.executeQuery();
            while (rs.next())
            {
                CutWorkOrder cutWorkOrder = new CutWorkOrder();
                cutWorkOrder.setCustomer(rs.getString("customer"));
                cutWorkOrder.setWork_order_id(rs.getString("work_order_id"));
                cutWorkOrder.setOrder_date(rs.getString("order_date"));
                cutWorkOrder.setDelivery_date(rs.getString("delivery_date"));
                cutWorkOrder.setWork_name(rs.getString("work_name"));
                cutWorkOrder.setWork_name(rs.getString("work_name"));
                cutWorkOrder.setGsm(rs.getString("gsm"));
                cutWorkOrder.setSide_length(rs.getString("side_length"));
                cutWorkOrder.setSide_breadth(rs.getString("side_breadth"));
                cutWorkOrder.setString_length(rs.getString("string_length"));
                cutWorkOrder.setString_breadth(rs.getString("string_breadth"));
                cutWorkOrder.setBeading_length(rs.getString("beading_length"));
                cutWorkOrder.setBeading_breadth(rs.getString("beading_breadth"));
                cutWorkOrder.setRolls(rs.getString("rolls"));
                cutWorkOrder.setColour(rs.getString("colour"));
                cutWorkOrder.setRate(rs.getString("rate"));
                cutWorkOrder.setSupplier(rs.getString("supplier"));
                cutWorkOrder.setManufacturer(rs.getString("manufacturer"));
                cutWorkOrder.setU_o_m(rs.getString("u_o_m"));
                cutWorkOrder.setCutter_note(rs.getString("cutter_note"));
                
                workOrderDetList.add(cutWorkOrder);
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEntry_DAL : getAllCutWorkOrderDetails() : "+ex);
        }
        
        return workOrderDetList;
    }
    
}
