/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.bll.WorkOrderStatement;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class WorkOrderStatement_DAL {

    //Get work order numbers from 'print_work_order'
    public List<String> getPrintWorkOrderNos() {

        @SuppressWarnings("CollectionWithoutInitialCapacity")
        List<String> workOrderIdList = new ArrayList<>();

        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt;
        ResultSet rs;

        try {
            String sql = "SELECT DISTINCT workorderid FROM print_work_order";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while (rs.next()) {

                String workOrderId = rs.getString("workorderid");
                workOrderIdList.add(workOrderId);
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : getWorkOrderNos() :" + e);
        }
        return workOrderIdList;
    }

    //Get work order numbers from 'work_order_statement' 
    public List getWorkOrderNosFromWorkOrderStatements() {
        List<String> workOrderIdList = new ArrayList();

        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT DISTINCT work_order_no FROM work_order_statement";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while (rs.next()) {
                String workOrderId = rs.getString("work_order_no");
                workOrderIdList.add(workOrderId);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : getWorkOrderNosFromWorkOrderStatements() :" + e);
        }

        return workOrderIdList;
    }

    //Get work order details from 'print_work_order'
    public List<WorkOrderStatement> getPrintWorkOrderDetails(String workOrderId) {

        @SuppressWarnings("CollectionWithoutInitialCapacity")
        List<WorkOrderStatement> workOrderDetList = new ArrayList<>();

        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt;
        ResultSet rs;

        try {
            String sql = "SELECT description,orderdate,customer,rate,plate_charge,design_charge,sheets FROM print_work_order WHERE workorderid='" + workOrderId + "' ";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while (rs.next()) {
                WorkOrderStatement workOrderStatement = new WorkOrderStatement();
                workOrderStatement.setDescription(rs.getString("description"));
                workOrderStatement.setCustomer(rs.getString("customer"));
                workOrderStatement.setJobdate(rs.getString("orderdate"));
                workOrderStatement.setRate(rs.getString("rate"));
                workOrderStatement.setPlate(rs.getString("plate_charge"));
                workOrderStatement.setDesign(rs.getString("design_charge"));
                workOrderStatement.setQuantity(rs.getString("sheets"));
                workOrderDetList.add(workOrderStatement);
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : getCutWorkOrderDetails() :" + e);
        }
        return workOrderDetList;
    }

    //Get work order details from 'work_order_statement'
    public List getWorkOrderDetailsFromWorkOrderStatements(String workOrderId) {
        List<WorkOrderStatement> workOrderDetList = new ArrayList();

        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT job_name,customer,job_date,rate,plate,design,quantity,amount,outstanding_balance,other_item,other_item_amt,cutting_charges,total,deduction,deduction_amt,net_total,amt_recieved,balance_amt FROM work_order_statement WHERE work_order_no='" + workOrderId + "' ";
            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while (rs.next()) {
                WorkOrderStatement workOrderStatement = new WorkOrderStatement();
                workOrderStatement.setDescription(rs.getString("job_name"));
                workOrderStatement.setCustomer(rs.getString("customer"));
                workOrderStatement.setJobdate(rs.getString("job_date"));
                workOrderStatement.setRate(rs.getString("rate"));
                workOrderStatement.setPlate(rs.getString("plate"));
                workOrderStatement.setDesign(rs.getString("design"));
                workOrderStatement.setQuantity(rs.getString("quantity"));
                workOrderStatement.setAmount(rs.getString("amount"));
                workOrderStatement.setOutstanding_balance(rs.getString("outstanding_balance"));
                workOrderStatement.setOther_item(rs.getString("other_item"));
                workOrderStatement.setOther_item_amt(rs.getString("other_item_amt"));
                workOrderStatement.setCutting_charges(rs.getString("cutting_charges"));
                workOrderStatement.setTotal(rs.getString("total"));
                workOrderStatement.setDeduction(rs.getString("deduction"));
                workOrderStatement.setDeduction_amt(rs.getString("deduction_amt"));
                workOrderStatement.setNet_total(rs.getString("net_total"));
                workOrderStatement.setAmt_recieved(rs.getString("amt_recieved"));
                workOrderStatement.setBalance_amt(rs.getString("balance_amt"));
                workOrderDetList.add(workOrderStatement);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : getCutWorkOrderDetails() :" + e);
        }

        return workOrderDetList;
    }

    public boolean savePrintWorkOrderStatement(WorkOrderStatement workOrderStatement) {

        boolean error = false;
        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt = null;

        try {
            String sql = "INSERT INTO work_order_statement(work_order_no, job_name, customer, job_date, rate, plate, design, quantity, amount, outstanding_balance, other_item, other_item_amt, cutting_charges, total, deduction, deduction_amt, net_total, amt_recieved, balance_amt, userid, process) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1, workOrderStatement.getWork_order_no());
            prepstmt.setString(2, workOrderStatement.getDescription());
            prepstmt.setString(3, workOrderStatement.getCustomer());
            prepstmt.setString(4, workOrderStatement.getJobdate());
            prepstmt.setString(5, workOrderStatement.getRate());
            prepstmt.setString(6, workOrderStatement.getPlate());
            prepstmt.setString(7, workOrderStatement.getDesign());
            prepstmt.setString(8, workOrderStatement.getQuantity());
            prepstmt.setString(9, workOrderStatement.getAmount());
            prepstmt.setString(10, workOrderStatement.getOutstanding_balance());
            prepstmt.setString(11, workOrderStatement.getOther_item());
            prepstmt.setString(12, workOrderStatement.getOther_item_amt());
            prepstmt.setString(13, workOrderStatement.getCutting_charges());
            prepstmt.setString(14, workOrderStatement.getTotal());
            prepstmt.setString(15, workOrderStatement.getDeduction());
            prepstmt.setString(16, workOrderStatement.getDeduction_amt());
            prepstmt.setString(17, workOrderStatement.getNet_total());
            prepstmt.setString(18, workOrderStatement.getAmt_recieved());
            prepstmt.setString(19, workOrderStatement.getBalance_amt());
            prepstmt.setString(20, workOrderStatement.getUserid());
            prepstmt.setString(21, workOrderStatement.getProcess());
            prepstmt.executeUpdate();

        } catch (SQLException e) {

            error = true;

            if (e.toString().contains("Duplicate")) {

                JOptionPane.showMessageDialog(null, "Work statement alread saved for this work order.");

            } else {

                JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : saveWorkOrderStatement() :" + e);
            }
        } finally {

            try {
                if (prepstmt != null) {

                    prepstmt.close();
                }
                if (con != null) {

                    con.close();
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : saveWorkOrderStatement() :" + ex);
            }
        }

        return error;
    }

    //Update workorder statement to 'work_order_statement'
    public boolean updateWorkOrderStatement(WorkOrderStatement workOrderStatement) {
        boolean error = false;
        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt = null;

        try {
            String sql = "UPDATE work_order_statement SET work_order_no=?, job_name=?, customer=?, job_date=?, rate=?, plate=?, design=?, quantity=?, amount=?, outstanding_balance=?, other_item=?, other_item_amt=?, cutting_charges=?, total=?, deduction=?, deduction_amt=?, net_total=?, amt_recieved=?, balance_amt=?, userid=?, process=? WHERE work_order_no=? ";
            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1, workOrderStatement.getWork_order_no());
            prepstmt.setString(2, workOrderStatement.getDescription());
            prepstmt.setString(3, workOrderStatement.getCustomer());
            prepstmt.setString(4, workOrderStatement.getJobdate());
            prepstmt.setString(5, workOrderStatement.getRate());
            prepstmt.setString(6, workOrderStatement.getPlate());
            prepstmt.setString(7, workOrderStatement.getDesign());
            prepstmt.setString(8, workOrderStatement.getQuantity());
            prepstmt.setString(9, workOrderStatement.getAmount());
            prepstmt.setString(10, workOrderStatement.getOutstanding_balance());
            prepstmt.setString(11, workOrderStatement.getOther_item());
            prepstmt.setString(12, workOrderStatement.getOther_item_amt());
            prepstmt.setString(13, workOrderStatement.getCutting_charges());
            prepstmt.setString(14, workOrderStatement.getTotal());
            prepstmt.setString(15, workOrderStatement.getDeduction());
            prepstmt.setString(16, workOrderStatement.getDeduction_amt());
            prepstmt.setString(17, workOrderStatement.getNet_total());
            prepstmt.setString(18, workOrderStatement.getAmt_recieved());
            prepstmt.setString(19, workOrderStatement.getBalance_amt());
            prepstmt.setString(20, workOrderStatement.getUserid());
            prepstmt.setString(21, workOrderStatement.getProcess());
            prepstmt.setString(22, workOrderStatement.getWork_order_no());
            prepstmt.executeUpdate();
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : saveWorkOrderStatement() :" + e);
        } finally {
            try {
                if (prepstmt != null) {
                    prepstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
            }
        }

        return error;
    }

    public List<WorkOrderStatement> getWorkOrderStatementsForCustomer(String customerId) {

        @SuppressWarnings("CollectionWithoutInitialCapacity")
        List<WorkOrderStatement> workOrderStatementsForCustomerList = new ArrayList<>();

        Connection con = DatabaseConnection.createConnection();
        PreparedStatement prepstmt;
        ResultSet rs;

        try {
            String sql = "SELECT\n"
                    + "  `id`,\n"
                    + "  `work_order_no`,\n"
                    + "  `job_name`,\n"
                    + "  `customer`,\n"
                    + "  `job_date`,\n"
                    + "  `rate`,\n"
                    + "  `plate`,\n"
                    + "  `design`,\n"
                    + "  `quantity`,\n"
                    + "  `amount`,\n"
                    + "  `outstanding_balance`,\n"
                    + "  `other_item`,\n"
                    + "  `other_item_amt`,\n"
                    + "  `cutting_charges`,\n"
                    + "  `total`,\n"
                    + "  `deduction`,\n"
                    + "  `deduction_amt`,\n"
                    + "  `net_total`,\n"
                    + "  `amt_recieved`,\n"
                    + "  `balance_amt`,\n"
                    + "  `userid`,\n"
                    + "  `process`,\n"
                    + "  `datetime`\n"
                    + "FROM\n"
                    + "  `work_order_statement`\n"
                    + "WHERE `customer` LIKE '" + customerId + "%';";
            
            System.out.println(sql);

            prepstmt = con.prepareStatement(sql);
            rs = prepstmt.executeQuery(sql);
            while (rs.next()) {

                WorkOrderStatement tempWorkOrderStatement = new WorkOrderStatement();
                tempWorkOrderStatement.setId(rs.getString("id"));
                tempWorkOrderStatement.setWork_order_no(rs.getString("work_order_no"));
                tempWorkOrderStatement.setDescription(rs.getString("job_name"));
                tempWorkOrderStatement.setCustomer(customerId);
                tempWorkOrderStatement.setJobdate(rs.getString("job_date"));
                tempWorkOrderStatement.setRate(rs.getString("rate"));

                tempWorkOrderStatement.setPlate(rs.getString("plate"));

                tempWorkOrderStatement.setDesign(rs.getString("design"));
                tempWorkOrderStatement.setQuantity(rs.getString("quantity"));

                tempWorkOrderStatement.setAmount(rs.getString("amount"));

                tempWorkOrderStatement.setOutstanding_balance(rs.getString("outstanding_balance"));

                tempWorkOrderStatement.setOther_item(rs.getString("other_item"));
                tempWorkOrderStatement.setOther_item_amt(rs.getString("other_item_amt"));
                tempWorkOrderStatement.setCutting_charges(rs.getString("cutting_charges"));
                tempWorkOrderStatement.setTotal(rs.getString("total"));
                tempWorkOrderStatement.setDeduction(rs.getString("deduction"));
                tempWorkOrderStatement.setDeduction_amt(rs.getString("deduction_amt"));
                tempWorkOrderStatement.setNet_total(rs.getString("net_total"));
                tempWorkOrderStatement.setAmt_recieved(rs.getString("amt_recieved"));
                tempWorkOrderStatement.setBalance_amt(rs.getString("balance_amt"));
                tempWorkOrderStatement.setUserid(rs.getString("userid"));
                tempWorkOrderStatement.setProcess(rs.getString("process"));
                tempWorkOrderStatement.setDatetime(rs.getString("datetime"));

                workOrderStatementsForCustomerList.add(tempWorkOrderStatement);
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "WorkOrderStatement_DAL : getCutWorkOrderDetails() :" + e);
        }
        return workOrderStatementsForCustomerList;
    }
}
