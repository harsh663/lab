/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author harsh
 */
public class Server extends UnicastRemoteObject implements Substraction {

    @Override
    public int Sub(int a, int b) throws RemoteException{
        int c = a - b;
        return c;
    }
    
    @Override
    public int Mul(int a, int b) throws RemoteException{
        int c = a * b;
        return c;
    }
    
    @Override
    public int Div(int a, int b) throws RemoteException{
        int c = a/b;
        return c;
    }
    
    @Override
    public int Add(int a, int b) throws RemoteException{
        int c = a + b;
        return c;
    }

    public Server()throws RemoteException {
    }

    public static void main(String[] args) throws RemoteException {

        try {
            Registry reg = LocateRegistry.createRegistry(1088);
            Server s = new Server();
            reg.rebind("sub", s);
            
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
