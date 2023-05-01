/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1;

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
    public static void main(String[] args) throws RemoteException,NotBoundException{
        Client c=new Client();
        c.connectRemote();
    }

    private void connectRemote() throws RemoteException,NotBoundException {
        try {
            Scanner sc=new Scanner(System.in);
            Registry reg=LocateRegistry.getRegistry("localhost",1099);
            Adder ad=(Adder)reg.lookup("hello");
            
            System.out.println("enter two number");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Addition is "+ad.add(a,b));

        } catch (Exception e) {
            System.out.println("Exception is ctrated in client "+e);
        }
    }
}
