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
import java.util.Scanner;

/**
 *
 * @author harsh
 */
public class PrepareStmt {

    public static void main(String[] args) {
        try {

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DB", "harsh", "harsh");
            
            //store dynamic data
            PreparedStatement st = con.prepareStatement("INSERT INTO A VALUES (?,?)");
            
            //take dynamic input
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name");
            String name=sc.next();
            System.out.println("enter your marks");
            int marks=sc.nextInt();
            
            
            //set the dynamic data
            st.setString(1, name);
            st.setInt(2,marks);
             st.executeUpdate();
               
             
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
