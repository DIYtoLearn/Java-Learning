package CollectionsKNOWLEDGE;

import java.util.ArrayList;

public class TestClass {
    static void main() {

        ArrayList<Integer> add1 = new ArrayList<>(3);
        //add1.add(10); add1.add(20); add1.add(30);
        add1.add(40); add1.add(50);
        ArrayList<Integer> add2 = new ArrayList<>(2);
        add2.add(40); add2.add(50);


        boolean Retain_elements = add1.retainAll(add2);
        System.out.println("Is Retain operation successful ? "+ Retain_elements +" "+add1+add2);
    }
}
