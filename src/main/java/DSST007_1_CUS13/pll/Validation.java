package DSST007_1_CUS13.pll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarvis
 */
public class Validation {
     public static boolean validateMobilePhone(String mobile)  
  {
       boolean status = false;
     String phone_pattern =  "\\d{10}"; 
     Pattern pattern = Pattern.compile(phone_pattern);
     Matcher matcher = pattern.matcher(mobile);
     if (matcher.matches())
     {
         status = true;
     }
     else
     {
         status = false;
     }
    return status; 
  }
   public static boolean validateDigit(String digit)  
  {
       boolean status = false;
     String phone_pattern = "\\d{10}"; 
    // String phone_pattern = " ^(|[0-9])$";
     Pattern pattern = Pattern.compile(phone_pattern);
     Matcher matcher = pattern.matcher(digit);
     if (matcher.matches())
     {
         status = true;
     }
     else
     {
         status = false;
     }
    return status; 
  }
   
   public static boolean validatePincode(String pin)  
  {
       boolean status = false;
     String Pincode_pattern = "\\d{6}"; 
    // String phone_pattern = " ^(|[0-9])$";
     Pattern pattern = Pattern.compile(Pincode_pattern);
     Matcher matcher = pattern.matcher(pin);
     if (matcher.matches())
     {
         status = true;
     }
     else
     {
         status = false;
     }
    return status; 
  }
   public static boolean validateEmail(String email) 
 {
     boolean email_status = false;
     String Email_pattern =  "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]"+  
                            "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"; 
     Pattern pattern = Pattern.compile(Email_pattern);
     Matcher matcher = pattern.matcher(email);
     if (matcher.matches())
     {
         email_status = true;
     }
     else
     {
         email_status = false;
     }
    return email_status; 
 }
   
    public static boolean validateWebsite(String website) 
 {
     boolean website_status = false;
     String website_pattern = "^([\\w\\.-]{1,}\\.([\\da-zA-Z-]{1,}\\.){1,}[\\da-zA-Z-]+$)?";
     Pattern pattern = Pattern.compile(website_pattern);
     Matcher matcher = pattern.matcher(website);
     if (matcher.matches())
     {
         website_status = true;
     }
     else
     {
         website_status = false;
     }
    return website_status; 
 }
    public static boolean validateAlphabet(String alphabet)  
  {
       boolean alphabet_status = false;
     String alphabet_pattern = "[a-zA-Z\\s']+"; 
     Pattern pattern = Pattern.compile(alphabet_pattern);
     Matcher matcher = pattern.matcher(alphabet);
     if (matcher.matches())
     {
        alphabet_status = true;
     }
     else
     {
       alphabet_status = false;
     }
    return alphabet_status; 
  } 
    

}