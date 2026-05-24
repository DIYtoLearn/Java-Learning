package CollectionsKNOWLEDGE.Queue;

public class QueueImplement_UsingArrays {

    // Fixed-size circular queue buffer
    private final Integer[] arr = new Integer[5];

    // Points to current front element
    private int front ;

    // Points to next insertion position
    private int rear ;

    // Current number of elements in queue
    private int size ;

    QueueImplement_UsingArrays()
    {
        front = 0;
        rear = 0;
        size = 0;
    }

    /**
     * enqueue
     * Adds element at rear and moves rear circularly
     */
    public void enqueue(int data)
    {
        if(!isFull())
        {
            arr[rear] = data;

            // FIX:
            // rear = (rear % 5) + 1;
            // This becomes 5 when rear = 4 → ArrayIndexOutOfBoundsException

            rear = (rear + 1) % arr.length;

            size++;
        }

        else{
            System.out.println("Cannot Insert as Queue is Full");
        }
    }

    /**
     * dequeue
     * Removes front element and moves front circularly
     */
    public void dequeue()
    {
        if(!isEmpty()){

            int dataRemoved = arr[front];

            // Helps garbage collector remove unused Integer object
            arr[front] = null;

            // FIX:
            // front = (front % 5) + 1;
            // Same wrap-around bug as rear

            front = (front + 1) % arr.length;

            size--;

            System.out.println("Removed : " + dataRemoved);
        }

        else{
            System.out.println("No more elements remain in the queue to be removed");
        }
    }

    /** Checks if queue is full */
    public boolean isFull()
    {
        return size == arr.length;
    }

    /** Checks if queue is empty */
    public boolean isEmpty()
    {
        return size == 0;
    }

    /** Prints current queue elements */
    public void FetchCurrentQueue()
    {
        System.out.print("Current Queue : ");

        if(isEmpty())
        {
            System.out.println("No elements in the queue to print insert some elements !!");
            return; // Prevent unnecessary loop
        }

        for(int i=0; i<size; i++)
        {
            System.out.print(arr[(front+i)%arr.length]+" ");
        }

        System.out.println();
    }

    /** Returns current queue size */
    public int getSize() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }
}