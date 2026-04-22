package SmallTOPICS.Streams;

// In this example, the goal is to find and print the first 10 natural numbers that contain the digit '5'.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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

        //int num = 1;
        List<Integer> result = Stream.iterate(1,x -> x+2)
                        .map(x->(5*x))
                        .limit(10)
                        .toList();
        System.out.print(result);

        System.out.println();

        // GFG method of printing first n natural number that contains the number 5
        Stream.iterate(1,x -> x+1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(x -> System.out.print(x+" "));

        // Normal Way of Doing Things
        System.out.println();
        NormalSolution.NnumsContaining5();
    }
}

class NormalSolution{

    static int x = 1;

    protected static void NnumsContaining5(){
        ArrayList<Integer> Alist = new ArrayList<>();
        while(x<101){
            Alist.add(x);
            x++;
        }
        System.out.println(Alist.size());

        ArrayList<Integer> AList2 = new ArrayList<>(10);
        ListIterator<Integer> Lit = Alist.listIterator();
        int num,copyOfnum,count,Ld;
        while(Lit.hasNext())
        {
            if(AList2.size() >= 10)
                break;
            else {
                 num = Lit.next();
                 copyOfnum = num;
//                 count = (int)(Math.log10(num) + 1); // Count the total number of digits in a number without loops !!
//                 System.out.println(count);

                while(num != 0)
                {
                    Ld = num % 10;
                    num = num / 10;

                    if(Ld != 0 && Ld%5 == 0){
                        AList2.add(copyOfnum);
                        break;
                    }
                }
            }
        }
        System.out.println(AList2);
    }
}