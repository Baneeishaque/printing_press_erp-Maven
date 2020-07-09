/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.CutWorkOrderStatement_DAL;
import java.util.List;

/**
 *
 * @author praveen
 */
public class CutWorkOrderStatment
{
    String work_order_id;
    String customer;
    String job_name;
    String job_date;
    String rolls;
    String gsm;
    String colour;
    String supplier;
    String manufacturer;
    String rate;
    String amount;
    String remarks;
    
    boolean error;

    public String getWork_order_id()
    {
        return work_order_id;
    }

    public void setWork_order_id(String work_order_id)
    {
        this.work_order_id = work_order_id;
    }

    public String getCustomer()
    {
        return customer;
    }

    public void setCustomer(String customer)
    {
        this.customer = customer;
    }
    
    public String getJob_name()
    {
        return job_name;
    }

    public void setJob_name(String job_name)
    {
        this.job_name = job_name;
    }

    public String getJob_date()
    {
        return job_date;
    }

    public void setJob_date(String job_date)
    {
        this.job_date = job_date;
    }

    public String getRolls()
    {
        return rolls;
    }

    public void setRolls(String rolls)
    {
        this.rolls = rolls;
    }

    public String getGsm()
    {
        return gsm;
    }

    public void setGsm(String gsm)
    {
        this.gsm = gsm;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
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

    public String getRate()
    {
        return rate;
    }

    public void setRate(String rate)
    {
        this.rate = rate;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }
    
    //Insert cut work order estimate data to database
    public void insertCutWorkOrderEstimateData(CutWorkOrderStatment cutWorkOrderEstimate)
    {
        CutWorkOrderStatement_DAL cutWorkOrderEstimate_DAL = new CutWorkOrderStatement_DAL();
        cutWorkOrderEstimate_DAL.insertCutWorkOrderEstimateData(cutWorkOrderEstimate);
    }
    
    //Get all work order ids from cutwork_estimate
    public List getWorkOrderIds()
    {
        CutWorkOrderStatement_DAL cutWorkOrderEstimate_DAL = new CutWorkOrderStatement_DAL();
        return cutWorkOrderEstimate_DAL.getWorkOrderIds();
    }
    
     //Get all work order ids from cutwork_estimate
    public List getCutWorkOrderDetails(String cutWorkOrderId)
    {
        CutWorkOrderStatement_DAL cutWorkOrderEstimate_DAL = new CutWorkOrderStatement_DAL();
        return cutWorkOrderEstimate_DAL.getCutWorkOrderDetails(cutWorkOrderId);
    }
    
    //Update cut work order estimate data to database
    public void updateCutWorkOrderEstimateData(CutWorkOrderStatment cutWorkOrderEstimate)
    {
        CutWorkOrderStatement_DAL cutWorkOrderEstimate_DAL = new CutWorkOrderStatement_DAL();
        cutWorkOrderEstimate_DAL.updateCutWorkOrderEstimateData(cutWorkOrderEstimate);
    }
    
    public boolean returnErrorStatus()
    {
        return CutWorkOrderStatement_DAL.error;
    }
    
    public void setErrorStatus()
    {
        CutWorkOrderStatement_DAL.error = false;
    }
    
}
