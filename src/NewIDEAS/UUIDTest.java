package NewIDEAS;
import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) throws InterruptedException {

        int n = 2;
        while(n>0)
        {
            Thread.sleep(1000);
            System.out.println(UUID.randomUUID());
            Thread.sleep(1000);
            n--;

            if(n == 0)
                System.out.println("Done....");
            Thread.sleep(1000);
        }
    }
}