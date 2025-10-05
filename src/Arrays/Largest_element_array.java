package Arrays;

public class Largest_element_array {

    public static void main(String[] args) {
        int[] arr = {9,293,2,1,3,4,6,5,800};
        // Most Optimal Solution
        int counter = 1;
        int var = arr[0];
        int len = arr.length;

        //No Sorting used since all sorting algorithm use Time complexity of O(NlogN)
        // Time complexity : O(N)
            for(int i=1; i<len; i++)
            {
                counter++;
                if(arr[i]>var)
                    var = arr[i];
            }
            System.out.println("Total Times the loop ran: "+counter);
            System.err.println("Largest Element: "+var);
    }
}
