package LAB_2;

public class PrimeMinister {
    private final String name;
    /*private static PrimeMinister pm;
    
    private PrimeMinister(String n){
        this.name = n;
    }
    
    public static PrimeMinister getInstance(){
        if(pm ==null){
            pm = new PrimeMinister("Narendra Modi");
        }
        return pm;
    }*/
    
    private PrimeMinister(String n){
        this.name = n;
    }

    public static class pmHolder{
        public static PrimeMinister pm = new PrimeMinister("Narendra Modi");
    } 
    
    public static PrimeMinister getInstance(){
        return pmHolder.pm;
    }
    
    public String getName() {
        return name;
    }
    
}
