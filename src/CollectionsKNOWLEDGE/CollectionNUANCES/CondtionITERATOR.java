package CollectionsKNOWLEDGE.CollectionNUANCES;

import java.util.ArrayList;
import java.util.Iterator;

public class CondtionITERATOR {
    static void removeByCond(ArrayList<?> con)
    {
        Iterator<?> it = con.iterator();
        while(it.hasNext())
        {
            int x = (int) it.next();
            if(x%2 == 0){
                it.remove();

            }
        }

        for(Object element : con)
        {
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> als = new ArrayList<>();
        als.add(23);
        als.add(24);
        als.add(27);
        als.add(25);
        als.add(20);

        CondtionITERATOR.removeByCond(als);
    }
}