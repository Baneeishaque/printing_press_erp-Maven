/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.CutWorkOrderEntry_DAL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author praveen
 */
public class CutWorkOrder
{
    
    String id, customer, work_order_id, work_name, gsm, side_length, side_breadth, string_length, string_breadth, beading_length, beading_breadth, rolls, colour, rate, supplier, manufacturer, u_o_m, cutter_note, userid, process, datetime;
    String order_date, delivery_date;
    
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCustomer()
    {
        return customer;
    }

    public void setCustomer(String customer)
    {
        this.customer = customer;
    }

    public String getWork_order_id()
    {
        return work_order_id;
    }

    public void setWork_order_id(String work_order_id)
    {
        this.work_order_id = work_order_id;
    }

    public String getOrder_date()
    {
        return order_date;
    }

    public void setOrder_date(String order_date)
    {
        this.order_date = order_date;
    }

    public String getDelivery_date()
    {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date)
    {
        this.delivery_date = delivery_date;
    }

    public String getWork_name()
    {
        return work_name;
    }

    public void setWork_name(String work_name)
    {
        this.work_name = work_name;
    }

    public String getGsm()
    {
        return gsm;
    }

    public void setGsm(String gsm)
    {
        this.gsm = gsm;
    }

    public String getSide_length()
    {
        return side_length;
    }

    public void setSide_length(String side_length)
    {
        this.side_length = side_length;
    }

    public String getSide_breadth()
    {
        return side_breadth;
    }

    public void setSide_breadth(String side_breadth)
    {
        this.side_breadth = side_breadth;
    }

    public String getString_length()
    {
        return string_length;
    }

    public void setString_length(String string_length)
    {
        this.string_length = string_length;
    }

    public String getString_breadth()
    {
        return string_breadth;
    }

    public void setString_breadth(String string_breadth)
    {
        this.string_breadth = string_breadth;
    }

    public String getBeading_length()
    {
        return beading_length;
    }

    public void setBeading_length(String beading_length)
    {
        this.beading_length = beading_length;
    }

    public String getBeading_breadth()
    {
        return beading_breadth;
    }

    public void setBeading_breadth(String beading_breadth)
    {
        this.beading_breadth = beading_breadth;
    }

    public String getRolls()
    {
        return rolls;
    }

    public void setRolls(String rolls)
    {
        this.rolls = rolls;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getRate()
    {
        return rate;
    }

    public void setRate(String rate)
    {
        this.rate = rate;
    }

    public String getSupplier()
    {
        return supplier;
    }

    public void setSupplier(String supplier)
    {
        this.supplier = supplier;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getU_o_m()
    {
        return u_o_m;
    }

    public void setU_o_m(String u_o_m)
    {
        this.u_o_m = u_o_m;
    }

    public String getCutter_note()
    {
        return cutter_note;
    }

    public void setCutter_note(String cutter_note)
    {
        this.cutter_note = cutter_note;
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

    public String getDatetime()
    {
        return datetime;
    }

    public void setDatetime(String datetime)
    {
        this.datetime = datetime;
    }
    
    //Insert cut work order details to db
    public void insertWorkOrderDetailsToDB(CutWorkOrder cutWorkOrder)
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        cutWorkOrderEntry_DAL.insertWorkOrderDetailsToDB(cutWorkOrder);
    }
    
    //Get customer names from db
    public ArrayList<String> getCustomerNames()
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.getCustomerNames();
    }
    
    //Get manufacturer names from db
    public List getMfrList()
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.getMfrList();
    }
    
    //Get job names from db
    public List getJobNames()
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.getJobNames();
    }
    
    //Get work order id's from cut_work_order
    public List getWorkOrderIDs()
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.getCutWorkOrderIDs();
    }
    
    //Get work order details from cut_work_order
    public List getCutWorkOrderDetails(String workOrderid)
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.getCutWorkOrderDetails(workOrderid);
    }
    
    //Update work order details into db ---------------------------------------
    public boolean updateCutWorkOrder(CutWorkOrder cutWorkOrder)
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.updateCutWorkOrder(cutWorkOrder);
    }
    
    //Get all cut work order details from cut_work_order
    public List getAllCutWorkOrderDetails(String fromDate, String toDate)
    {
        CutWorkOrderEntry_DAL cutWorkOrderEntry_DAL = new CutWorkOrderEntry_DAL();
        return cutWorkOrderEntry_DAL.getAllCutWorkOrderDetails(fromDate, toDate);
    }
}
