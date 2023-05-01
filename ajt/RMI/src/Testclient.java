
import java.rmi.*;

public class Testclient {

    public static void main(String[] args) {
        try {
            TestI tsi = (TestI) Naming.lookup(
                    "rmi://localhost:1099/Test");
            System.out.println("Result = " + tsi.hello("How r u"));
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
