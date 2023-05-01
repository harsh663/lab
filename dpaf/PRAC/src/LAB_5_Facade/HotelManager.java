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
public class HotelManager {
    private final ChineseChef chineseChef;
    private final ItalianChef italianChef;
    
    public HotelManager(){
        chineseChef = new ChineseChef();
        italianChef = new ItalianChef();
    }
    
    public void orderedChineseFood(ChineseFood food){
        chineseChef.prepareFood(food);
    }
    
    public void orderedItalianFood(ItalianFood food){
        italianChef.prepareFood(food);
    }
}
