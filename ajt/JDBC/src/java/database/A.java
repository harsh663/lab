/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
/**
 *
 * @author harsh
 */
public class A {
    
    public static void main(String[] args) {
        try{
        
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DB","harsh","harsh");
            Statement st=con.createStatement();
            
            //ADD NEW ENTRY IN DATABASE
            st.executeUpdate("INSERT INTO A VALUES ('KETAN',33)");

            ResultSet rs=st.executeQuery("SELECT * FROM A");
            
            while(rs.next())
            {
                String name=rs.getString("NAME");
                int marks = rs.getInt("MARKS");
                
                System.out.println("name "+name+" marks = "+marks);
            }
            
         
                    
            rs.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
