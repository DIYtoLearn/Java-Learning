package SmallTOPICS.ComparableComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparatorFirst {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10); arr.add(7);
        arr.add(-11); arr.add(11);
        arr.add(11); arr.add(-7122133);
        arr.add(15); arr.add(0); arr.add(91122);
        System.out.print(arr+"\n");

        // Sorting the ArrayList of Numbers based ascending order
        Comparator<Integer> comp = (o1, o2) -> {
           if(o1 > o2)
               return 1;
           else if(o1.equals(o2))
               return 0;
           else
               return -1;
        };

        arr.sort(comp);
        System.out.println("ascending sort: "+arr);

        ArrayList<String> AString = new ArrayList<String>();
        AString.add("");  AString.add("length12");
        AString.add(null);  AString.add("length");
        AString.add("length1234");  AString.add("len");

        System.out.println(AString);

        Comparator<String> comp2 = (String O1, String O2) ->{
            if(O1.length() > O2.length())
                return 1;
            else if(O1.length() < O2.length())
                return -1;
            else
                return 0;
        };

        AString.sort(Comparator.nullsFirst(comp2)); // For  AString.add(null); getting null pointer exception not possible to sort this !
        System.out.println("Sort based in String Length: "+AString);

    }
}