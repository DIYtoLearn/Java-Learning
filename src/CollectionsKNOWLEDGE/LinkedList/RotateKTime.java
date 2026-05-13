package CollectionsKNOWLEDGE.LinkedList;
import java.util.LinkedList;

public class RotateKTime {
    static void main() {

        LinkedList<Integer> Llist = new LinkedList<>();
        // Input: ll[] = [9, 8, 7, 6, 5, 4, 4], k = 2
        // Output: 4 4 9 8 7 6 5

        Llist.add(9); Llist.add(8); Llist.add(7); Llist.add(6); Llist.add(5); Llist.add(4); Llist.add(4);
        System.out.println(Llist);

        int rotate_by = 2;

        while(rotate_by > 0){
            rotate_by --;

            int element_removed_from_back = Llist.removeLast();
            //System.out.println(Llist);

            Llist.push(element_removed_from_back);
            //System.out.println(Llist);
        }
        System.out.println(Llist);
    }
}