package GFG;
import java.util.Scanner;

class Numbers{

    int number;
    Numbers(int n)
    {
        number = n;
        //System.out.println(n+" "+number);
    }

    protected boolean prime()
    {

        if(number <= 1)
            return  false;
        else if(number <= 3)
            return true;
        else { // mathematical fact: if n has a divisor greater than √n, it must also have a corresponding divisor less than √n. Use that to limit your loop
            for(int i=2; i<= Math.sqrt(number); i++)
            {
                if(number % i == 0)
                    return false;

            }
            return  true;
        }
    }

}

public class PrimeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Numbers nm = new Numbers(x);
        boolean req = nm.prime();
        System.out.println(req);


    }
}