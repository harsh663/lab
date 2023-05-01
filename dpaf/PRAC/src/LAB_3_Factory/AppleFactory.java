/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_3_Factory;

/**
 *
 * @author user1
 */
public abstract class AppleFactory {
    public abstract IPhone getPhone(String phone);
    public abstract MacBook getLaptop(String laptop);
}
