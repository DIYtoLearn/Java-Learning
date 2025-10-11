package Array_Strings;
import java.util.Arrays;
public class Move_Zeroes {

    static void variables(int[] enter)
    {
        // maintain the insert order of the array while moving the rest of the element's to the back
        int len = enter.length;
        int temp;
        for(int i=0; i<len; i++)
        {
            if(enter[i] == 0)
            {
                for(int j=i+1; j<len; j++) {
                    if (enter[j] != 0) {
                        temp = enter[j];
                        enter[j] = enter[i];
                        enter[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1,0,55,22,0,0};
        variables(arr);

        System.out.println("Formatted Array: "+Arrays.toString(arr));
    }
}
// Pending looking at the optimized solution