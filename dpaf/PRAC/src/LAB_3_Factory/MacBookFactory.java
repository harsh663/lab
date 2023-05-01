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
public class MacBookFactory extends AppleFactory  {

    MacBookFactory() {
    }

    @Override
    public IPhone getPhone(String phone) {
        return null;
    }

    @Override
    public MacBook getLaptop(String laptop) {
        if(laptop.equals("MacBook16")){
            return new MacBook16();
        }else if(laptop.equals("MacBook16 Pro")){
            return new MacBook16_Pro();
        }
        return null;
    }
    
}
