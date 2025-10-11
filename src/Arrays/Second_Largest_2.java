package Arrays;

public class Second_Largest_2 {
    public static void main(String[] args) {

        int[] arr =
        //{10, 10, 10};
        //{10, 5, 10};
        //{12, 35, 1, 10, 34, 1};
        {9, 293, 2, 1, 3, 4, 6, 5, 800};

        int largest = arr[0];
        int second_largest = -1;
        int counter = 1;
            int len = arr.length;
            // My code
//            for(int i=1; i<len; i++)
//            {
//                if(arr[i]>largest && arr[i]!=largest)
//                {
//                    second_largest = largest;
//                    largest = arr[i];
//                }
//            }

        // Striver's Solution
        for(int i=1; i<len; i++)
        {
            counter++;
            if(arr[i]>largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest)
            {
                second_largest = arr[i];
            }
        }
            System.out.println("Largest: "+largest+"\nSecond Largest: "+second_largest);
            System.err.println("Time complexity is O(N) PROOF --> code run units: "+counter+ " and array length = "+len);

    }
}