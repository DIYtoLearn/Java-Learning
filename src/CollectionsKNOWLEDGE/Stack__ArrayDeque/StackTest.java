package CollectionsKNOWLEDGE.Stack__ArrayDeque;

import java.util.ArrayDeque;
import java.util.ListIterator;
import java.util.Stack;

public class StackTest {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack);
        ListIterator<Integer> it = stack.listIterator(); // Can iterate through the stack using list iterartors
        int i = 1;
        for(Integer element : stack){ // Using for each to iterator through the stack
            System.out.println(element+" "+i+"st element");
            i++;
        }

        System.out.println(stack.peek()); // prints the topmost element in the stack
        stack.pop(); // removes the topmost element
        stack.push(16);
        System.out.println("stack size = "+stack.size());
        System.out.println(stack);
        int found = stack.search(121);
        System.out.println(found+" "+stack.search(12));

        // remove middle element from the stack
        int mid = (stack.size()-1)/2;
        stack.remove(mid);

        // Popping all the elements in the stack and checking till stack is empty
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }

        String result_required = Solution.removeConsecutiveDuplicates("aaaaaabaabccccccc");
        System.out.println(result_required);
    }
}


class Solution {
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here

        // Edge case
        if (s == null || s.isEmpty()) {
            return "";
        }

        Stack<Character> stack = new Stack<>();

        // Traverse string
        for (char ch : s.toCharArray()) {

            // If stack is empty OR current char != top of stack → push
            if (stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch);
            }
            // Else skip (this removes consecutive duplicates)
        }

        // Build result from stack
        StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}