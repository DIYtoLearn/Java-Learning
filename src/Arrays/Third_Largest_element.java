package Arrays;

public class Third_Largest_element {
    public static void main(String[] args) {


        int[] arr = {7, 1, 45, 23, 58}; // print the third largest element form the given array

        int largest = arr[0];
        int second_largest = -1;
        int third_largest = -2;

        // First iteration to find the second largest
        for (int i=1; i < arr.length; i++)
        {
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
        System.out.println(largest);
        System.out.println(second_largest);

            // Second iteration to find the third largest
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]<second_largest)
                    third_largest = arr[i];
            }
            System.out.println(third_largest);
    }
}
