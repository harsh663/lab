package LAB_3_Factory;

import java.util.*;

public class DriverMain {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Enter Which Apple Product You Want To Buy:");
        String c1 = sc1.nextLine();
        
        AppleFactory fact;
        IPhone iPhone;
        MacBook macBook;
        
        if(c1.equals("IPhone")){
            fact = FactoryCreator.getFactory("IPhone");
            System.out.println("Which IPhone You Want To Buy:");
            String c2 = sc2.nextLine();
            if(c2.equals("IPhone X")){
                iPhone = fact.getPhone("IPhone X");
                System.out.println(iPhone.getIPhone());
            }
            else if(c2.equals("IPhone 11")){
                iPhone = fact.getPhone("IPhone 11");
                System.out.println(iPhone.getIPhone());
            }
        }
        else if(c1.equals("MacBook")){
            fact = FactoryCreator.getFactory("MacBook");
            System.out.println("Which MacBook You Want To Buy:");
            String c2 = sc2.nextLine();
            if(c2.equals("MacBook16")){
                macBook = fact.getLaptop("MacBook16");
                System.out.println(macBook.getMacBook());
            }
            else if(c2.equals("MacBook16 Pro")){
                macBook = fact.getLaptop("MacBook16 Pro");
                System.out.println(macBook.getMacBook());
            }
        }
    }
}
