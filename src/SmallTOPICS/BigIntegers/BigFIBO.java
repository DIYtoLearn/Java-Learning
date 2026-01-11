package SmallTOPICS.BigIntegers;
import java.math.BigInteger;

class BigFIBO {

    BigInteger bii;
    BigFIBO(BigInteger _bii)
    {
        bii = _bii;
    }

    //1 1 2 3 5 8 13 21 34 55 89 144
    protected void FiboSeries()
    {

        // check for inputs lesser than or equal to 2
        if(bii.compareTo(BigInteger.TWO) < 0 || bii.compareTo(BigInteger.TWO) == 0)
        {
            if(bii.compareTo(BigInteger.ONE) < 0)
            {
                System.out.println("Invalid Input");
            }
            else
                System.out.println(1);

        }

        else {

            // Use Constants - Much more efficient than new BigInteger("0")
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            BigInteger c = BigInteger.ONE;

            //System.out.print("1 1 "); // Un comment this if you want to print the fibonacci series

            // Honestly we should never use BigInteger as the counter in a FOR LOOP
            // An int or long should be more than enough, as a long can hold up to 9 quintillion, so theoritically if we have a computer that can find 1 billion th Fibo number every second
            // Then it will take 292 Years to find the 9 quintillion th fibonacci number
            // The maximum value a long variable can hold is: 9,223,372,036,854,775,807 (approx. 9 quintillion).
            long bigValue = 12345678910L; // Suffix 'L' is necessary for values > 2,147,483,647 or more than 10 digits number
            Long myObjectLong = Long.valueOf(1234567890L); // For cases where an object is needed (e.g., with Java Collections)
            System.out.println(bigValue+" "+myObjectLong);

            BigInteger i;
            for (i = new BigInteger("2"); i.compareTo(bii) < 0; i= i.add(BigInteger.ONE)) {

                a = b.add(c);
                b = c;
                c = a;

                //System.out.println(a); // Un comment this if you want to print the fibonacci series

            }
            System.out.println();
            System.out.println("nth Fibo number " + a);
        }
    }
}

class checking {
    public static void main(String[] args) {

        BigInteger bii = new BigInteger("10");
        BigFIBO bF = new BigFIBO(bii);
        bF.FiboSeries();

    }
}