/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.PrintAndDeliveryQueue_DAL;
import DSST007_1_CUS13.dal.WorkOrder_DAL;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author praveen
 */
public class DeliveryQueue
{
    
    String id, workorder_no, customer, description, delivery_date, no_of_sheets, prn_sheets, fin_bags, num_bund, printer_name, delivery_by, userid, process, usertype, branchid, delivery_stat;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getWorkorder_no()
    {
        return workorder_no;
    }

    public void setWorkorder_no(String workorder_no)
    {
        this.workorder_no = workorder_no;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDelivery_date()
    {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date)
    {
        this.delivery_date = delivery_date;
    }

    public String getNo_of_sheets()
    {
        return no_of_sheets;
    }

    public void setNo_of_sheets(String no_of_sheets)
    {
        this.no_of_sheets = no_of_sheets;
    }

    public String getPrn_sheets()
    {
        return prn_sheets;
    }

    public void setPrn_sheets(String prn_sheets)
    {
        this.prn_sheets = prn_sheets;
    }

    public String getFin_bags()
    {
        return fin_bags;
    }

    public void setFin_bags(String fin_bags)
    {
        this.fin_bags = fin_bags;
    }

    public String getNum_bund()
    {
        return num_bund;
    }

    public void setNum_bund(String num_bund)
    {
        this.num_bund = num_bund;
    }

    public String getPrinter_name()
    {
        return printer_name;
    }

    public void setPrinter_name(String printer_name)
    {
        this.printer_name = printer_name;
    }

    public String getDelivery_by()
    {
        return delivery_by;
    }

    public void setDelivery_by(String delivery_by)
    {
        this.delivery_by = delivery_by;
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

    public String getUsertype()
    {
        return usertype;
    }

    public void setUsertype(String usertype)
    {
        this.usertype = usertype;
    }

    public String getBranchid()
    {
        return branchid;
    }

    public void setBranchid(String branchid)
    {
        this.branchid = branchid;
    }

    public String getCustomer()
    {
        return customer;
    }

    public void setCustomer(String customer)
    {
        this.customer = customer;
    }

    public String getDelivery_stat()
    {
        return delivery_stat;
    }

    public void setDelivery_stat(String delivery_stat)
    {
        this.delivery_stat = delivery_stat;
    }
    
    //Insert values to delivery_queue
    public void insertToDeliveryQueue(DeliveryQueue deliveryQueue) throws Exception
    {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL  = new PrintAndDeliveryQueue_DAL();
        printAndDeliveryQueue_DAL.insertToDeliveryQueue(deliveryQueue);
    }
    
    //Get all data from delivery_queue
    public List getDeliveryQueueData(String delivery_stat) throws Exception
    {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL  = new PrintAndDeliveryQueue_DAL();
        return printAndDeliveryQueue_DAL.getDeliveryQueueData(delivery_stat);
    }
    
    //Update print work order id status
    public void UpdatePrintWorkOrderStatus(String status, String workorderid) throws SQLException
    {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL  = new PrintAndDeliveryQueue_DAL();
        printAndDeliveryQueue_DAL.updatePrintWorkOrderStatus(status, workorderid);
    }
    
    //Finish delivery
    public void finishDeliveryQueue(DeliveryQueue deliveryQueue) throws SQLException
    {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL  = new PrintAndDeliveryQueue_DAL();
        printAndDeliveryQueue_DAL.finishDeliveryQueue(deliveryQueue);
    }
    
    //Get description list from print_work_order
    public List getDescriptions() throws SQLException
    {
        WorkOrder_DAL workOrderEntry_DAL  = new WorkOrder_DAL();
        return workOrderEntry_DAL.getWorkOrders();
    }
    
    //Update delivery queue
    public void updateDeliveryQueue(DeliveryQueue deliveryQueue) throws SQLException
    {
        PrintAndDeliveryQueue_DAL printAndDeliveryQueue_DAL  = new PrintAndDeliveryQueue_DAL();
        printAndDeliveryQueue_DAL.updateDeliveryQueue(deliveryQueue);
    }
    
}
