package AllAboutArrays.ArrayClassInJava;

import java.util.List;
import java.util.Arrays;

public class toList {
    static void main() {

        Integer[] arr = {1,2,3,4,5};

        List<Integer> l = Arrays.asList(arr);
        System.out.println(l);

        try{
        l.add(11); // the list returned and the original array share the same memory hence as arrays cannot grow in size nether can the list
            System.out.println(l);
        }
        catch (UnsupportedOperationException e) // using add() or remove() will cause this for arrays converted to list using the asList method
        {
            System.out.println("Wassup Danger!!\n"+e);
        }
    }
}