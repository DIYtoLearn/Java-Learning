package Lists.ArrayLists;
import java.util.ArrayList;

public class Declare {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(6);
        al.add(11);
        al.add(24);
        al.add(124);
        al.add(9223);
        al.add(24);

        int len = al.size();
        System.out.println(len);
        //System.out.println(al.get(3));
        for(int i=0; i<len; i++)
        {
            if(al.get(i) == 124)
            {
                al.remove(i);
                al.set(0,111);
                len = al.size(); // When not using Iterators for List operations be careful to recalculate the size if it is cached using
                // another integer variable like in this case len
            }
        }
        System.out.println(al.indexOf(11)); // Returns -1 if the object is not present in the array List
        System.out.println(al.indexOf(24));
        System.out.println(al.lastIndexOf(24)); // Returns -1 if the object is not present in the array List
        al.sort(null);
        System.out.println(al);

        // Deletes all the elements in the ArrayList
        if(al.contains(111))
        {
            al.clear();
            System.out.println(al.isEmpty());
        }

    }
}