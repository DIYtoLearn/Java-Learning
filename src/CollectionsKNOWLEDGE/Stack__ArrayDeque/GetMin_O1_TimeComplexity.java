package CollectionsKNOWLEDGE.Stack__ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

class OperationPerformer {

    // Main stack stores all elements
    private Stack<Integer> main_stack = new Stack<>();

    /**
     * Auxiliary stack stores ONLY the minimum elements.
     * The top of this stack is always the current minimum.
     */
    private Stack<Integer> aux_stack = new Stack<>();

    // Getter for debugging / printing
    public Stack<Integer> getMain_stack(){
        return main_stack;
    }

    // Getter for debugging / printing
    public Stack<Integer> getAux_stack(){
        return aux_stack;
    }

    /**
     * Push operation:
     * - Always push element into main stack
     * - Push into aux stack ONLY IF:
     *      1. aux stack is empty
     *      2. new element is smaller than current min
     */
    public void push(int x)
    {
        main_stack.push(x);

        // Maintain min stack
        if(aux_stack.isEmpty() || aux_stack.peek() >= x)
            aux_stack.push(x);
    }

    /**
     * Pop operation:
     * - If popped element is equal to current min,
     *   also pop from aux stack
     */
    public String pop(){
        if(main_stack.isEmpty())
            return "Nothing in main stack to POP !";

        // == → “Are these the same object in memory?”
        //.equals() → “Do these have the same value?”
        // Since our stack is an Integer, peek returns an Integer Object and since java caches integers from -128 to 127.
        // In case where peek return any value over 127 or under -128 the == if statement will evaluate to false and the aux_stack will not be updated
        if(main_stack.peek().equals(aux_stack.peek())) {
            aux_stack.pop();
        }
        // Integer caching the Pitfall reason to use .equals
        // https://medium.com/tuanhdotnet/integer-caching-in-java-how-it-works-and-why-it-matters-cd6f09c53728

        main_stack.pop();
        return "200 OK";
    }

    /**
     * Returns the minimum element in O(1) time.
     * Instead of scanning the entire stack (which would be O(n)),
     * we maintain another stack (aux_stack) that always keeps track
     * of minimum values.
     * The top of aux_stack ALWAYS contains the current minimum.
     * So:
     *   getMin() = aux_stack.peek()
     * This is a constant time operation → O(1)
     */
    public int getMin()
    {
        if(!aux_stack.isEmpty())
            return aux_stack.peek();

        return -1;
    }
}


public class GetMin_O1_TimeComplexity {

    static void main() {
        System.out.print("Hello world\n");

        Scanner sc = new Scanner(System.in);
        OperationPerformer Op = new OperationPerformer();

        // Infinite loop to continuously take user input.
        while(true) {

            System.out.print("Enter the operation to be performed -->Try push/pop/min/exit : ");
            String Operation_to_be_performed = sc.nextLine().toLowerCase();

            switch (Operation_to_be_performed) {

                case "push":
                    System.out.print("Enter the number to push: ");
                    int element_to_push = sc.nextInt();
                    Op.push(element_to_push);

                    // IMPORTANT:
                    // Consume leftover newline after nextInt()
                    sc.nextLine();
                    break;

                case "pop":
                    String res = Op.pop();
                    System.out.println(res);
                    break;

                case "min":
                    int current_min_as_per_the_stack = Op.getMin();

                    if(current_min_as_per_the_stack == -1)
                        System.out.println("Your stack has no element to give minimums !!");

                    else{
                    System.out.println("Current Main Stack " + Op.getMain_stack());
                    System.out.println("Current Aux Stack containing Mins " + Op.getAux_stack());
                    System.out.println("Current min in the stack = " + current_min_as_per_the_stack);}
                    break;

                /*
                 * NEW CASE:
                 * Gracefully exits the loop and program
                 */
                case "exit":
                    System.out.println("Exiting program gracefully...");
                    sc.close();
                    return; // exits main()

                default:
                    System.out.print("Invalid operation. Try push/pop/min/exit\n");
            }
        }
    }
}