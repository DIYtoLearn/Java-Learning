package Array_Strings;
import java.util.Arrays;

public class Array_lessThanK {
     static int[] returnarr(int []arr, int k)
    {
      // Creating the array with the desired elements
      int [] nw = new int[100];
      int i = 0;
      for(int x:arr)
      {
          if(x<k)
          {
              nw[i] = x;
              i++;
          }
      }
      // creating a new array with only those elements
        int j = 0;
        for(int x:nw)
        {
            if(x==0)
            {
                j++;
            }
        }
        int len = nw.length - j;
        int[] arr2 = Arrays.copyOf(nw, len);
      // returning the correct array
      return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8,10,3};
        int k = 6;
        int[] m = returnarr(arr, k);

        //Printing the returned array
        for(int g:m)
        {
            System.out.print(g+" ");
        }
    }
}
