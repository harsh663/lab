/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1;
import java.rmi.*;
/**
 *
 * @author harsh
 */
public interface Adder extends Remote
{
    public int add(int a,int b)throws RemoteException;
}
