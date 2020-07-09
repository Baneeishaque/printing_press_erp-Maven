/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.InvoiceItems_BLL;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class InvoiceItems_DAL {
    
    boolean error = false;
    
    public void saveItems(InvoiceItems_BLL invoiceItems_BLL) {
    
        Connection con = null;
        PreparedStatement prepstmt = null;
        try {
            con = DatabaseConnection.createConnection();
            String sql = "INSERT INTO items(itemname, userid, process, hsn_sac, tax, unit, code) values(?,?,?,?,?,?,?)";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, invoiceItems_BLL.getItemname());
            prepstmt.setString(2, invoiceItems_BLL.getUserid());
            prepstmt.setString(3, invoiceItems_BLL.getProcess());
            prepstmt.setString(4, invoiceItems_BLL.getHsn_sac());
            prepstmt.setString(5, invoiceItems_BLL.getTax());
            prepstmt.setString(6, invoiceItems_BLL.getUnit());
            prepstmt.setString(7, invoiceItems_BLL.getCode());
            prepstmt.executeUpdate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InvoiceItems_DAL: "+e);
            error = true;
        }
        finally
        {  
            try
            {
                if(prepstmt != null) prepstmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
    
    public List getItems() {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        List itemsList = new ArrayList();
        try {
            con = DatabaseConnection.createConnection();
            String sql = "SELECT itemname FROM items";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery();
            while(rs.next()) {
                InvoiceItems_BLL invoiceItems_BLL = new InvoiceItems_BLL();
                invoiceItems_BLL.setItemname(rs.getString("itemname"));
                itemsList.add(invoiceItems_BLL);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InvoiceItems_DAL: "+e);
            error = true;
        }
        
        return itemsList;
    }
    
    //Get item details from database -------------------------------------------
    public List getItemDetails(String itemName) {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        List itemsDetList = new ArrayList();
        try {
            con = DatabaseConnection.createConnection();
            String sql = "SELECT itemname, hsn_sac, tax, unit FROM items WHERE itemname=?";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, itemName);
            rs = prepstmt.executeQuery();
            while(rs.next()) {
                InvoiceItems_BLL invoiceItems_BLL = new InvoiceItems_BLL();
                invoiceItems_BLL.setItemname(rs.getString("itemname"));
                invoiceItems_BLL.setHsn_sac(rs.getString("hsn_sac"));
                invoiceItems_BLL.setTax(rs.getString("tax"));
                invoiceItems_BLL.setUnit(rs.getString("unit"));
                itemsDetList.add(invoiceItems_BLL);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InvoiceItems_DAL: "+e);
            error = true;
        }
        
        return itemsDetList;
    }
    
     public void updateItems(InvoiceItems_BLL invoiceItems_BLL, String oldItem) {
    
        Connection con = null;
        PreparedStatement prepstmt = null;
        try {
            con = DatabaseConnection.createConnection();
            String sql = "UPDATE items SET itemname=?, hsn_sac=?, tax=?, unit=? WHERE itemname=?";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, invoiceItems_BLL.getItemname());
            prepstmt.setString(2, invoiceItems_BLL.getHsn_sac());
            prepstmt.setString(3, invoiceItems_BLL.getTax());
            prepstmt.setString(4, invoiceItems_BLL.getUnit());
            prepstmt.setString(5, oldItem);
            prepstmt.executeUpdate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InvoiceItems_DAL: "+e);
            error = true;
        }
        finally
        {  
            try
            {
                if(prepstmt != null) prepstmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
    
    public boolean getErrorStat() {
        return error;
    }
    
}
