package CollectionsKNOWLEDGE.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Priority{

    private final Queue<Integer> priorityQ = new PriorityQueue<>(3);

    // Default constructor
    Priority(){
            priorityQ.add(12);
            priorityQ.offer(11);
            priorityQ.add(100);
            priorityQ.offer(77);
            priorityQ.poll(); // Removed the element with the highest priority
    }

    public Queue<Integer> getPriorityQ() {
        return priorityQ;
    }
}

class ArrayDeque {

    private final Queue<Character> QueueDequeVizArray = new java.util.ArrayDeque<>();

    ArrayDeque()
    {
        QueueDequeVizArray.add('a');
        QueueDequeVizArray.offer('b');
        QueueDequeVizArray.add('c');
        QueueDequeVizArray.offer('d');
        QueueDequeVizArray.poll(); // Followed the FIFO method of removal
    }

    public Queue<Character> getQueueDequeVizArray() {
        return QueueDequeVizArray;
    }
}

class linkedList{

    private final Queue<String> llqueue = new LinkedList<>();

    linkedList()
    {
        llqueue.add("Hello");
        llqueue.offer("baby");
        llqueue.add("World");
        llqueue.offer("grit");
        llqueue.poll(); // Followed the FIFO method of removal

    }

    public Queue<String> getLlqueue() {
        return llqueue;
    }
}

public class QueueImplement {
    static void main() {
        Priority pq = new Priority(); System.out.println(pq.getPriorityQ());
        ArrayDeque adq = new ArrayDeque(); System.out.println(adq.getQueueDequeVizArray());
        linkedList llq = new linkedList(); System.out.println(llq.getLlqueue());
    }
}