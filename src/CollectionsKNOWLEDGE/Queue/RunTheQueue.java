package CollectionsKNOWLEDGE.Queue;

public class RunTheQueue {
    static void main() {
        QueueImplement_UsingArrays qua = new QueueImplement_UsingArrays();

        qua.enqueue(1);
        qua.enqueue(2);
        qua.enqueue(3);
        qua.enqueue(4);
        qua.enqueue(5);

        qua.FetchCurrentQueue();

        qua.dequeue();
        qua.dequeue();
        qua.FetchCurrentQueue();

        qua.dequeue();
        qua.dequeue();
        qua.dequeue();
        qua.dequeue();
        qua.FetchCurrentQueue();
        System.out.println("Current queue size after all operations "+qua.getSize());
        System.out.println("Current Front after all operations "+qua.getFront());
        System.out.println("Current Rear after all operations "+qua.getRear());

        qua.enqueue(11);
        qua.enqueue(120);
        qua.FetchCurrentQueue();


    }
}