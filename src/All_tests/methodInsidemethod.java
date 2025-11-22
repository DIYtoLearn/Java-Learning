package All_tests;
import java.math.BigInteger;

class Solution2 {

    // helper: is x prime?
    private static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0) return false;
        int limit = (int) Math.sqrt(x);
        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static int nextPrime(int n) {
        // smallest prime strictly greater than n
        if (n < 2) return 2;

        int candidate = n + 1;
        // make candidate odd (if > 2)
        if (candidate > 2 && candidate % 2 == 0) candidate++;

        while (!isPrime(candidate)) {
            candidate += 2; // test only odd numbers
            // overflow guard (very unlikely for typical constraints)
            if (candidate < 0) throw new ArithmeticException("overflow while searching for next prime");
        }

        return candidate;
    }


    public static BigInteger nextPrime2(BigInteger n) {
        if (n == null) throw new NullPointerException("input is null");

        if (n.compareTo(BigInteger.ONE) < 0) return BigInteger.valueOf(2);

        return n.add(BigInteger.ONE).nextProbablePrime();
    }
}


public class methodInsidemethod {
    public static void main(String[] args) {

        int req = Solution2.nextPrime(15);
        System.out.println(req);

        BigInteger bn = new BigInteger("93");
        BigInteger req2 = Solution2.nextPrime2(bn);
        System.out.println(req2);

    }
}
