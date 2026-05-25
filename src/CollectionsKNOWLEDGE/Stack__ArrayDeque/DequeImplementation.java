package CollectionsKNOWLEDGE.Stack__ArrayDeque;

import java.util.*;

class checkingOperationResult{

    private final Deque<Integer> dQueue = new ArrayDeque<>();
    private final Queue<Integer> queue = new LinkedList<>();


    private void checkAddElement()
    {
        dQueue.add(1); queue.add(1);
        dQueue.add(2); queue.add(2);
        dQueue.add(3); queue.add(3);
        dQueue.add(4); queue.add(4);
        dQueue.add(5); queue.add(5);
        // Hence add() always starts adding the elements from the tail end
        dQueue.remove(); // From the Head
        queue.remove(); // From the head

    }

    public void ShowElements(){
        checkAddElement();

        System.out.println("The Queue");
        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println("\nThe array Deque");
        for(Integer element : dQueue)
        {
            System.out.print(element+" ");
        }
    }
}

public class DequeImplementation {
    static void main() {

        checkingOperationResult COR = new checkingOperationResult();

        System.out.println("How Does add(), remove() work ? ");
        COR.ShowElements();

    }
}