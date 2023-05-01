/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author harsh
 */
public class Server extends UnicastRemoteObject implements add {

    public Server() throws RemoteException {

    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1098);
            Server s = new Server();
            reg.rebind("harsh", s);
            System.out.println("server is ready!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
