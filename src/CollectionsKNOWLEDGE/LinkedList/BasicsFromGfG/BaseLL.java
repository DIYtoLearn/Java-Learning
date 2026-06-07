package CollectionsKNOWLEDGE.LinkedList.BasicsFromGfG;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class BaseLL {
    static void main() {

        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the linkedList

        ll.add("1"); ll.add("one"); ll.add("2"); ll.add("TWO");
        System.out.println(ll);

       

        // Note: LinkedList nodes cannot be accessed directly by index; elements must be accessed by traversing from the head.
        // So using a basic for along with get method is bad for element access as it will result on O(n^2)

         // Bad practise for large list
            for(int i=0; i<ll.size(); i++)
            {
                System.out.print(ll.get(i)+" ");
            }

        System.out.println();

            // Using the for each loop OR Using iterator is recommended practise
            for(String element : ll)
            {
                System.out.print(element+" ");
            }

        System.out.println();


            // Linked list class has 2 Constructors via which we can create a linked list
            // The first one is the one implemented above that creates an empty linked list

                ArrayList<String> Alist = new ArrayList<>();
                Alist.add("3"); Alist.add("three"); Alist.add("4"); Alist.add("FOUR");
                // Here we make the linked list contain all the elements of a specified collection
                LinkedList<String> ll2 = new LinkedList<>(Alist);
                Iterator<String> it = ll2.iterator();

                    while(it.hasNext()){
                        System.out.print(it.next()+" ");
                    }
    }
}