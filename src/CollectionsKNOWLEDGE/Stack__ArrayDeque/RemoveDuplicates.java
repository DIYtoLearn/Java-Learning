package CollectionsKNOWLEDGE.Stack__ArrayDeque;

import java.util.ArrayDeque;
import java.util.Stack;

class SolutionUID_01 {
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here

        // Edge case
        if (s == null || s.isEmpty()) {
            return "";
        }

        ArrayDeque<Character> stack = new ArrayDeque<>();

        //👉 You accidentally used the wrong end as "top of stack"
        //If you treat:
        //front = top → use push/pop
        //rear = top → use addLast/removeLast

        //ArrayDeque is a double-ended queue (Deque), meaning:
        //👉 You can insert/remove from both ends
        //👉 So it can act like:
        //Stack (LIFO)
        //Queue (FIFO)

        // Traverse string
        for (char ch : s.toCharArray()) {

            // If stack is empty OR current char != top of stack → push
            if (stack.isEmpty() || stack.peekLast() != ch) {
                stack.addLast(ch);
            }
            // Else skip (this removes consecutive duplicates)
        }
        System.out.println(stack);
        // Build result from stack
        StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static String removePair(String s) {

        if(s == null || s.isEmpty())
            return "";

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1; i<s.length(); i++)
        {
            char x = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == x)
                stack.pop();
            else
                stack.push(x);
        }

        StringBuilder sb = new StringBuilder();
        for(char element: stack)
        {
            sb.append(element);
        }

        return sb.toString();
    }
}

public class RemoveDuplicates {
    static void main() {
        String result_required = SolutionUID_01.removeConsecutiveDuplicates("aaaaaabaabccccccc");
        System.out.println(result_required);

        String result_required2 = SolutionUID_01.removePair("aaabbaaccd");
        System.out.println(result_required2);
    }
}