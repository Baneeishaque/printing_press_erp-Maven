/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.bll;

import DSST007_1_CUS13.dal.EmployeeRegistration_DAL;



/**
 *
 * @author praveen
 */
public class EmployeeRegistration_BLL 
{
    
    //Pass employee details to EmployeeRegistration_DAL-------------------------
    public void getEmployeeDetails(String employee_id, String employee_name, String photo, String address, String city, String district, String state, String country, String pincode, String mobile, String landline, String email, String department, String designation, String userid, String user_type, String institution_id, String image_format, String salary)
    {
      
        EmployeeRegistration_DAL empRegistration_DAL = new EmployeeRegistration_DAL();
        empRegistration_DAL.saveEmployeeDetails(employee_id, employee_name, photo, address, city, district, state, country, pincode, mobile, landline, email, department, designation, userid, user_type, institution_id, image_format, salary);
        
    }
    
    //Get operation status -----------------------------------------------------
    public String get_operation_status()
    {
        
        EmployeeRegistration_DAL empRegistration_DAL = new EmployeeRegistration_DAL();
        return empRegistration_DAL.operation_status();
        
    }
    
}
