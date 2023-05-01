/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author harsh
 */
public class Client {
    
    public static void main(String[] args)throws RemoteException {
        Client c = new Client();
        c.connect();
    }
    public void connect()throws RemoteException{
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",1088);
            Substraction sb= (Substraction)reg.lookup("sub");
            
            Scanner sc= new Scanner(System.in);
            System.out.println("enter 1st no");
            int a=sc.nextInt();
            System.out.println("enter 2nd no");
            int b=sc.nextInt();
            
            System.out.println("Sub is "+sb.Sub(a, b));
            System.out.println("Mul is "+sb.Mul(a, b));
            System.out.println("Div is "+sb.Div(a, b));
            System.out.println("Add is "+sb.Add(a, b));

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
