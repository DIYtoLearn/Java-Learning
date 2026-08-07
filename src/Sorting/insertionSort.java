package Sorting;
import java.util.Arrays;

// The anchor element is the leftmost element in the range and slowly moves right by one element each time
// The comparison occurs between elements from anchor element + 1 to all the elements in the left
// If the left element is lower or greater depending on ASC or DESC we swap

public class insertionSort {
    public static void main(String[] args) {

        int[] arr = {12,245,52,-25,0,3};
        int len = arr.length;

        for(int i=1; i<len; i++)
        {
            int compareKey = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] < compareKey) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = compareKey;
        }

        System.out.println("Sorted Range: "+Arrays.toString(arr));


    }
}