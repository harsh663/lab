/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author harsh
 */
public class Client {
    public static void main(String[] args)throws RemoteException,NotBoundException {
        Client c=new Client();
        c.connect();
              
    }

    public void connect()throws RemoteException,NotBoundException{
        try{
            Registry reg=LocateRegistry.getRegistry("localhost",1098);
            add ad=(add)reg.lookup("harsh");
            System.out.println("method is"+ad.add(10, 20));
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
