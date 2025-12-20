package Lists.ArrayLists;
import java.util.*;

    public class Iterator {
        public static void main(String[] args) {

            List<Integer> ls = new ArrayList<>();
            ls.add(10);
            ls.add(30);
            ls.add(40);

            System.out.println("SIZE of List "+ls.size());

            ListIterator<Integer> it = ls.listIterator();

            // We cannot use two iterators to modify the contents of a single list as it will cause the exception ConcurrentModifcation
            //ListIterator<Integer> it2 = ls.listIterator(ls.size());

            while (it.hasNext()) {
                it.add(7);
                int x = it.next();// To store the value returned by the iterator
                //it.add(7); [Figure out where we can user add method]
                if(x == 10)
                {
                    //it.remove(); // Removed the current element and shift all the remaining elements one place to the left
                    it.set(50);
                    //x=it.next(); // Moves the iterator one place up
                }
                //System.out.println(x);

                System.out.println(it.previousIndex());
                System.out.println(it.nextIndex());

                // Try to finish this part of the code where we try and remove all added sevens in an inner loop
//                for(int i=ls.size()-1; i>=0; i++)
//                {
//                    if(ls.get(i) == 7)
//                        ls.remove(i);
//                }
            }

            //Printing the FULL LIST
            System.out.println("CURRENT STATUS OF LIST AFTER ALL MODS "+ls);
        }
    }