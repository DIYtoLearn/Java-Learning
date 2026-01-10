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

        // check
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


            BigInteger a = new BigInteger("0");
            BigInteger b = new BigInteger("1");
            BigInteger c = new BigInteger("1");

            //System.out.print("1 1 "); // Un comment this if you want to print the fibonacci series

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

        BigInteger bii = new BigInteger("1203201049912091499283294882931882919849174934295739281010010001415010592853098525");
        BigFIBO bF = new BigFIBO(bii);
        bF.FiboSeries();

    }
}