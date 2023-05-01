/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author harsh
 */
public class create_db {

    public static void main(String arg[]) {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "harsh", "harsh");
            Statement st = con.createStatement();
            
           //CREATE TABLE
            st.executeUpdate("CREATE TABLE DB(ID INTEGER, NAME VARCHAR(20))");
            
            //inser data
            st.executeUpdate("INSERT INTO DB VALUES(101,'HARSH')");
            
            ResultSet rs=st.executeQuery("SELECT * FROM DB");
            
            while(rs.next())
            {
                
                System.out.println("id : "+rs.getInt("ID")+" Name : "+rs.getString("Name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
