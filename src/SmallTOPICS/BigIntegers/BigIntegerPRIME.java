package SmallTOPICS.BigIntegers;
import java.math.BigInteger;

class Solution2 {
    public static int nextPrime(int n) {

        BigInteger n2 = BigInteger.valueOf(n);

        if(n2.compareTo(BigInteger.ONE) < 0)
        {
            return 2;
        }

        BigInteger next = n2.nextProbablePrime();
        return next.intValue();

    }
}

public class BigIntegerPRIME {
    public static void main(String[] args) {

        int req2 = Solution2.nextPrime(-11);
        System.out.println("Next Prime: "+req2);

    }
}
