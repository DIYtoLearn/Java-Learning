package Strings.Revisited;

import java.util.Arrays;

// https://www.geeksforgeeks.org/batch/jbdl-blr-8/track/Java-Collections-String/problem/check-if-strings-are-rotations-of-each-other-or-not-1587115620
public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dabc";
        System.out.println((s1+s1).contains(s2)); // O(n) time complexity
        /*
contains() = substring search
Java uses highly optimized algorithms internally
You should understand:
Knuth-Morris-Pratt Algorithm        // https://www.geeksforgeeks.org/dsa/kmp-algorithm-for-pattern-searching/
Two-Way String Matching Algorithm
Boyer-Moore Algorithm
Rabin-Karp Algorithm
        */


        //char[] manipulating = s1.toCharArray();
        //System.out.println(manipulating);

//        if(s2.equals(Arrays.toString(manipulating)));{ // works for checks
//            System.out.println(true);
//        }

        String sub, sub2;
//        sub = s1.substring(0,s1.length()-1);
//        sub2 = s1.substring(s1.length()-1);
//        System.out.println(sub+" "+sub2);
//        System.out.println((sub2+sub).length());
//        System.out.println(s2.equals(sub2+sub));

        for(int i=0; i<s1.length(); i++) {
            sub = s1.substring(0, s1.length() - 1);
            sub2 = s1.substring(s1.length() - 1);
            System.out.println(sub + " " + sub2);
            System.out.println((sub2 + sub).length() + " " + sub2 + sub);
            System.out.println(s2.equals(sub2 + sub));
            s1 = sub2 + sub;
        }
    }
}