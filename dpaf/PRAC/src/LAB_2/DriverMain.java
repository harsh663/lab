package LAB_2;

public class DriverMain {

    public static void main(String[] args) {
        PrimeMinister pm1 = PrimeMinister.getInstance();
        PrimeMinister pm2 = PrimeMinister.getInstance();
        
        System.out.println(pm1.getName());
        System.out.println(pm2.getName());
    }
    
}
