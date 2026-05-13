package AllAboutArrays.ArrayClassInJava;
import java.util.Arrays;
public class toStringForArrays {
    static void main() {

        int[] arr = {1,2,3};
        Integer[] arr2 = {1,2,3};

        // Printing both the arrays with toString
        System.out.println(arr+" "+arr2);

        System.out.println(arr.toString()+" "+arr2.toString());

        System.out.println(Arrays.toString(arr)+" "+Arrays.toString(arr2));
    }
}
