/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.CutWorkOrderStatment;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author praveen
 */
public class CutWorkOrderStatement_DAL
{
    public static boolean error = false;
    
    //Insert cut work order estimate data to database
    public void insertCutWorkOrderEstimateData(CutWorkOrderStatment cutWorkOrderEstimate)
    {
        Connection con = DatabaseConnection.createConnection(); 
        PreparedStatement prepstmt = null;
        //DatabaseConnection is the connection class
        try
        {
            String sql="INSERT INTO cutwork_statement(job_name, job_date, rolls, gsm, colour, supplier, manufacturer, rate, amount, remarks, work_order_id, customer) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1,cutWorkOrderEstimate.getJob_name());
            prepstmt.setString(2,cutWorkOrderEstimate.getJob_date());
            prepstmt.setString(3,cutWorkOrderEstimate.getRolls());
            prepstmt.setString(4,cutWorkOrderEstimate.getGsm());
            prepstmt.setString(5,cutWorkOrderEstimate.getColour());
            prepstmt.setString(6,cutWorkOrderEstimate.getSupplier());
            prepstmt.setString(7,cutWorkOrderEstimate.getManufacturer());
            prepstmt.setString(8,cutWorkOrderEstimate.getRate());
            prepstmt.setString(9,cutWorkOrderEstimate.getAmount());
            prepstmt.setString(10,cutWorkOrderEstimate.getRemarks());
            prepstmt.setString(11,cutWorkOrderEstimate.getWork_order_id());
            prepstmt.setString(12,cutWorkOrderEstimate.getCustomer());
            prepstmt.executeUpdate();
        }
        catch(Exception e)
        {
            if(e.getMessage().contains("Duplicate"))
            {
                JOptionPane.showMessageDialog(null,"Statement for this work order already saved","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "CutWorkOrderEstimate_DAL : insertCutWorkOrderEstimateData() :"+e);   
            }
            
            error = true;
        }
        finally 
        {
            if(prepstmt != null){try { prepstmt.close(); } catch (Exception e) { /* ignored */ }}
            if(con != null){try { con.close(); } catch (Exception e) { /* ignored */ }}
        }
    }
    
    //Get all work order ids from cutwork_estimate
    public List getWorkOrderIds()
    {
        List<String> workOrderIdList = new ArrayList();
        
        Connection con = DatabaseConnection.createConnection(); 
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        try
        {
            String sql = "SELECT DISTINCT work_order_id FROM cut_work_order";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while(rs.next())
            {
                String workOrderId = rs.getString("work_order_id");
                workOrderIdList.add(workOrderId);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEstimate_DAL : insertCutWorkOrderEstimateData() :"+e);
        }
        
        return workOrderIdList;
    }
    
    //Get all work order ids from cutwork_estimate
    public List getCutWorkOrderDetails(String cutWorkOrderId)
    {
        List<CutWorkOrderStatment> workOrderDetList = new ArrayList();
        
        Connection con = DatabaseConnection.createConnection(); 
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        try
        {
            CutWorkOrderStatment cutWorkOrderStatment = new CutWorkOrderStatment();
            String sql = "SELECT * FROM cut_work_order WHERE work_order_id='"+cutWorkOrderId+"' ";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while(rs.next())
            {
                cutWorkOrderStatment.setWork_order_id(rs.getString("work_order_id"));
                cutWorkOrderStatment.setCustomer(rs.getString("customer"));
                cutWorkOrderStatment.setJob_name(rs.getString("work_name"));
                cutWorkOrderStatment.setJob_date(rs.getString("order_date"));
                cutWorkOrderStatment.setRolls(rs.getString("rolls"));
                cutWorkOrderStatment.setGsm(rs.getString("gsm"));
                cutWorkOrderStatment.setColour(rs.getString("colour"));
                cutWorkOrderStatment.setSupplier(rs.getString("supplier"));
                cutWorkOrderStatment.setManufacturer(rs.getString("manufacturer"));
                cutWorkOrderStatment.setRate(rs.getString("rate"));
                workOrderDetList.add(cutWorkOrderStatment);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "CutWorkOrderEstimate_DAL : insertCutWorkOrderEstimateData() :"+e);
        }
        
        return workOrderDetList;
    }
    
    //Update cut work order estimate data to database
    public void updateCutWorkOrderEstimateData(CutWorkOrderStatment cutWorkOrderEstimate)
    {
        Connection con = DatabaseConnection.createConnection(); 
        PreparedStatement prepstmt = null;
        //DatabaseConnection is the connection class
        try
        {
            String sql="UPDATE cutwork_statement SET job_name=?,job_date=?,rolls=?,gsm=?,colour=?,supplier=?,manufacturer=?,rate=?,amount=?,remarks=?,work_order_id=?,customer=? WHERE work_order_id=? ";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1,cutWorkOrderEstimate.getJob_name());
            prepstmt.setString(2,cutWorkOrderEstimate.getJob_date());
            prepstmt.setString(3,cutWorkOrderEstimate.getRolls());
            prepstmt.setString(4,cutWorkOrderEstimate.getGsm());
            prepstmt.setString(5,cutWorkOrderEstimate.getColour());
            prepstmt.setString(6,cutWorkOrderEstimate.getSupplier());
            prepstmt.setString(7,cutWorkOrderEstimate.getManufacturer());
            prepstmt.setString(8,cutWorkOrderEstimate.getRate());
            prepstmt.setString(9,cutWorkOrderEstimate.getAmount());
            prepstmt.setString(10,cutWorkOrderEstimate.getRemarks());
            prepstmt.setString(11,cutWorkOrderEstimate.getWork_order_id());
            prepstmt.setString(12,cutWorkOrderEstimate.getCustomer());
            prepstmt.setString(13,cutWorkOrderEstimate.getWork_order_id());
            prepstmt.executeUpdate();
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(null, "CutWorkOrderEstimate_DAL : insertCutWorkOrderEstimateData() :"+e);
            error = true;
        }
        finally 
        {
            if(prepstmt != null){try { prepstmt.close(); } catch (Exception e) { /* ignored */ }}
            if(con != null){try { con.close(); } catch (Exception e) { /* ignored */ }}
        }
    }
    
    public boolean getErrorStat()
    {
        return error;
    }
    
}
