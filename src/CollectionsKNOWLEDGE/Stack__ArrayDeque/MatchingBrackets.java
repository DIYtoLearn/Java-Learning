package CollectionsKNOWLEDGE.Stack__ArrayDeque;

import java.util.*;

public class MatchingBrackets{

    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    static boolean isBalanced(String str)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0; i<str.length(); i++)
        {
            char x = str.charAt(i);

            if(x == '(' || x == '{' || x == '[')
                stack.push(x);
            else
            {
                if(stack.isEmpty())
                    return false;
                else if(!isMatching(stack.peek(), x))
                    return false;
                else
                    stack.pop();
            }
        }

        return (stack.isEmpty());
    }

    public static void main (String[] args) {

        String str = "[()()]{}";

        System.out.println(isBalanced(str));
    }
}