package SmallTOPICS.Streams;

// In this example, the goal is to find and print the first 10 natural numbers that contain the digit '5'.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FirstN {
    static void main() {

        ArrayList<Integer> Alist = new ArrayList<>();
        int n = 1;
        while(n < 101)
        {
            Alist.add(n);
            n++;
        }
//        for(Object x : Alist)
//        {
//            System.out.println(x);
//        }

        int num = 1;
        List<Integer> result = Alist.stream().filter(x -> x%(5*num) == 0).limit(10).toList();
        System.out.print(result);

        System.out.println();

        Stream.iterate(1,x -> x+1)
                .filter(x -> x.toString().contains("5"))
                .limit(20)
                .forEach(x -> System.out.print(x+" "));
    }
}