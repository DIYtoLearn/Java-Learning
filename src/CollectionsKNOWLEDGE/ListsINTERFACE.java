package CollectionsKNOWLEDGE;

import java.util.*;

class ArraylistShowcase
{
    List<Integer> ls1 = new ArrayList<Integer>();

    protected void method1()
    {
        for(int i=1; i<=5; i++){
            ls1.add(i);
        }

        System.out.println(ls1);
        ls1.remove(4);
        System.out.println("After last index element removed Array List "+ls1);
    }
}

class LinkedListsSHOWCASE{
    List<String> ls2 = new LinkedList<String>();



}

class VectorShowcase{
    Vector<Integer> ls3 = new Vector<Integer>();

    protected void method3()
    {
        for(int i=1;i<=5; i++)
        {
            ls3.add(i);

        }

        System.out.println(ls3);
    }
}

class StackShowcase{
    Stack<String> ls4 = new Stack<String>();

    protected void method4()
    {
        ls4.push("Tor");
        ls4.push("Ma");
        ls4.push("Ke");
        ls4.push("108Bar");

        Iterator<String> it = ls4.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        ls4.pop();
        System.out.println(ls4);
    }
}



public class ListsINTERFACE {
    static void main() {

        ArraylistShowcase als = new ArraylistShowcase();
        als.method1();

        VectorShowcase vsh = new VectorShowcase();
        vsh.method3();

        StackShowcase SSh = new StackShowcase();
        SSh.method4();

    }
}