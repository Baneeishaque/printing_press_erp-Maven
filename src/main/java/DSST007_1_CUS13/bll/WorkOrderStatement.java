package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.WorkOrderStatement_DAL;
import java.util.List;

public class WorkOrderStatement
{
    
    private String id;
    private String work_order_no;
    private String description;
    private String customer;
    private String jobdate;
    private String rate;
    private String plate;
    private String design;
    private String quantity;
    private String amount;
    private String outstanding_balance;
    private String other_item;
    private String other_item_amt;
    private String cutting_charges;
    private String total;
    private String deduction;
    private String deduction_amt;
    private String net_total;
    private String amt_recieved;
    private String balance_amt;
    private String userid;
    private String process;
    private String datetime;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCustomer()
    {
        return customer;
    }

    public void setCustomer(String customer)
    {
        this.customer = customer;
    }

    public String getJobdate()
    {
        return jobdate;
    }

    public void setJobdate(String jobdate)
    {
        this.jobdate = jobdate;
    }

    public String getWork_order_no()
    {
        return work_order_no;
    }

    public void setWork_order_no(String work_order_no)
    {
        this.work_order_no = work_order_no;
    }

    public String getRate()
    {
        return rate;
    }

    public void setRate(String rate)
    {
        this.rate = rate;
    }

    public String getPlate()
    {
        return plate;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }

    public String getDesign()
    {
        return design;
    }

    public void setDesign(String design)
    {
        this.design = design;
    }

    public String getQuantity()
    {
        return quantity;
    }

    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getOutstanding_balance()
    {
        return outstanding_balance;
    }

    public void setOutstanding_balance(String outstanding_balance)
    {
        this.outstanding_balance = outstanding_balance;
    }

    public String getOther_item()
    {
        return other_item;
    }

    public void setOther_item(String other_item)
    {
        this.other_item = other_item;
    }

    public String getOther_item_amt()
    {
        return other_item_amt;
    }

    public void setOther_item_amt(String other_item_amt)
    {
        this.other_item_amt = other_item_amt;
    }

    public String getCutting_charges()
    {
        return cutting_charges;
    }

    public void setCutting_charges(String cutting_charges)
    {
        this.cutting_charges = cutting_charges;
    }

    public String getTotal()
    {
        return total;
    }

    public void setTotal(String total)
    {
        this.total = total;
    }

    public String getDeduction()
    {
        return deduction;
    }

    public void setDeduction(String deduction)
    {
        this.deduction = deduction;
    }

    public String getDeduction_amt()
    {
        return deduction_amt;
    }

    public void setDeduction_amt(String deduction_amt)
    {
        this.deduction_amt = deduction_amt;
    }

    public String getNet_total()
    {
        return net_total;
    }

    public void setNet_total(String net_total)
    {
        this.net_total = net_total;
    }

    public String getAmt_recieved()
    {
        return amt_recieved;
    }

    public void setAmt_recieved(String amt_recieved)
    {
        this.amt_recieved = amt_recieved;
    }

    public String getBalance_amt()
    {
        return balance_amt;
    }

    public void setBalance_amt(String balance_amt)
    {
        this.balance_amt = balance_amt;
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
    
    //Get work order numbers from database
    public List<String> getWorkOrderNos()
    {
        WorkOrderStatement_DAL workOrderStatement_DAL = new WorkOrderStatement_DAL();
        return workOrderStatement_DAL.getPrintWorkOrderNos();
    }
    
    //Get work order details from print_work_order
    public List<WorkOrderStatement> getWorkOrderDetails(String workOrderId)
    {
        WorkOrderStatement_DAL workOrderStatement_DAL = new WorkOrderStatement_DAL();
        return workOrderStatement_DAL.getPrintWorkOrderDetails(workOrderId);
    }
    
    public boolean saveWorkOrderStatement(WorkOrderStatement workOrderStatement)
    {
        WorkOrderStatement_DAL workOrderStatement_DAL = new WorkOrderStatement_DAL();
        return workOrderStatement_DAL.savePrintWorkOrderStatement(workOrderStatement);
    }
    
     //Get work order numbers from 'work_order_statement' 
    public List getWorkOrderNosFromWorkOrderStatements()
    {
        WorkOrderStatement_DAL workOrderStatement_DAL = new WorkOrderStatement_DAL();
        return workOrderStatement_DAL.getWorkOrderNosFromWorkOrderStatements();
    }
    
    //Get work order details from 'work_order_statement'
    public List getWorkOrderDetailsFromWorkOrderStatements(String workOrderId)
    {
        WorkOrderStatement_DAL workOrderStatement_DAL = new WorkOrderStatement_DAL();
        return workOrderStatement_DAL.getWorkOrderDetailsFromWorkOrderStatements(workOrderId);
    }
    
    //Update workorder statement to 'work_order_statement'
    public boolean updateWorkOrderStatement(WorkOrderStatement workOrderStatement)
    {
        WorkOrderStatement_DAL workOrderStatement_DAL = new WorkOrderStatement_DAL();
        return workOrderStatement_DAL.updateWorkOrderStatement(workOrderStatement);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
