/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.InvoiceItems_DAL;
import java.util.List;

/**
 *
 * @author root
 */
public class InvoiceItems_BLL {

    String id, itemname, userid, process, datetime, hsn_sac, tax, unit, code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getHsn_sac() {
        return hsn_sac;
    }

    public void setHsn_sac(String hsn_sac) {
        this.hsn_sac = hsn_sac;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void saveItems(InvoiceItems_BLL invoiceItems_BLL) {
        
        InvoiceItems_DAL invoiceItems_DAL = new InvoiceItems_DAL();
        invoiceItems_DAL.saveItems(invoiceItems_BLL);
    }
    
    public List getItems() {
        
        InvoiceItems_DAL invoiceItems_DAL = new InvoiceItems_DAL();
        return invoiceItems_DAL.getItems();
        
    }
    
    //Get item details from database -------------------------------------------
    public List getItemDetails(String itemName) {
        InvoiceItems_DAL invoiceItems_DAL = new InvoiceItems_DAL();
        return invoiceItems_DAL.getItemDetails(itemName);
    }
    
    //Update items to database -------------------------------------------------
    public void updateItems(InvoiceItems_BLL invoiceItems_BLL, String oldItem) {
        InvoiceItems_DAL invoiceItems_DAL = new InvoiceItems_DAL();
        invoiceItems_DAL.updateItems(invoiceItems_BLL, oldItem);
    }
    
    public boolean getErrorStat() {
        InvoiceItems_DAL invoiceItems_DAL = new InvoiceItems_DAL();
        return invoiceItems_DAL.getErrorStat();
    }
    
}
