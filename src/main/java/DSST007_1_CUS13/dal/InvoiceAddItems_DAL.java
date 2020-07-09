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
 * @author praveen
 */
public class InvoiceAddItems_DAL {
    
    boolean error = false;
    
    public void insertInvoiceItemsToDB(String invoice_no, String invoice_date, String purchase_order_no, String purchase_order_date, String mode_of_transport, String date_of_supply, String time_of_supply, String item_vendor_code, String vehicle_no, String place_of_supply, String customer_name, String cus_addressline1, String cus_addressline2, String cus_state, String cus_state_code, String cus_pan, String cus_gstin, String consignee_name, String cons_addressline1, String cons_addressline2, String cons_state, String cons_state_code, String cons_pan, String cons_gstin, String bank_name, String acc_no, String branch, String ifsc, String e_way_bill_no, String electronic_ref_no, String item_name, String rate, String hsn_sac, String quantity, String unit, String gross_amount, String packing_forwarding_charges, String any_other_charges, String discount, String sgst, String cgst, String net_amount)
    {
        
        System.out.println("hsn_sac: "+hsn_sac);
        
        boolean error = false;
        boolean process = false;
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        int row;
        
        try
        {

            con = DatabaseConnection.createConnection();

            String sql="INSERT INTO invoice(invoice_no, invoice_date, purchase_order_no, purchase_order_date, mode_of_transport, date_of_supply, time_of_supply, item_vendor_code, vehicle_no, place_of_supply, customer_name, cus_addressline1, cus_addressline2, cus_state, cus_state_code, cus_pan, cus_gstin, consignee_name, cons_addressline1, cons_addressline2, cons_state, cons_state_code, cons_pan, cons_gstin, bank_name, acc_no, branch, ifsc, e_way_bill_no, electronic_ref_no, item_name, rate, hsn_sac, quantity, unit, gross_amount, packing_forwarding_charges, any_other_charges, discount, sgst, cgst, net_amount) VALUES('"+invoice_no+"','"+invoice_date+"','"+purchase_order_no+"',?,'"+mode_of_transport+"',?,'"+time_of_supply+"','"+item_vendor_code+"','"+vehicle_no+"','"+place_of_supply+"','"+customer_name+"','"+cus_addressline1+"','"+cus_addressline2+"','"+cus_state+"','"+cus_state_code+"','"+cus_pan+"','"+cus_gstin+"','"+consignee_name+"','"+cons_addressline1+"','"+cons_addressline2+"','"+cons_state+"','"+cons_state_code+"','"+cons_pan+"','"+cons_gstin+"','"+bank_name+"','"+acc_no+"','"+branch+"','"+ifsc+"','"+e_way_bill_no+"','"+electronic_ref_no+"','"+item_name+"','"+rate+"','"+hsn_sac+"','"+quantity+"','"+unit+"','"+gross_amount+"','"+packing_forwarding_charges+"','"+any_other_charges+"','"+discount+"','"+sgst+"','"+cgst+"','"+net_amount+"')";
                   
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, purchase_order_date);
            prepstmt.setString(2, date_of_supply);
            
            row = prepstmt.executeUpdate();
            
            process = true;

        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(null, "InvoiceAddItems_DAL : insertInvoiceItemsToDB() :"+e);
            error = true;

        }
        
    }
    
    //Get list of distinct invoice numbers from DataBase -----------------------
    public List getInvoiceNosFromDB()
    {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        List invoiceList = new ArrayList();
        
        try 
        {
            
            con = DatabaseConnection.createConnection();
            
            String sql_1 = "SELECT DISTINCT invoice_no FROM invoice ";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {

                invoiceList.add(rs.getString("invoice_no"));

            }
            
        } catch (Exception e) 
        {
            
            JOptionPane.showMessageDialog(null,"InvoiceAddItems_DAL : getInvoiceNosFromDB(): "+e);
            
        }
        
        return invoiceList;
        
    }
    
    //Get list of Customers ----------------------------------------------------
    public List getCusNamesFromDB()
    {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        List customerList = new ArrayList();
        
        try 
        {
            
            con = DatabaseConnection.createConnection();
            
            String sql_1 = "SELECT DISTINCT name FROM customer_registration";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {

                customerList.add(rs.getString("name"));

            }
            
        } catch (Exception e) 
        {
            
            JOptionPane.showMessageDialog(null,"InvoiceAddItems_DAL : getCusNamesFromDB(): "+e);
            
        }
        
        return customerList;
        
    }
    
    //Get list of distinct Consignees from DataBase ----------------------------
    public List getConsigneesFromDB()
    {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        List consigneeList = new ArrayList();
        
        try 
        {
            
            con = DatabaseConnection.createConnection();
            
            String sql_1 = "SELECT DISTINCT consignee_name FROM invoice";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {

                consigneeList.add(rs.getString("consignee_name"));

            }
            
        } catch (Exception e) 
        {
            
            JOptionPane.showMessageDialog(null,"InvoiceAddItems_DAL : getConsigneesFromDB(): "+e);
            
        }
        
        return consigneeList;
        
    }
    
    //Get list of distinct Item Names from DataBase ----------------------------
    public List getItemNamesFromDB()
    {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        List itemsList = new ArrayList();
        
        try 
        {
            con = DatabaseConnection.createConnection();
            
            String sql_1 = "SELECT DISTINCT itemname FROM items";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {
                itemsList.add(rs.getString("itemname"));
            }
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"InvoiceAddItems_DAL : getItemNamesFromDB(): "+e);   
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
            String sql = "SELECT itemname, hsn_sac, tax, unit, code FROM items WHERE itemname=?";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, itemName);
            rs = prepstmt.executeQuery();
            while(rs.next()) {
                InvoiceItems_BLL invoiceItems_BLL = new InvoiceItems_BLL();
                invoiceItems_BLL.setItemname(rs.getString("itemname"));
                invoiceItems_BLL.setHsn_sac(rs.getString("hsn_sac"));
                System.out.println("hsn_sac: "+rs.getString("hsn_sac"));
                invoiceItems_BLL.setTax(rs.getString("tax"));
                invoiceItems_BLL.setUnit(rs.getString("unit"));
                invoiceItems_BLL.setCode(rs.getString("code"));
                itemsDetList.add(invoiceItems_BLL);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InvoiceItems_DAL: "+e);
            error = true;
        }
        
        return itemsDetList;
    }
    
    public boolean getErrorStat() {
        return error;
    }
    
}
