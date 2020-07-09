/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSST007_1_CUS13.dal;


import DSST007_1_CUS13.bll.EmployeeViewEdit_BLL;
import DSST007_1_CUS13.bll.EmployeeViewEdit_BLL.GetEmployeeNameAndID;
import DSST007_1_CUS13.pll.DatabaseConnection;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author praveen
 */
public class EmployeeViewEdit_DAL {
    
    String operation = null;
    static boolean proc_stat = false;
    static boolean error = false;
    static int row = 0;
    
    
    
       
    public ArrayList<GetEmployeeNameAndID> getEmployeeNamesFromDB()
    {
        
        ArrayList<GetEmployeeNameAndID> empNameArr = new ArrayList();
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        try
        {
         
            con = DatabaseConnection.createConnection();

            String sql_1 = "SELECT employee_name, employee_id FROM employee_registration ";
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {

                EmployeeViewEdit_BLL employeeViewEdit_BLL = new EmployeeViewEdit_BLL();

                empNameArr.add(employeeViewEdit_BLL.new GetEmployeeNameAndID(rs.getString("employee_name"), rs.getString("employee_id")));

            }
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,"EmployeeViewEdit_DAL : getEmployeeNamesFromDB: "+e);
            
        }
        finally
        {
            
            try
            {
                
                if(rs != null)
                {
                    
                    rs.close();
                    
                }
                if(prepstmt != null)
                {
                    
                    prepstmt.close();
                    
                }
                if(con != null)
                {
                    
                    con.close();
                    
                }
                
            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null, ex);
                
            }
            
        }
        
        return empNameArr;	
        
    }
    
    public ArrayList<String> getEmployeeDetailsFromDB(String empID)
    {
        
        ArrayList<String> empDetArr = new ArrayList();
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        try
        {
          
            con = DatabaseConnection.createConnection();
            String sql_1 = "SELECT employee_id"
                    + ",employee_name"
                    + ",photo"
                    + ",address"
                    + ",city"
                    + ",district"
                    + ",state"
                    + ",country"
                    + ",pincode"
                    + ",mobile"
                    + ",landline"
                    + ",email"
                    + ",department"
                    + ",designation"
                    + ",image_format"
                    + ",id"
                    + " FROM employee_registration WHERE employee_id = '"+empID+"' ";
            
            prepstmt = con.prepareStatement(sql_1);
            rs = prepstmt.executeQuery();
            while(rs.next())
            {

                empDetArr.add(rs.getString("employee_id"));
                empDetArr.add(rs.getString("employee_name"));
                
                if(rs.getBlob("photo") ==  null)
                {
                    
                    empDetArr.add("NULL");
                    
                }
                else
                {
                    //Blob to String
                    Blob blob = rs.getBlob("photo");
                    String photostr = new String(blob.getBytes(1l, (int) blob.length()));
                    empDetArr.add(photostr);
                    
                }

                empDetArr.add(rs.getString("address"));
                empDetArr.add(rs.getString("city"));
                empDetArr.add(rs.getString("district"));
                empDetArr.add(rs.getString("state"));
                empDetArr.add(rs.getString("country"));
                empDetArr.add(rs.getString("pincode"));
                empDetArr.add(rs.getString("mobile"));
                empDetArr.add(rs.getString("landline"));
                empDetArr.add(rs.getString("email"));
                empDetArr.add(rs.getString("department"));
                empDetArr.add(rs.getString("designation"));
                empDetArr.add(rs.getString("image_format"));
                empDetArr.add(rs.getString("id"));

            }
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,"EmployeeViewEdit_DAL : getEmployeeDetailsFromDB: "+e);
            
        }
        finally
        {
            
            try
            {
                
                if(rs != null)
                {
                    
                    rs.close();
                    
                }
                if(prepstmt != null)
                {
                    
                    prepstmt.close();
                    
                }
                if(con != null)
                {
                    
                    con.close();
                    
                }
                
            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null, ex);
                
            }
            
        }
        
        return empDetArr;	
        
    }
    
    public ArrayList<String> getDepartmentsFromDB()
    {
        
        ArrayList<String> departmentArr = new ArrayList<>();
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        try
        {
         
		    con = DatabaseConnection.createConnection();
		   
		    String sql_1 = "SELECT DISTINCT department FROM employee_registration ";
		    prepstmt = con.prepareStatement(sql_1);
		    rs = prepstmt.executeQuery();
		    while(rs.next())
		    {
		        
		        departmentArr.add(rs.getString("department"));
		       
		    }
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,"EmployeeViewEdit_DAL : getDepartmentsFromDB: "+e);
            
        }
        finally
        {
            
            try
            {
                
                if(rs != null)
                {
                    
                    rs.close();
                    
                }
                if(prepstmt != null)
                {
                    
                    prepstmt.close();
                    
                }
                if(con != null)
                {
                    
                    con.close();
                    
                }
                
            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null, ex);
                
            }
            
        }
        
        return departmentArr;
    }
    
    
    public ArrayList<String> getDesignationsFromDB()
    {
        
        ArrayList<String> designationsArr = new ArrayList<>();
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        ResultSet rs = null;
        
        try
        {
         
		    con = DatabaseConnection.createConnection();
		   
		    String sql_1 = "SELECT DISTINCT designation FROM employee_registration ";
		    prepstmt = con.prepareStatement(sql_1);
		    rs = prepstmt.executeQuery();
		    while(rs.next())
		    {
		        
		        designationsArr.add(rs.getString("designation"));
		       
		    }
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,"EmployeeViewEdit_DAL : getDesignationsFromDB: "+e);
            
        }
        finally
        {
            
            try
            {
                
                if(rs != null)
                {
                    
                    rs.close();
                    
                }
                if(prepstmt != null)
                {
                    
                    prepstmt.close();
                    
                }
                if(con != null)
                {
                    
                    con.close();
                    
                }
                
            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null, ex);
                
            }
            
        }
        
        return designationsArr;
    }
    
    public void passEmpDataToDBForUpdate(String id, String employee_id, String employee_name, String photo, String address, String city, String district, String state, String country, String pincode, String mobile, String landline, String email, String department, String designation, String userid, String user_type, String institution_id, String image_format, String salary)
    {
        
        System.out.println("employee_id"+ employee_id);
        System.out.println("employee_name"+ employee_name);
        System.out.println("id: "+id);
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        
        try
        {
            
            con = DatabaseConnection.createConnection();
       
            String sql="UPDATE employee_registration SET "
                    + "employee_id = ?,"
                    + "employee_name = ?,"
                    + "photo = ?,"
                    + "address = ?,"
                    + "city = ?,"
                    + "district = ?,"
                    + "state = ?,"
                    + "country = ?,"
                    + "pincode = ?,"
                    + "mobile = ?,"
                    + "landline = ?,"
                    + "email = ?,"
                    + "department = ?,"
                    + "designation = ?,"
                    + "userid = ?,"
                    + "user_type = ?,"
                    + "institution_id = ?,"
                    + "image_format = ?,"
                    + "salary = ?"
                    + " WHERE id = ? ";
            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1,employee_id);
            prepstmt.setString(2,employee_name);
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
            prepstmt.setString(4,address);
            prepstmt.setString(5,city);
            prepstmt.setString(6,district);
            prepstmt.setString(7,state);
            prepstmt.setString(8,country);
            prepstmt.setString(9,pincode);
            prepstmt.setString(10,mobile);
            prepstmt.setString(11,landline);
            prepstmt.setString(12,email);
            prepstmt.setString(13,department);
            prepstmt.setString(14,designation);
            prepstmt.setString(15,userid);
            prepstmt.setString(16,user_type);
            prepstmt.setString(17,institution_id);
            prepstmt.setString(18,image_format);
            prepstmt.setString(19,salary);
            prepstmt.setString(20,id);
            
            row = prepstmt.executeUpdate();
            
            proc_stat = true;
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, "EmployeeViewEdit_DAL : passEmpDateToDBForUpdate: "+e);
            error = true;
            
        }
        finally {

            try {

                if (con != null) {

                    con.close();

                }

                if (prepstmt != null) {

                    prepstmt.close();

                }

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex);

            }

        }
        
    }
    
    public void passEmpDetToDBForDelete(String id)
    {
        
        Connection con = null;
        PreparedStatement prepstmt = null;
        
        try
        {
            
            con = DatabaseConnection.createConnection();
       
            String sql="DELETE FROM employee_registration WHERE id = ?";
            prepstmt = con.prepareStatement(sql);

            prepstmt.setString(1,id);

            row = prepstmt.executeUpdate();
            
            proc_stat = true;
            
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null, "EmployeeViewEdit_DAL : passEmpDetToDBForDelete: "+e);
            error = true;
            
        }
        finally
        {
            
            try
            {
                
                if(con != null)
                {
                    
                    con.close();
                    
                }
               
                if(prepstmt != null)
                {
                    
                    prepstmt.close();
                    
                }
                
            }
            catch(Exception ex)
            {
                
                JOptionPane.showMessageDialog(null,ex);
                
            }
            
        }
        
    }
    
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
    
    


