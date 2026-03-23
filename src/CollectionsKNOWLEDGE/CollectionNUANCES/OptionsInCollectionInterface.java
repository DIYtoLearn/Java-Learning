package CollectionsKNOWLEDGE.CollectionNUANCES;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class OptionsInCollectionInterface {
    static void main() {

        ArrayList<Integer> Alst = new ArrayList<>();
        Alst.add(2);
        Alst.add(23);
        Alst.add(24);
        Alst.add(21);
        Alst.add(29);

        // ListIterator
        ListIterator<Integer> lit = Alst.listIterator();
        System.out.println("Used ListIterator which is best of lists");
        while(lit.hasNext())
        {
            System.out.print(lit.next()+" ");
        }

        Iterator<Integer> it = Alst.iterator();
        System.out.println("\nUsed Normal Iterator that is provided with the Interface Iterable");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }


        int size = Alst.size();
        boolean checkEmpty = Alst.isEmpty();
        boolean IsPresent = Alst.contains(230);
        Object[] arr = Alst.toArray();

        System.out.println("\nDesired Output = "+IsPresent);


    }
}