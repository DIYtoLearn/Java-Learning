package Arrays;

import java.util.Arrays;

public class Passing_array_to_method {

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int[] arr2 = {1,1,2};

        change_original_array(arr);
        does_not_change_original_array(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    static void change_original_array(int[] arr)
    {
        arr[0] = 5;
        arr[1] = 50;
        arr[2] = 7;

    }

    static void does_not_change_original_array(int[] arr2)
    {
        arr2 = new int[] {55,56,57};

    }
}