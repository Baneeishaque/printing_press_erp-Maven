/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.Invoice;
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
public class InvoiceReport_DAL
{
    //Get all invoice entries from invoice
    public List getAllInvoiceEntries(String fromDate, String toDate)
    {
        Connection con;
        PreparedStatement prepstmt;
        ResultSet rs;
        List<Invoice> invoiceList = new ArrayList<>();
    
        con = DatabaseConnection.createConnection();

        try
        {
            String sql = "SELECT * FROM invoice WHERE invoice_date BETWEEN ? AND ? ";
            prepstmt = con.prepareStatement(sql);
            prepstmt.setString(1, fromDate);
            prepstmt.setString(2, toDate);
            rs = prepstmt.executeQuery();
            while (rs.next())
            {
                Invoice invoice = new Invoice();
                invoice.setInvoice_no(rs.getString("invoice_no"));
                invoice.setInvoice_date(rs.getDate("invoice_date"));
                invoice.setItem_name(rs.getString("item_name"));
                invoice.setRate(rs.getString("rate"));
                invoice.setQuantity(rs.getString("quantity"));
                invoice.setUnit(rs.getString("unit"));
                invoice.setDiscount(rs.getString("discount"));
                invoice.setNet_amount(rs.getString("net_amount"));
                invoice.setPurchase_order_no(rs.getString("purchase_order_no"));
                invoice.setPurchase_order_date(rs.getDate("purchase_order_date"));
                invoice.setMode_of_transport(rs.getString("mode_of_transport"));
                invoice.setDate_of_supply(rs.getDate("date_of_supply"));
                invoice.setTime_of_supply(rs.getString("time_of_supply"));
                invoice.setItem_vendor_code(rs.getString("item_vendor_code"));
                invoice.setVehicle_no(rs.getString("vehicle_no"));
                invoice.setPlace_of_supply(rs.getString("place_of_supply"));
                invoice.setConsignee_name(rs.getString("consignee_name"));
                invoice.setBank_name(rs.getString("bank_name"));
                invoiceList.add(invoice);
            }
            
            rs.close();
            prepstmt.close();
            con.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "InvoiceReport_DAL : getAllInvoiceEntries() : "+ex);
        }
        
        return invoiceList;
    }
}
