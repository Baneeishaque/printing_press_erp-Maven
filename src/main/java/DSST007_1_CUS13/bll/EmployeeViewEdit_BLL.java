/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.EmployeeViewEdit_DAL;
import java.util.ArrayList;

/**
 *
 * @author praveen
 */
public class EmployeeViewEdit_BLL {
    
    ArrayList<String> empNamesStrArr = new ArrayList<>();
   
    public ArrayList<String> getEmployeeNames()
    {
        
        EmployeeViewEdit_DAL employeeViewEditDAL = new EmployeeViewEdit_DAL();
        
        ArrayList<GetEmployeeNameAndID> empNamesArr = employeeViewEditDAL.getEmployeeNamesFromDB();
        
        for(int i = 0 ; i < empNamesArr.size() ; i ++)
        {
            
            String empName = empNamesArr.get(i).getEmpName();
            String id = empNamesArr.get(i).getEmpID();
            
            String empNameId = empName+" | "+id;
            
            empNamesStrArr.add(empNameId);
            
        }
        
        return empNamesStrArr;
        
    }
    
    public class GetEmployeeNameAndID
    {
        
        String empName;
        String empID;
        
        public GetEmployeeNameAndID(String empName, String empID)
        {
            
            this.empName = empName;
            this.empID = empID;
            
        }

        public String getEmpName() {
            return empName;
        }

        public String getEmpID() {
            return empID;
        }
        
    }
    
    public ArrayList<String> getEmployeeDetails(String empID)
    {
        
        EmployeeViewEdit_DAL employeeViewEdit_DAL = new EmployeeViewEdit_DAL();
        
        return employeeViewEdit_DAL.getEmployeeDetailsFromDB(empID);
        
    }
    
    public ArrayList<String> getDepartments()
    {
        
        EmployeeViewEdit_DAL employeeViewEdit_DAL = new EmployeeViewEdit_DAL();
        
        return employeeViewEdit_DAL.getDepartmentsFromDB();
        
    }
    
    public ArrayList<String> getDesignations()
    {
        
        EmployeeViewEdit_DAL employeeViewEdit_DAL = new EmployeeViewEdit_DAL();
        
        return employeeViewEdit_DAL.getDesignationsFromDB();
        
    }
    
    //Pass employee details for update -----------------------------------------
    public void passEmpDetForUpdate(String id, String employee_id, String employee_name, String photo, String address, String city, String district, String state, String country, String pincode, String mobile, String landline, String email, String department, String designation, String userid, String user_type, String institution_id, String image_format, String salary)
    {
        
        EmployeeViewEdit_DAL employeeViewEdit_DAL = new EmployeeViewEdit_DAL();
        
        employeeViewEdit_DAL.passEmpDataToDBForUpdate(id, employee_id, employee_name, photo, address, city, district, state, country, pincode, mobile, landline, email, department, designation, userid, user_type, institution_id, image_format, salary);
        
    }
    
    //Pass employee details for update -----------------------------------------
    public void passEmpDetForDelete(String id)
    {
        
        EmployeeViewEdit_DAL employeeViewEdit_DAL = new EmployeeViewEdit_DAL();
        
        employeeViewEdit_DAL.passEmpDetToDBForDelete(id);
        
    }
    
    //Get operation status -----------------------------------------------------
    public String get_operation_status()
    {
        
        EmployeeViewEdit_DAL employeeViewEdit_DAL = new EmployeeViewEdit_DAL();
        return employeeViewEdit_DAL.operation_status();
        
    }
    
}
