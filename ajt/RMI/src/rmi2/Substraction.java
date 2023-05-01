/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author harsh
 */
public interface Substraction extends Remote {
    
    public int Sub(int a,int b)throws RemoteException;
    public int Add(int a,int b)throws RemoteException;
    public int Mul(int a,int b)throws RemoteException;
    public int Div(int a,int b)throws RemoteException;

    
}
