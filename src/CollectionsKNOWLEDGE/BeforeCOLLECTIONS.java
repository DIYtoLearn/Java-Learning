package CollectionsKNOWLEDGE;

import java.util.Hashtable;
import java.util.*;



public class BeforeCOLLECTIONS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> ht = new Hashtable<>();

        v.addElement(1);
        v.addElement(9);

        ht.put(0,"Omega");
        ht.put(2,"Ultra");

        System.out.println(arr[2]);
        System.out.println(v.elementAt(1));
        System.out.println(ht.get(0));

    }
}
