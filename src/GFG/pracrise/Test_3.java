package GFG.pracrise;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any string");
//        String s = sc.nextLine();

            boolean a = true;
            a = !a;
            boolean b = false;
            boolean test = a||b;
            System.out.println(test);
            System.out.println(null == null);

            int arr[] = { 1, 2 };
            int arr1[] = { 1, 2 };
            System.out.print(arr == arr1);
//         The == operator compares the references of the two arrays, not their contents.
//         In this case, arr and arr1 are two separate arrays with the same contents, but they have different references, so arr == arr1 returns false.
//         If you want to compare the contents of the arrays, you can use the java.util.Arrays.equals() method, like this: java.util.Arrays.equals(arr, arr1).



    }
}