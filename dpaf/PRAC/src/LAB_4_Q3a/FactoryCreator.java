/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_4_Q3a;


public class FactoryCreator {
    public static CharacterFactory getFactory(String choice){
        if(choice.equals("2D")){
            return new TwoDCharacterFactory();
        }else if(choice.equals("3D")){
            return new ThreeDCharacterFactory();
        }
        return null;
    }
}