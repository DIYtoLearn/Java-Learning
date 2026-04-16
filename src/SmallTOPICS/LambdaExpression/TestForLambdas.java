package SmallTOPICS.LambdaExpression;
import java.util.Arrays;
import java.util.Comparator;
//public class TestForLambdas

class Main {

    static class Pair {
        int x;
        int y;

        Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args)
    {
        Pair arr[] = new Pair[3];

        arr[0] = new Pair(1, 2);
        arr[1] = new Pair(2, 4);
        arr[2] = new Pair(3, 5);

        Arrays.sort(arr, (a, b) -> a.x - b.x);
        //Arrays.sort(arr, Comparator.comparingInt(a -> a.x));

        int count = 0;
        for (Pair ob : arr) {
            if (count < 2) {
                System.out.print(ob.x + " ");
                ++count;
            }
        }
    }
}