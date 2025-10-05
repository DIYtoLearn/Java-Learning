package Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int counter = 1;
        int[] arr =
        //{10, 10, 10};
        // {10, 5, 10};
        //{12, 35, 1, 10, 34, 1};
        {9, 293, 2, 1, 3, 4, 6, 5, 800};

        int var = arr[0];
        int len = arr.length;

        // largest element finding
        for(int i=1; i<len; i++)
            {
                counter++;
                if(arr[i]>var)
                    var = arr[i];
            }
        // My mistake was here
        int second_largst = -1; // It is important to take the smallest as the smallest positive integer, since that will not mess up the comparision

        //Second largest element findings
        for(int i=1; i<len; i++)
        {
            counter++;
            if(arr[i]>second_largst && arr[i]<var)
                second_largst = arr[i];
        }
        // Time complexity = O(2N)
        System.out.println("Largest element: "+var);
        System.out.println("Second Largest element: "+second_largst);
        System.err.println("Total Run: "+counter);
    }
}