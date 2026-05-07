package SmallTOPICS.ComparableComparator;
import java.util.ArrayList;
import java.util.Comparator;


public class ComparatorFirst {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(-11);
        arr.add(11);
        arr.add(11); arr.add(-7122133);
        arr.add(15); arr.add(0); arr.add(91122);
        arr.add(7);
        System.out.print(arr+"\n");

        Comparator<Integer> comp = (o1, o2) -> {
           if(o1 > o2)
               return 1;
           else if(o1.equals(o2))
               return 0;
           else
               return -1;
        };

        arr.sort(comp);
        System.out.print("ascending sort: "+arr);

    }
}