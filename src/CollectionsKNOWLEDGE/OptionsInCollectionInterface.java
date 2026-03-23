package CollectionsKNOWLEDGE;
import java.util.ArrayList;
import java.util.ListIterator;

public class OptionsInCollectionInterface {
    static void main() {

        ArrayList<Integer> Alst = new ArrayList<>();
        Alst.add(2);
        Alst.add(23);
        Alst.add(24);
        Alst.add(21);
        Alst.add(29);

        ListIterator<Integer> lit = Alst.listIterator();
        while(lit.hasNext())
        {
            System.out.print(lit.next()+" ");
        }

        int size = Alst.size();
        boolean checkEmpty = Alst.isEmpty();
        boolean IsPresent = Alst.contains(230);

        System.out.println("\nDesired Output = "+IsPresent);


    }
}
