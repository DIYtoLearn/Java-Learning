package CollectionsKNOWLEDGE.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Solution00 {

    static int findFrequency(Queue<Integer> q, int k) {

        int len = q.size(); // Store original size
        int counter = 0;

        for(int i = 0; i < len; i++)
        {
            Integer current = q.poll(); // Remove front element

            if(current != null && current.equals(k))
            {
                counter++;
            }

            // Optional:
            // add back if queue should remain unchanged
            q.add(current);
        }

        return (counter == 0) ? -1 : counter;
    }
}

public class FindFrequency {

    static void main() {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(1);

        int total_found = Solution00.findFrequency(queue, 3);

        System.out.println("Frequency = " + total_found);
    }
}