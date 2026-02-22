package CollectionsKNOWLEDGE;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

class PriorityQueueShwocase{
    PriorityQueue<Integer> pqe = new PriorityQueue<>();

    protected void method1()
    {
        pqe.add(10);
        pqe.add(-20); // 1st smallest element, that is the first element stored in priority queue
        pqe.add(-13);
        pqe.add(1200);

        System.out.println(pqe.peek()); // Default: Min-heap → smallest element has highest priority
        System.out.println(pqe.poll());
        System.out.println(pqe.peek());

    }
}

class ArrayDequeShwocase{
    ArrayDeque<Integer> Ard = new ArrayDeque<>();

    protected void method2()
    {
        Ard.add(10);
        Ard.add(20);
        Ard.add(50);
        Ard.add(60);
        Ard.add(760);

        System.out.println(Ard);
        Ard.clear();

        Ard.addFirst(99);
        Ard.addFirst(98);
        Ard.addLast(97);
        Ard.addLast(96);

        System.out.println(Ard);

    }
}

public class ALLaboutQUEUE {
    static void main() {
        PriorityQueueShwocase pqsh = new PriorityQueueShwocase();
        pqsh.method1();

        ArrayDequeShwocase Adsh = new ArrayDequeShwocase();
        Adsh.method2();
    }
}