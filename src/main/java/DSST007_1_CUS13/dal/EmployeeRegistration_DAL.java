/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;

import DSST007_1_CUS13.pll.DatabaseConnection;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author praveen
 */
public class EmployeeRegistration_DAL 
{

    String operation = null;
    static boolean proc_stat = false;
    static boolean error = false;
    static int row = 0;
    
    //Save employee details to database-----------------------------------------
    public void saveEmployeeDetails(String employee_id, String employee_name, String photo, String address, String city, String district, String state, String country, String pincode, String mobile, String landline, String email, String department, String designation, String userid, String user_type, String institution_id, String image_format, String salary)
    {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        
        try
        {
            
            FileInputStream fis = null;
            
            con = DatabaseConnection.createConnection();
            
            String sql="INSERT INTO employee_registration(employee_id, employee_name, photo, address, city, district, state, country, pincode, mobile, landline, email, department, designation, userid, user_type, institution_id, image_format, salary) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepstmt = con.prepareStatement(sql);
            
            prepstmt.setString(1, employee_id);
            prepstmt.setString(2, employee_name);
            //String to BLOB
            Blob blobData = null;
            if (photo != null) 
            {
                
                byte[] byteData = photo.getBytes("UTF-8");//Better to specify encoding
                blobData = con.createBlob();
                blobData.setBytes(1, byteData);
                prepstmt.setBlob(3, blobData);

            } else {

                prepstmt.setBlob(3, blobData);
                image_format = null;

            }
            
            prepstmt.setString(4, address);
            prepstmt.setString(5, city);
            prepstmt.setString(6, district);
            prepstmt.setString(7, state);
            prepstmt.setString(8, country);
            prepstmt.setString(9, pincode);
            prepstmt.setString(10, mobile);
            prepstmt.setString(11, landline);
            prepstmt.setString(12, email);
            prepstmt.setString(13, department);
            prepstmt.setString(14, designation);
            prepstmt.setString(15, designation);
            prepstmt.setString(16, user_type);
            prepstmt.setString(17, institution_id);
            prepstmt.setString(18, image_format);
            prepstmt.setString(19, salary);
            
            row = prepstmt.executeUpdate();
            
            proc_stat = true;
            
        }
        catch(Exception e)
        {
         
            JOptionPane.showMessageDialog(null, e);
            error = true;
            
        }
        
    }
    
    //Return operation status --------------------------------------------------
    public String operation_status()
    {
    
        if(proc_stat == true && error == false && row != 0)
        {
            
            operation = "success";
            
        }
        else
        {
            
            operation = "fail";
            
        }
        
        return operation;
        
    }
    
    
}
