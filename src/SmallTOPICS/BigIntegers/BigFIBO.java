package SmallTOPICS.BigIntegers;
import java.math.BigInteger;

public class BigFIBO {

    BigInteger bii;
    BigFIBO(BigInteger _bii)
    {
        bii = _bii;
    }

    // 0 1 1 2 3 5 8 13 21 34 55 89 144
    protected void FiboSeries()
    {
        BigInteger a ;
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");

        int converting =  bii.intValue();
        System.out.print("1 1 ");

        int req_num = 1;
        for(int i=3; i<=converting; i++)
        {
            a = b.add(c);
            b = c;
            c = a;

            System.out.print(a+" ");
            req_num = a.intValue();
        }
        System.out.println();
        System.out.println("nth Fibo number "+req_num);
    }
}

class checking {
    public static void main(String[] args) {

        BigInteger bii = new BigInteger("10");
        BigFIBO bF = new BigFIBO(bii);
        bF.FiboSeries();

    }
}