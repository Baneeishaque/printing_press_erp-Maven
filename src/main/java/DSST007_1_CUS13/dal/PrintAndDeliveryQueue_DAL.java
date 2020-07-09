/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.DeliveryQueue;
import DSST007_1_CUS13.bll.WorkOrder;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author praveen
 */
public class PrintAndDeliveryQueue_DAL
{
    public List getPrintWorkOrderDetails() throws Exception
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List workOrderDetList = new ArrayList();
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT * FROM print_work_order WHERE status=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, "PENDING");
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            WorkOrder workOrderEntry_BLL = new WorkOrder();
            workOrderEntry_BLL.setWorkorderid(rs.getString("workorderid"));
            workOrderEntry_BLL.setCustomer(rs.getString("customer"));
            workOrderEntry_BLL.setDescription(rs.getString("description"));
            workOrderEntry_BLL.setManufacturer(rs.getString("manufacturer"));
            workOrderEntry_BLL.setGsm(rs.getString("gsm"));
            workOrderEntry_BLL.setPlate(rs.getString("plate"));
            workOrderEntry_BLL.setColour_plate(rs.getString("colour_plate"));
            workOrderEntry_BLL.setCyan(rs.getString("cyan"));
            workOrderEntry_BLL.setMagenta(rs.getString("magenta"));
            workOrderEntry_BLL.setYellow(rs.getString("yellow"));
            workOrderEntry_BLL.setBlack(rs.getString("black"));
            workOrderEntry_BLL.setLength(rs.getString("length"));
            workOrderEntry_BLL.setWidth(rs.getString("width"));
            workOrderEntry_BLL.setSheets(rs.getString("sheets"));
            workOrderEntry_BLL.setDemitype(rs.getString("demitype"));
            workOrderDetList.add(workOrderEntry_BLL);
        }
        
        rs.close();
        prepstmt.close();
        con.close();
        
        return workOrderDetList;
    } 
    
    public String getDelDate(WorkOrder workOrderEntry_BLL, String workOrderId) throws Exception
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        String delDate = null;
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT delivery_date FROM print_work_order WHERE workorderid=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, workOrderId);
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            workOrderEntry_BLL.setDelivery_date(rs.getString("delivery_date"));
            delDate = workOrderEntry_BLL.getDelivery_date();
        }
        
        rs.close();
        prepstmt.close();
        con.close();
        
        return delDate;
    } 
    
    public String getNoOfSheets(WorkOrder workOrderEntry_BLL, String workOrderId) throws Exception
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        String sheets = null;
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT sheets FROM print_work_order WHERE workorderid=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, workOrderId);
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            workOrderEntry_BLL.setSheets(rs.getString("sheets"));
            sheets = workOrderEntry_BLL.getSheets();
        }
        
        rs.close();
        prepstmt.close();
        con.close();
        
        return sheets;
    } 
    
    public String getDeliveryBy(WorkOrder workOrderEntry_BLL, String workOrderId) throws Exception
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        String deliveryBy = null;
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT delivery_by FROM print_work_order WHERE workorderid=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, workOrderId);
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            workOrderEntry_BLL.setDelivery_by(rs.getString("delivery_by"));
            deliveryBy = workOrderEntry_BLL.getDelivery_by();
        }
        
        rs.close();
        prepstmt.close();
        con.close();
        
        return deliveryBy;
    } 
    
    public void insertToDeliveryQueue(DeliveryQueue deliveryQueue) throws SQLException
    {
        Connection con = DatabaseConnection.createConnection(); 

        String sql="INSERT INTO delivery_queue(workorder_no, description, delivery_date, no_of_sheets, prn_sheets, fin_bags, num_bund, printer_name, delivery_by, userid, process, usertype, branchid, customer, delivery_stat) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1,deliveryQueue.getWorkorder_no());
        prepstmt.setString(2,deliveryQueue.getDescription());
        prepstmt.setString(3,deliveryQueue.getDelivery_date());
        prepstmt.setString(4,deliveryQueue.getNo_of_sheets());
        prepstmt.setString(5,deliveryQueue.getPrn_sheets());
        prepstmt.setString(6,deliveryQueue.getFin_bags());
        prepstmt.setString(7,deliveryQueue.getNum_bund());
        prepstmt.setString(8,deliveryQueue.getPrinter_name());
        prepstmt.setString(9,deliveryQueue.getDelivery_by());
        prepstmt.setString(10,deliveryQueue.getUserid());
        prepstmt.setString(11,deliveryQueue.getProcess());
        prepstmt.setString(12,deliveryQueue.getUsertype());
        prepstmt.setString(13,deliveryQueue.getBranchid());
        prepstmt.setString(14,deliveryQueue.getCustomer());
        prepstmt.setString(15,deliveryQueue.getDelivery_stat());
        prepstmt.executeUpdate();
        
        prepstmt.close();
        con.close();

    }
    
    public List getDeliveryQueueData(String delivery_stat) throws SQLException
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List delQueueDataList = new ArrayList();
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT * FROM delivery_queue WHERE delivery_stat=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, "NO");
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            DeliveryQueue deliveryQueue = new DeliveryQueue();
            deliveryQueue.setWorkorder_no(rs.getString("workorder_no"));
            deliveryQueue.setCustomer(rs.getString("customer"));
            deliveryQueue.setDescription(rs.getString("description"));
            deliveryQueue.setDelivery_date(rs.getString("delivery_date"));
            deliveryQueue.setNo_of_sheets(rs.getString("no_of_sheets"));
            deliveryQueue.setPrn_sheets(rs.getString("prn_sheets"));
            deliveryQueue.setFin_bags(rs.getString("fin_bags"));
            deliveryQueue.setNum_bund(rs.getString("num_bund"));
            deliveryQueue.setPrinter_name(rs.getString("printer_name"));
            deliveryQueue.setDelivery_by(rs.getString("delivery_by"));
            delQueueDataList.add(deliveryQueue);
        }
        
        rs.close();
        prepstmt.close();
        con.close();
        
        return delQueueDataList;
    }
    
    public void updatePrintWorkOrderStatus(String status, String workorderid) throws SQLException
    {
        Connection con = DatabaseConnection.createConnection(); 

        String sql=" UPDATE print_work_order SET status=? WHERE workorderid=? ";
        PreparedStatement prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, status);
        prepstmt.setString(2, workorderid);
        prepstmt.executeUpdate();
        
        prepstmt.close();
        con.close();
    }
    
    public void finishDeliveryQueue(DeliveryQueue deliveryQueue) throws SQLException
    {
        Connection con = DatabaseConnection.createConnection(); 
        
        System.out.println("deliverystat: "+deliveryQueue.getDelivery_stat());
        System.out.println("workorderid: "+deliveryQueue.getWorkorder_no());
        

        String sql=" UPDATE delivery_queue SET delivery_stat=? WHERE workorder_no=? ";
        PreparedStatement prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, deliveryQueue.getDelivery_stat());
        prepstmt.setString(2, deliveryQueue.getWorkorder_no());
        prepstmt.executeUpdate();
        
        prepstmt.close();
        con.close();
    }
    
    public void updateDeliveryQueue(DeliveryQueue deliveryQueue) throws SQLException
    {
        Connection con = DatabaseConnection.createConnection(); 

        String sql=" UPDATE delivery_queue SET prn_sheets=?,fin_bags=?,num_bund=? WHERE workorder_no=? ";
        PreparedStatement prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, deliveryQueue.getPrn_sheets());
        System.out.println("Prn_sheets: "+deliveryQueue.getPrn_sheets());
        prepstmt.setString(2, deliveryQueue.getFin_bags());
        prepstmt.setString(3, deliveryQueue.getNum_bund());
        prepstmt.setString(4, deliveryQueue.getWorkorder_no());
         System.out.println("getWorkorder_no: "+deliveryQueue.getWorkorder_no());
        prepstmt.executeUpdate();
        
        prepstmt.close();
        con.close();
    }
    
}
