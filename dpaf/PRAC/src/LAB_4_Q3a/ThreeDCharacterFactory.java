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
public class ThreeDCharacterFactory extends CharacterFactory {

    @Override
    public TwoDCharacter get2DCharacter(String choice) {
        return null;
    }

    @Override
    public ThreeDCharacter get3DCharacter(String choice) {
        switch (choice) {
            case "Chota Bheem":
                return (ThreeDCharacter) new ChotaBheem3D();
            case "Kalia":
                return (ThreeDCharacter) new Kalia3D();
            case "Chutki":
                return (ThreeDCharacter) new Chutki3D();
            default:
                break;
        }
        return null;    
    }

}
