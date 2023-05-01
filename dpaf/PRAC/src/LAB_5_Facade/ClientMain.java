
package LAB_5_Facade;
import java.util.*;

public class ClientMain {

    public static void main(String[] args) {
        HotelManager hm = new HotelManager();
        System.out.println("Place the Order");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if(choice.equals("Pizza")){
            ItalianFood food = new ItalianFood();
            hm.orderedItalianFood(food);
        }else if(choice.equals("Manchurian")){
            ChineseFood food = new ChineseFood();
            hm.orderedChineseFood(food);
        }
    }
}
