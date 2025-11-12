package All_tests.Test;

import java.util.ArrayList;

class Solution2 {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        int MAX = 0;

        for(int i=1; i<arr.size(); i++)
        {
            if(arr.get(MAX) < arr.get(i));
            MAX = i;
        }

        return arr.get(MAX);

    }

    public static int minimumElement(ArrayList<Integer> arr) {

        // Your code here
        return 2;
    }
}

public class Max_Min {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(2);


        int req1 = Solution2.maximumElement(list);
        int req2 = Solution2.minimumElement(list);

        System.out.println("MAX: "+req1+"\nMIN: "+req2);
    }
}
