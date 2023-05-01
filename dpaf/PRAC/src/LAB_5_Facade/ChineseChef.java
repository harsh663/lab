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
public class ChineseChef implements PrepareFood{

    @Override
    public void prepareFood(Food food) {
        ChineseFood chineseFood = (ChineseFood)food;
        System.out.println(chineseFood);
    }
    
}
