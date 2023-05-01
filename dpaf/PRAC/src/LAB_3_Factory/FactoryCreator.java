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
public class FactoryCreator {
    public static AppleFactory getFactory(String choice){
        if(choice.equals("IPhone")){
            return new IPhoneFactory();
        }else if(choice.equals("MacBook")){
            return new MacBookFactory();
        }
        return null;
    }
}
