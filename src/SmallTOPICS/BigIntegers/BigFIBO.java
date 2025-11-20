package SmallTOPICS.BigIntegers;
import java.math.BigInteger;

class BigFIBO {

    BigInteger bii;
    BigFIBO(BigInteger _bii)
    {
        bii = _bii;
    }

    // 0 1 1 2 3 5 8 13 21 34 55 89 144
    protected void FiboSeries()
    {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");

        int converting =  bii.intValue();
        //System.out.print("1 1 ");

        for(int i=3; i<=converting; i++)
        {
            a = b.add(c);
            b = c;
            c = a;

            System.out.println(a);

        }
        System.out.println();
        System.out.println("nth Fibo number "+a);
    }
}

class checking {
    public static void main(String[] args) {

        BigInteger bii = new BigInteger("1000000000");
        BigFIBO bF = new BigFIBO(bii);
        bF.FiboSeries();

    }
}