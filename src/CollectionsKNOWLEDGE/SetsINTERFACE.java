package CollectionsKNOWLEDGE;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class HashSetShwocase{
    Set<String> ss = new HashSet<>();
    String new1;

    protected void method1()
    {
        ss.add("Test");
        ss.add("how");
        ss.add("are");
        ss.add("you");

        Iterator<String> it = ss.iterator();
        while(it.hasNext())
        {
            new1 = it.next();

            System.out.println(new1.hashCode()+"  "+new1);
        }

        System.out.println(ss.contains("are")+" "+ss.size());
    }
}


class TreeSetShwocase{

    TreeSet<Integer> Tst = new TreeSet<>();

    protected void method2(){
        Tst.add(9);
        Tst.add(183);
        Tst.add(92);
        Tst.add(33);
        Tst.add(42);

        Iterator<Integer> it = Tst.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+" "); // prints in sorted order ASCENDING by default
        }

    }
}

public class SetsINTERFACE {
    static void main() {
        HashSetShwocase Hssh = new HashSetShwocase();
        Hssh.method1();

        TreeSetShwocase tss = new TreeSetShwocase();
        tss.method2();
    }
}