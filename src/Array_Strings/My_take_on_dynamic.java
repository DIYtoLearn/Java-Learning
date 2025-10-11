package Array_Strings;
import java.util.Arrays;

public class My_take_on_dynamic {
    public static void main(String[] args) throws InterruptedException {

        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {7,8,9};

        int len = a.length;

        while(true) {

            for (int i = 0; i < len; i++) {
                a[i]++;
                b[i]++;
                c[i]++;
            }
            System.out.print("\r"+Arrays.toString(c));

            if(a[0] > 10) break;

            Thread.sleep(500);

        }

    }
}
