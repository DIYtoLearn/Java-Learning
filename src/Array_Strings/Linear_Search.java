package Array_Strings;

public class Linear_Search {

    static int lineaOperation(int[] array, int n)
    {
        int len = array.length;
        int temp = -1;
        for(int i=0; i<len; i++)
        {
            if(array[i] == n){
                temp = i;
                break;
            }
        }
            return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 1;

        int index = lineaOperation(arr, num);
        System.err.println(index);
    }
}

// Pending looking at the optimized solution