/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**+
 *
 * @author harsh
 */
public class server extends UnicastRemoteObject implements Adder{

    public server() throws RemoteException {
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        int c = a+b;
        return c;
    }
    
    public static void main(String[] args) {
         try {
             Registry reg=LocateRegistry.createRegistry(1099);
             server obj=new server();
             reg.rebind("hello", obj);
             System.out.println("Server is ready");
             
        } catch (Exception e) {
             System.out.println("Exception "+e);
        }
    }
}
