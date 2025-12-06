package GFG;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static GFG.SolutionSum.getPairs;

class SolutionSum
{
    public static ArrayList<List<Integer>> getPairs(int[] arr, int target) {

    // Returns ArrayList of unique pairs sorted in ascending order
        Arrays.sort(arr); // sort array first
        ArrayList<List<Integer>> pairs = new ArrayList<>();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                // arr[i] <= arr[j] because array is sorted
                pairs.add(Arrays.asList(arr[i], arr[j]));

                int leftVal = arr[i];
                int rightVal = arr[j];

                // move i to next different value (to avoid duplicate pairs)
                while (i < j && arr[i] == leftVal) i++;

                // move j to previous different value (to avoid duplicate pairs)
                while (i < j && arr[j] == rightVal) j--;

            } else if (sum < target) {
                i++; // need a bigger sum
            } else {
                j--; // need a smaller sum
            }
        }

        return pairs; // already sorted in ascending order
    }
}

public class TwoSum
{
    public static void main(String[] args)
    {
        int i2 = -1;
        int j2 = 2;
        int c = 0;
        c = i2 + j2;
        //System.out.println(c);

        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        // {-1, 0, 1, 2, -1, -4};
                //{1, -2, 1, 0, 5};
        //{0, -1, 2, -3, 1};
        int target = -2;
        int target2 = 0;
        boolean bool = false;

                int pair_sum = 0;
                for (int i = 0; i < arr.length - 1; i++)
                {
//                    if(bool == true)
//                        break;

                    for(int j=i+1; j < arr.length ; j++)
                    {
                        pair_sum = arr[i] + arr[j];
                        if(pair_sum == target2)
                        {
                            //System.out.println(Math.min(arr[i],arr[j])+" "+Math.max(arr[i],arr[j]));
                            bool = true;
                            break;
                        }
                    }
                }

        //System.out.println(bool);


        int[] arr2 = {-1, 0, 1, 2, -1, -4};
                //{6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        int target3 = 0;   // or use target2 = 0, etc.

        ArrayList<List<Integer>> result = getPairs(arr2, target3);

        System.out.println(result);   // print the pairs
    }
}