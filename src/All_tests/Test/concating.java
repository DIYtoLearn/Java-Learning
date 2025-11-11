package All_tests.Test;
import java.util.ArrayList;

class Solution {
     public static String concatenateStrings(ArrayList<String> arr) {
        // Your code here
        // System.out.println(arr.size());
        String req = "";

         for (String s : arr) {
             req = req + s;

         }

        return req;
    }
}

public class concating {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        String note = Solution.concatenateStrings(list);
        System.out.println(note);
    }
}