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
public class ItalianFood extends Food{
    
    public ItalianFood(){
        name = "Pizza";
        cost = "130 Rs.";
    }
    
    @Override
    public String toString(){
        return("Your italian food is ready\n\tName: " + this.name + "\n\tCost" + this.cost);
    }
}
