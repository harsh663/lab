/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_4_Q3a;

/**
 *
 * @author user1
 */
public abstract class CharacterFactory {
    public abstract TwoDCharacter get2DCharacter(String choice);
    public abstract ThreeDCharacter get3DCharacter(String choice);    
}
