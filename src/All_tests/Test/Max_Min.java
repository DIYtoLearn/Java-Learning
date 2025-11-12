package All_tests.Test;

import java.util.ArrayList;

class Solution2 {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        int MAX = 0;

        for(int i=1; i<arr.size(); i++)
        {
            if(arr.get(MAX) < arr.get(i))
            MAX = i;
        }

        return arr.get(MAX);

    }

    public static int minimumElement(ArrayList<Integer> arr) {

        // Your code here
        int MIN = 0;

        for(int j=0; j<arr.size(); j++)
        {
            if(arr.get(MIN) > arr.get(j))
                MIN = j;
        }
        return arr.get(MIN);
    }
}

public class Max_Min {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(11);
        list.add(20);
        list.add(111);


        int req1 = Solution2.maximumElement(list);
        int req2 = Solution2.minimumElement(list);

        System.out.println("MAX: "+req1+"\nMIN: "+req2);
    }
}
