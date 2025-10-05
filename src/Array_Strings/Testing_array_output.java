package Array_Strings;

public class Testing_array_output {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,3};

        // Starting the loop from 0 to N-1
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // Starting the loop from 1 to N-1
        for(int j=1; j< arr.length; j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
