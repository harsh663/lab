/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_5_Facade;

/**
 *
 * @author user1
 */
public class ChineseFood extends Food {
    
    public ChineseFood(){
        name = "Manchurian";
        cost = "100 Rs.";
    }
    
    @Override
    public String toString(){
        return("Your chinese food is ready\n\tName: " + this.name + "\n\tCost" + this.cost);
    }
}
