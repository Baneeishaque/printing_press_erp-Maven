package DSST007_1_CUS13.pll;

import java.sql.*;

public class DatabaseConnection {
	private static Connection conn;
	public static Connection createConnection()
	{
            try
            {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dsst007.1_cus13?useSSL=false","root","ds1414a72c8");
            }
            catch(SQLException e)
            {
                    System.out.println(e);

            }
            return conn;
	}

}

