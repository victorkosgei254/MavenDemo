package com.kosgei;
import java.sql.*;

public class DB {
   
    public  void connectToDB(String databaseName, String tableName,String userName, String userPassword)
    {
        String baseURL = "jdbc:mysql://localhost:3306/";
       String dbQuery = baseURL + databaseName;
        try
        {
            Connection con = DriverManager.getConnection( dbQuery,userName,userPassword);
            Statement query = con.createStatement();
            ResultSet rs = query.executeQuery("SELECT * FROM "+databaseName+"."+tableName);
            System.out.println(rs);
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" \t" + rs.getString(2)+" \t"+rs.getString(3));
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        }
        
        
    }
    


}
