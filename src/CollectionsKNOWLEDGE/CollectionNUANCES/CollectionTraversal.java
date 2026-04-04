package CollectionsKNOWLEDGE.CollectionNUANCES;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CollectionTraversal {
    static void main() {


        //foreach method
        List<Integer> ls = Arrays.asList(10,20,30,40,50);
        //ls.forEach(x->System.out.print(x+" "));
        ls.forEach(System.out::println);

        //Streams
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(73); alist.add(70); alist.add(73); alist.add(73);

        alist.stream()
                .filter(x->x>10)
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}