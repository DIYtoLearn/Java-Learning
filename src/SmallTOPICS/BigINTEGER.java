package SmallTOPICS;

import java.math.BigInteger;

class operation
{
    BigInteger bii;
    int chk;
    operation(BigInteger _bii)
    {
        bii = _bii;
    }

    operation()
    {
        chk = 5;

    }

    void OperationsPOSSIBLE()
    {
        BigInteger req = bii.add(bii);
        System.out.println("Addition "+req);

        req = bii.multiply(bii);
        System.out.println("Multiplication "+req);

        BigInteger bn = new BigInteger("2");
        req = bii.divide(bn);
        System.out.println("Divide "+req);

        req = bii.subtract(bii);
        System.out.println("Substraction "+req);

        BigInteger bnnw = new BigInteger("3");
        req = bii.remainder(bnnw);
        System.out.println("Remainder "+req);

    }

    protected void factorial()
    {

        int fact = 1;
        for(int i=1; i<=chk; i++)
        {
            fact = fact*i;

        }

        System.out.println("Factorial "+fact);
    }
}

public class BigINTEGER {
    public static void main(String[] args) {

        BigInteger bi3 = new BigInteger("81");

        int c = 134;
        BigInteger bi2 = BigInteger.valueOf(c);

        String str = "1432";
        BigInteger bi = new BigInteger(str);

        System.out.println(bi+" "+bi2+" "+bi3);

        operation op = new operation(bi);
        op.OperationsPOSSIBLE();

        operation op2 = new operation();
        op.factorial();
    }
}

