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
public class TwoDCharacterFactory extends CharacterFactory {

    @Override
    public TwoDCharacter get2DCharacter(String choice) {
        switch (choice) {
            case "Chota Bheem":
                return (TwoDCharacter) new ChotaBheem2D();
            case "Kalia":
                return (TwoDCharacter) new Kalia2D();
            case "Chutki":
                return (TwoDCharacter) new Chutki2D();
            default:
                break;
        }
        return null;
    }

    @Override
    public ThreeDCharacter get3DCharacter(String choice) {
        return null;
    }
    
}
