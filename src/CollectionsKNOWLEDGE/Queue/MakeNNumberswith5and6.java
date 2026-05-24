package CollectionsKNOWLEDGE.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class MakeNNumberswith5and6 {
    static void main() {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("5"); queue.add("6");
        int N = 10;

        for(int i=0; i<N; i++)
        {
            String curr = queue.poll();
            System.out.print(curr+" ");

            queue.add(curr+"5");
            queue.add(curr+"6");
        }
        System.out.println();

        System.out.println("Actual queue");
        Iterator<String> it = queue.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");

        }
    }
}