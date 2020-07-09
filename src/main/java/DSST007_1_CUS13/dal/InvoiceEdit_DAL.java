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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author praveen
 */
public class InvoiceEdit_DAL
{
    public List getInvoiceDetails(String invNo) throws Exception
    {
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        List invDetList = new ArrayList();
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT * FROM invoice WHERE invoice_no=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, invNo);
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            Invoice invoice = new Invoice();
            invoice.setInvoice_date(rs.getDate("invoice_date"));
            invoice.setPurchase_order_no(rs.getString("purchase_order_no"));
            invoice.setPurchase_order_date(rs.getDate("purchase_order_date"));
            invoice.setMode_of_transport(rs.getString("mode_of_transport"));
            invoice.setCustomer_name(rs.getString("customer_name"));
            invoice.setCus_addressline1(rs.getString("cus_addressline1"));
            invoice.setCus_addressline2(rs.getString("cus_addressline2"));
            invoice.setCus_state(rs.getString("cus_state"));
            invoice.setCus_state_code(rs.getString("cus_state_code"));
            invoice.setCus_pan(rs.getString("cus_pan"));
            invoice.setCus_gstin(rs.getString("cus_gstin"));
            invoice.setBank_name(rs.getString("bank_name"));
            invoice.setAcc_no(rs.getString("acc_no"));
            invoice.setBranch(rs.getString("branch"));
            invoice.setIfsc(rs.getString("ifsc"));
            invoice.setDate_of_supply(rs.getDate("date_of_supply"));
            invoice.setTime_of_supply(rs.getString("time_of_supply"));
            invoice.setItem_vendor_code(rs.getString("item_vendor_code"));
            invoice.setVehicle_no(rs.getString("vehicle_no"));
            invoice.setPlace_of_supply(rs.getString("place_of_supply"));
            invoice.setConsignee_name(rs.getString("consignee_name"));
            invoice.setCons_addressline1(rs.getString("cons_addressline1"));
            invoice.setCons_state(rs.getString("cons_state"));
            invoice.setCons_state_code(rs.getString("cons_state_code"));
            invoice.setCons_pan(rs.getString("cons_pan"));
            invoice.setCons_gstin(rs.getString("cons_gstin"));
            invoice.setE_way_bill_no(rs.getString("e_way_bill_no"));
            invoice.setElectronic_ref_no(rs.getString("electronic_ref_no"));
            invDetList.add(invoice);
        }
        
        return invDetList;
    }
    
    public List getItemsDetail(String invNo) throws Exception
    {
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        List invItemsDetailsList = new ArrayList();
    
        con = DatabaseConnection.createConnection();

        String sql = "SELECT * FROM invoice WHERE invoice_no=? ";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, invNo);
        rs = prepstmt.executeQuery();
        while(rs.next())
        {
            Invoice invoice = new Invoice();
            invoice.setItem_name(rs.getString("item_name"));
            invoice.setHsn_sac(rs.getString("hsn_sac"));
            invoice.setQuantity(rs.getString("quantity"));
            invoice.setRate(rs.getString("rate"));
            invoice.setUnit(rs.getString("unit"));
            invoice.setId(rs.getString("id"));
            invoice.setPacking_forwarding_charges(rs.getString("packing_forwarding_charges"));
            invoice.setAny_other_charges(rs.getString("any_other_charges"));
            invoice.setDiscount(rs.getString("discount"));
            invoice.setGross_amount(rs.getString("gross_amount"));
            invoice.setCgst(rs.getString("cgst"));
            invoice.setSgst(rs.getString("sgst"));
            invoice.setNet_amount(rs.getString("net_amount"));
         
            invItemsDetailsList.add(invoice);
        }
        
        return invItemsDetailsList;
    }
    
    public void updateItemsDetail(Invoice invoice) throws Exception
    {
        Connection con = null;
        PreparedStatement prepstmt = null;
        con = DatabaseConnection.createConnection();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String sql="UPDATE invoice\n" +
        "SET\n" +
        "item_name = ?,\n" +
        "hsn_sac = ?,\n" +
        "quantity = ?,\n" +
        "rate = ?,\n" +
        "unit = ?,\n" +
        "packing_forwarding_charges = ?,\n" +
        "any_other_charges = ?,\n" +
        "gross_amount = ?,\n" +
        "cgst = ?,\n" +
        "sgst = ?,\n" +
        "net_amount = ?,\n" +
        "process = ?\n" +
        "WHERE id = ?;";
        prepstmt = con.prepareStatement(sql);
        prepstmt.setString(1, invoice.getItem_name());
        prepstmt.setString(2, invoice.getHsn_sac());
        prepstmt.setString(3, invoice.getQuantity());
        prepstmt.setString(4, invoice.getRate());
        prepstmt.setString(5, invoice.getUnit());
        prepstmt.setString(6, invoice.getPacking_forwarding_charges());
        prepstmt.setString(7, invoice.getAny_other_charges());
        prepstmt.setString(8, invoice.getGross_amount());
        prepstmt.setString(9, invoice.getCgst());
        prepstmt.setString(10, invoice.getSgst());
        prepstmt.setString(11, invoice.getNet_amount());
        prepstmt.setString(12, invoice.getProcess());
        prepstmt.setString(13, invoice.getId());

        prepstmt.executeUpdate();

    }
    
    public void updateInvoice(Invoice invoice) throws Exception
    {
        Connection con = null;
        PreparedStatement prepstmt = null;
        con = DatabaseConnection.createConnection();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String sql="UPDATE invoice\n" +
        "SET\n" +
        "invoice_date = ?,\n" +
        "purchase_order_no = ?,\n" +
        "purchase_order_date = ?,\n" +
        "mode_of_transport = ?,\n" +
        "date_of_supply = ?,\n" +
        "time_of_supply = ?,\n" +
        "item_vendor_code = ?,\n" +
        "vehicle_no = ?,\n" +
        "place_of_supply = ?,\n" +
        "customer_name = ?,\n" +
        "cus_addressline1 = ?,\n" +
        "cus_addressline2 = ?,\n" +
        "cus_state = ?,\n" +
        "cus_state_code = ?,\n" +
        "cus_pan = ?,\n" +
        "cus_gstin = ?,\n" +
        "consignee_name = ?,\n" +
        "cons_addressline1 = ?,\n" +
        "cons_addressline2 = ?,\n" +
        "cons_state = ?,\n" +
        "cons_state_code = ?,\n" +
        "cons_pan = ?,\n" +
        "cons_gstin = ?,\n" +
        "bank_name = ?,\n" +
        "acc_no = ?,\n" +
        "branch = ?,\n" +
        "ifsc = ?,\n" +
        "e_way_bill_no = ?,\n" +
        "electronic_ref_no = ?,\n" +
        "userid = ?,\n" +
        "process = ?\n" +
        "WHERE invoice_no = ?;";
        prepstmt = con.prepareStatement(sql);
        
        if(invoice.getInvoice_date() == null){ prepstmt.setString(1, null); }else{ prepstmt.setString(1, sdf.format(invoice.getInvoice_date())); }
        prepstmt.setString(2, invoice.getPurchase_order_no());
        if(invoice.getPurchase_order_date() == null){ prepstmt.setString(3, null); }else{ prepstmt.setString(3, sdf.format(invoice.getPurchase_order_date())); }
        prepstmt.setString(4, invoice.getMode_of_transport());
         if(invoice.getDate_of_supply() == null){ prepstmt.setString(5, null); }else{ prepstmt.setString(5, sdf.format(invoice.getDate_of_supply())); }
        prepstmt.setString(6, invoice.getTime_of_supply());
        prepstmt.setString(7, invoice.getItem_vendor_code());
        prepstmt.setString(8, invoice.getVehicle_no());
        prepstmt.setString(9, invoice.getPlace_of_supply());
        prepstmt.setString(10, invoice.getCustomer_name());
        prepstmt.setString(11, invoice.getCus_addressline1());
        prepstmt.setString(12, invoice.getCus_addressline2());
        prepstmt.setString(13, invoice.getCus_state());
        prepstmt.setString(14, invoice.getCus_addressline2());
        prepstmt.setString(15, invoice.getCus_pan());
        prepstmt.setString(16, invoice.getCus_gstin());
        prepstmt.setString(17, invoice.getConsignee_name());
        prepstmt.setString(18, invoice.getCons_addressline1());
        prepstmt.setString(19, invoice.getCons_addressline2());
        prepstmt.setString(20, invoice.getCons_state());
        prepstmt.setString(21, invoice.getCons_state_code());
        prepstmt.setString(22, invoice.getCons_pan());
        prepstmt.setString(23, invoice.getCons_gstin());
        prepstmt.setString(24, invoice.getBank_name());
        prepstmt.setString(25, invoice.getAcc_no());
        prepstmt.setString(26, invoice.getBranch());
        prepstmt.setString(27, invoice.getIfsc());
        prepstmt.setString(28, invoice.getE_way_bill_no());
        prepstmt.setString(29, invoice.getElectronic_ref_no());
        prepstmt.setString(30, invoice.getUserid());
        prepstmt.setString(31, invoice.getProcess());
        prepstmt.setString(32, invoice.getInvoice_no());

        prepstmt.executeUpdate();

    }
    
}
