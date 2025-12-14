package Arrays;

class ValOfK
{
    static int[] arr;
    ValOfK(int[] arr)
    {
        ValOfK.arr = arr;
    }

    static protected int findMaximumNum()
    {
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        // Write your code here
        int len = arr.length;
        int array_elements_remaining;

        for(int i=0; i<len; i++)
        {
            if(arr[i] < len)
            {
                array_elements_remaining = len - i;
                if(array_elements_remaining == arr[i] || (len-arr[i]) == arr[i])
                    return arr[i];
            }
        }

        return 0;
    }
}

public class MaxValK {
    public static void main(String[] args) {
        int[] arra = {1 ,2 ,3 ,4};
                //{2, 3, 4, 5, 6, 7};
        ValOfK vk = new ValOfK(arra);
        int output = ValOfK.findMaximumNum();

        System.out.println(output);

    }
}

/*

Input: arr[] = [2, 3, 4, 5, 6, 7]
Output: 4
Explanation: 4 elements [4, 5, 6, 7]  are greater than equal to 4.

Input: arr[] = [1, 2, 3, 4]
Output: 2
Explanation: 3 elements [2, 3, 4] are greater than equal to 2.

*/