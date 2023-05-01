
package LAB_4_Q3a;
import java.util.*;

public class DriverMain {

    public static void main(String[] args) {
       Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Enter Which Type of Character you want 2D or 3D:");
        String c1 = sc1.nextLine();
        
        CharacterFactory fact;
        TwoDCharacter twoD;
        ThreeDCharacter threeD;
        
        if(c1.equals("2D")){
            fact = FactoryCreator.getFactory(c1);
            System.out.println("Which 2D character you want:");
            String c2 = sc2.nextLine();
            twoD = fact.get2DCharacter(c2);
            twoD.render2D();
        }
        else if(c1.equals("3D")){
            fact = FactoryCreator.getFactory(c1);
            System.out.println("Which 3D character you want:");
            String c2 = sc2.nextLine();
            threeD = fact.get3DCharacter(c2);
            threeD.render3D();
        }
    }
    
}
