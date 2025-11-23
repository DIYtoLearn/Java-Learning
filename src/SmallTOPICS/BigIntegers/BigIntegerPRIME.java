package SmallTOPICS.BigIntegers;
import java.math.BigInteger;

class Solution2 {
    public static int nextPrime(int n) {

        // convert input to BigInteger
        BigInteger nBig = BigInteger.valueOf(n);

        // handle small/negative inputs explicitly
        if (nBig.compareTo(BigInteger.ONE) < 0) {
            return 2;
        }

        // nextProbablePrime() returns the first prime strictly greater than the argument
        BigInteger next = nBig.nextProbablePrime();

        // safety: ensure it fits in int (throw or handle as needed)
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        if (next.compareTo(intMax) > 0) {
            throw new ArithmeticException("next prime does not fit into int");
        }

        return next.intValue();

    }
}

public class BigIntegerPRIME {
    public static void main(String[] args) {

        int req2 = Solution2.nextPrime(-11);
        System.out.println("Next Prime: "+req2);

    }
}