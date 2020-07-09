/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.InvoiceAddItems_DAL;
import DSST007_1_CUS13.dal.InvoiceEdit_DAL;
import DSST007_1_CUS13.dal.InvoiceReport_DAL;
import java.util.Date;
import java.util.List;


/**
 *
 * @author praveen
 */
public class Invoice {
    
    String invoice_no;
    Date invoice_date;
    String purchase_order_no;
    Date purchase_order_date;
    String mode_of_transport;
    Date date_of_supply;
    String time_of_supply;
    String item_vendor_code;
    String vehicle_no;
    String place_of_supply;
    String customer_name;
    String cus_addressline1;
    String cus_addressline2;
    String cus_state;
    String cus_state_code;
    String cus_pan;
    String cus_gstin;
    String consignee_name;
    String cons_addressline1;
    String cons_addressline2;
    String cons_state;
    String cons_state_code;
    String cons_pan;
    String cons_gstin;
    String bank_name;
    String acc_no;
    String branch;
    String ifsc;
    String e_way_bill_no;
    String electronic_ref_no;
    String item_name;
    String rate;
    String hsn_sac;
    String quantity;
    String unit;
    String gross_amount;
    String packing_forwarding_charges;
    String any_other_charges;
    String discount;
    String sgst;
    String cgst;
    String net_amount;
    String userid;
    String process;
    String id;

    public String getInvoice_no()
    {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no)
    {
        this.invoice_no = invoice_no;
    }

    public Date getInvoice_date()
    {
        return invoice_date;
    }

    public void setInvoice_date(Date invoice_date)
    {
        this.invoice_date = invoice_date;
    }

    public String getPurchase_order_no()
    {
        return purchase_order_no;
    }

    public void setPurchase_order_no(String purchase_order_no)
    {
        this.purchase_order_no = purchase_order_no;
    }

    public Date getPurchase_order_date()
    {
        return purchase_order_date;
    }

    public void setPurchase_order_date(Date purchase_order_date)
    {
        this.purchase_order_date = purchase_order_date;
    }

    public String getMode_of_transport()
    {
        return mode_of_transport;
    }

    public void setMode_of_transport(String mode_of_transport)
    {
        this.mode_of_transport = mode_of_transport;
    }

    public Date getDate_of_supply()
    {
        return date_of_supply;
    }

    public void setDate_of_supply(Date date_of_supply)
    {
        this.date_of_supply = date_of_supply;
    }

    public String getTime_of_supply()
    {
        return time_of_supply;
    }

    public void setTime_of_supply(String time_of_supply)
    {
        this.time_of_supply = time_of_supply;
    }

    public String getItem_vendor_code()
    {
        return item_vendor_code;
    }

    public void setItem_vendor_code(String item_vendor_code)
    {
        this.item_vendor_code = item_vendor_code;
    }

    public String getVehicle_no()
    {
        return vehicle_no;
    }

    public void setVehicle_no(String vehicle_no)
    {
        this.vehicle_no = vehicle_no;
    }

    public String getPlace_of_supply()
    {
        return place_of_supply;
    }

    public void setPlace_of_supply(String place_of_supply)
    {
        this.place_of_supply = place_of_supply;
    }

    public String getCustomer_name()
    {
        return customer_name;
    }

    public void setCustomer_name(String customer_name)
    {
        this.customer_name = customer_name;
    }

    public String getCus_addressline1()
    {
        return cus_addressline1;
    }

    public void setCus_addressline1(String cus_addressline1)
    {
        this.cus_addressline1 = cus_addressline1;
    }

    public String getCus_addressline2()
    {
        return cus_addressline2;
    }

    public void setCus_addressline2(String cus_addressline2)
    {
        this.cus_addressline2 = cus_addressline2;
    }

    public String getCus_state()
    {
        return cus_state;
    }

    public void setCus_state(String cus_state)
    {
        this.cus_state = cus_state;
    }

    public String getCus_state_code()
    {
        return cus_state_code;
    }

    public void setCus_state_code(String cus_state_code)
    {
        this.cus_state_code = cus_state_code;
    }

    public String getCus_pan()
    {
        return cus_pan;
    }

    public void setCus_pan(String cus_pan)
    {
        this.cus_pan = cus_pan;
    }

    public String getCus_gstin()
    {
        return cus_gstin;
    }

    public void setCus_gstin(String cus_gstin)
    {
        this.cus_gstin = cus_gstin;
    }

    public String getConsignee_name()
    {
        return consignee_name;
    }

    public void setConsignee_name(String consignee_name)
    {
        this.consignee_name = consignee_name;
    }

    public String getCons_addressline1()
    {
        return cons_addressline1;
    }

    public void setCons_addressline1(String cons_addressline1)
    {
        this.cons_addressline1 = cons_addressline1;
    }

    public String getCons_addressline2()
    {
        return cons_addressline2;
    }

    public void setCons_addressline2(String cons_addressline2)
    {
        this.cons_addressline2 = cons_addressline2;
    }

    public String getCons_state()
    {
        return cons_state;
    }

    public void setCons_state(String cons_state)
    {
        this.cons_state = cons_state;
    }

    public String getCons_state_code()
    {
        return cons_state_code;
    }

    public void setCons_state_code(String cons_state_code)
    {
        this.cons_state_code = cons_state_code;
    }

    public String getCons_pan()
    {
        return cons_pan;
    }

    public void setCons_pan(String cons_pan)
    {
        this.cons_pan = cons_pan;
    }

    public String getCons_gstin()
    {
        return cons_gstin;
    }

    public void setCons_gstin(String cons_gstin)
    {
        this.cons_gstin = cons_gstin;
    }

    public String getBank_name()
    {
        return bank_name;
    }

    public void setBank_name(String bank_name)
    {
        this.bank_name = bank_name;
    }

    public String getAcc_no()
    {
        return acc_no;
    }

    public void setAcc_no(String acc_no)
    {
        this.acc_no = acc_no;
    }

    public String getBranch()
    {
        return branch;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public String getIfsc()
    {
        return ifsc;
    }

    public void setIfsc(String ifsc)
    {
        this.ifsc = ifsc;
    }

    public String getE_way_bill_no()
    {
        return e_way_bill_no;
    }

    public void setE_way_bill_no(String e_way_bill_no)
    {
        this.e_way_bill_no = e_way_bill_no;
    }

    public String getElectronic_ref_no()
    {
        return electronic_ref_no;
    }

    public void setElectronic_ref_no(String electronic_ref_no)
    {
        this.electronic_ref_no = electronic_ref_no;
    }

    public String getItem_name()
    {
        return item_name;
    }

    public void setItem_name(String item_name)
    {
        this.item_name = item_name;
    }

    public String getRate()
    {
        return rate;
    }

    public void setRate(String rate)
    {
        this.rate = rate;
    }

    public String getHsn_sac()
    {
        return hsn_sac;
    }

    public void setHsn_sac(String hsn_sac)
    {
        this.hsn_sac = hsn_sac;
    }

    public String getQuantity()
    {
        return quantity;
    }

    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public String getGross_amount()
    {
        return gross_amount;
    }

    public void setGross_amount(String gross_amount)
    {
        this.gross_amount = gross_amount;
    }

    public String getPacking_forwarding_charges()
    {
        return packing_forwarding_charges;
    }

    public void setPacking_forwarding_charges(String packing_forwarding_charges)
    {
        this.packing_forwarding_charges = packing_forwarding_charges;
    }

    public String getAny_other_charges()
    {
        return any_other_charges;
    }

    public void setAny_other_charges(String any_other_charges)
    {
        this.any_other_charges = any_other_charges;
    }

    public String getDiscount()
    {
        return discount;
    }

    public void setDiscount(String discount)
    {
        this.discount = discount;
    }

    public String getSgst()
    {
        return sgst;
    }

    public void setSgst(String sgst)
    {
        this.sgst = sgst;
    }

    public String getCgst()
    {
        return cgst;
    }

    public void setCgst(String cgst)
    {
        this.cgst = cgst;
    }

    public String getNet_amount()
    {
        return net_amount;
    }

    public void setNet_amount(String net_amount)
    {
        this.net_amount = net_amount;
    }

    public String getUserid()
    {
        return userid;
    }

    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    public String getProcess()
    {
        return process;
    }

    public void setProcess(String process)
    {
        this.process = process;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    
    public void passInvoiceDataToSave(String invoice_no, String invoice_date, String purchase_order_no, String purchase_order_date, String mode_of_transport, String date_of_supply, String time_of_supply, String item_vendor_code, String vehicle_no, String place_of_supply, String customer_name, String cus_addressline1, String cus_addressline2, String cus_state, String cus_state_code, String cus_pan, String cus_gstin, String consignee_name, String cons_addressline1, String cons_addressline2, String cons_state, String cons_state_code, String cons_pan, String cons_gstin, String bank_name, String acc_no, String branch, String ifsc, String e_way_bill_no, String electronic_ref_no, String item_name, String rate, String hsn_sac, String quantity, String unit, String gross_amount, String packing_forwarding_charges, String any_other_charges, String discount, String sgst, String cgst, String net_amount)
    {
        InvoiceAddItems_DAL invoiceAddItems_DAL  = new InvoiceAddItems_DAL();
        invoiceAddItems_DAL.insertInvoiceItemsToDB(invoice_no, invoice_date, purchase_order_no, purchase_order_date, mode_of_transport, date_of_supply, time_of_supply, item_vendor_code, vehicle_no, place_of_supply, customer_name, cus_addressline1, cus_addressline2, cus_state, cus_state_code, cus_pan, cus_gstin, consignee_name, cons_addressline1, cons_addressline2, cons_state, cons_state_code, cons_pan, cons_gstin, bank_name, acc_no, branch, ifsc, e_way_bill_no, electronic_ref_no, item_name, rate, hsn_sac, quantity, unit, gross_amount, packing_forwarding_charges, any_other_charges, discount, sgst, cgst, net_amount);
    }
    
    public List getInvoiceNumbers()
    {
        InvoiceAddItems_DAL invoiceAddItems_DAL  = new InvoiceAddItems_DAL();
        return invoiceAddItems_DAL.getInvoiceNosFromDB();
    }
    
    public List getCustomerNames()
    {
        InvoiceAddItems_DAL invoiceAddItems_DAL = new InvoiceAddItems_DAL();
        return invoiceAddItems_DAL.getCusNamesFromDB();
    }
    
    public List getConsigneeNames()
    {
        InvoiceAddItems_DAL invoiceAddItems_DAL = new InvoiceAddItems_DAL();
        return invoiceAddItems_DAL.getConsigneesFromDB();
    }
    
    public List getItemNames()
    {
        InvoiceAddItems_DAL invoiceAddItems_DAL = new InvoiceAddItems_DAL();
        return invoiceAddItems_DAL.getItemNamesFromDB();
    }
    
    public List getInvoiceDetails(String invNo) throws Exception
    {
        InvoiceEdit_DAL invoiceEdit_DAL = new InvoiceEdit_DAL();
        return invoiceEdit_DAL.getInvoiceDetails(invNo);
    }
    
    public void updateInvoice() throws Exception
    {
         InvoiceEdit_DAL invoiceEdit_DAL = new InvoiceEdit_DAL();
         invoiceEdit_DAL.updateInvoice(this);
    }
    
    public List getItemsDetail(String invNo) throws Exception
    {
        InvoiceEdit_DAL invoiceEdit_DAL = new InvoiceEdit_DAL();
        return invoiceEdit_DAL.getItemsDetail(invNo);
    }
    
    public void updateItemsDetail() throws Exception
    {
         InvoiceEdit_DAL invoiceEdit_DAL = new InvoiceEdit_DAL();
         invoiceEdit_DAL.updateItemsDetail(this);
    }
    
    //Get all invoice entries from invoice
    public List getAllInvoiceEntries(String fromDate, String toDate)
    {
        InvoiceReport_DAL invoiceReport_DAL  = new InvoiceReport_DAL();
        return invoiceReport_DAL.getAllInvoiceEntries(fromDate, toDate);
    }
    
    //Get item details from database -------------------------------------------
    public List getItemDetails(String itemName) {
        InvoiceAddItems_DAL invoiceAddItems_DAL = new InvoiceAddItems_DAL();
        return invoiceAddItems_DAL.getItemDetails(itemName);
    }
    
    public boolean getErrorStat() {
        InvoiceAddItems_DAL invoiceAddItems_DAL = new InvoiceAddItems_DAL();
        return invoiceAddItems_DAL.getErrorStat();
    }
}
