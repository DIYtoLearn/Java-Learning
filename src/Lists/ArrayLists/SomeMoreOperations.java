package Lists.ArrayLists;
import java.util.Collections;
import java.util.ArrayList;

    public class SomeMoreOperations
    {
        public static void main(String[] args)
        {

            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0; i<10; i++)
            {
                if(i%2 == 0)
                    al.add(i+11);
                else
                    al.add(i+14);
            }

            System.out.println("BEFORE ALL THE MODS "+al);

            // These methods works best for ArrayLists
            al.sort(null); // Sorts the Arraylist in ascending order
            System.out.println(al);

            al.sort((a,b) ->b - a); // Sorts the Arraylist in descending order
            System.out.println(al);

            //This is the most common helper method. It works on any List (ArrayList, LinkedList, etc.).
            Collections.sort(al); // Ascending Order
            System.out.println(al);

            Collections.sort(al, Collections.reverseOrder()); // Descending Order
            System.out.println(al.reversed());

            // Reversing An arraylist
            System.out.println(al.reversed()); // Arraylist method to reverse

            Collections.reverse(al); // Collection method to reverse
            System.out.println(al);

            // Manual logic (swapping elements)
            for (int i = 0; i < al.size() / 2; i++) {
                Integer temp = al.get(i);
                int indexFromEnd = al.size() - 1 - i;

                // Swap front element with back element
                al.set(i, al.get(indexFromEnd));
                al.set(indexFromEnd, temp);
            }
            System.out.println(al);
            
        }
    }