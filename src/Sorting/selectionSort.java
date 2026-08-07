package Sorting;
import java.util.Arrays;

 // Select a minimum, within the unsorted range
 // Select an anchor element from the start
 // compare the unsorted range with the anchor element and swap iff (it is lower or greater depending on ASC or DESC)

public class selectionSort {
    public static void main(String[] args) {

        Integer[] arr = {6,4,1,8,-11,42,467,1,0};
        Integer temp;
        int len = arr.length;

        for(int i=0; i<len-1; i++)
        {
            int minterm = i;
            for(int j=i+1; j<len; j++)
            {
                if(arr[j] < arr[minterm])
                 minterm = j;
            }

            temp = arr[minterm];
            arr[minterm] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}