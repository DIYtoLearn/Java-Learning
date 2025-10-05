package Arrays;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

public class kth_largest {
    public static void main(String[] args) {
        int[] arr = {92,0,2,12,45,234,65,3,3,92,5,0,45};
                //{3,2,1,5,6,4};
                //{3,2,3,1,2,4,5,5,6}; // 1,2,2,3,3,4,5,5,6
                //{7, 1, 45, 23, 58};
        //int[] arr = {3,1,2,6,2,1,3,4,5,5};
        int len = arr.length;

        TreeSet<Integer> t = new TreeSet<>();
        for (int j : arr) {
            t.add(j);
        }
        System.out.println("TreeSet elements: " + t);
        int len2 = t.size();
        int[] arr2 = new int[len2];

        int index = 0;
            for(int x:t)
            {
              arr2[index] = x;
              index++;
            }
        System.out.println("New Array after removing duplicates and sorting: "+Arrays.toString(arr2));

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the largest element you want? ");
            int k = sc.nextInt();

            if(k==1)
                System.out.println("The largest element according to your input in the array = "+arr2[len2-1]);
            else if(k==len2 || k==len)
                System.out.println("The largest element according to your input in the array = "+arr2[0]);
            else
            System.out.println("The largest element according to your input in the array = "+arr2[len2-k]);


// This code makes a new array containing only distinct elements in sorted order and then we return the kth largest depending upon the user input
    }
}
