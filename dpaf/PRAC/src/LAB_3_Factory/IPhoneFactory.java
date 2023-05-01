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
public class IPhoneFactory extends AppleFactory {

    IPhoneFactory() {
    }

    @Override
    public IPhone getPhone(String phone) {
        if(phone.equals("IPhone X")){
            return new IPhone_X();
        }else if(phone.equals("IPhone 11")){
            return new IPhone_11();
        }
        return null;
    }

    @Override
    public MacBook getLaptop(String laptop) {
        return null;
    }
    
}
