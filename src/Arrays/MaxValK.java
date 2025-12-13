package Arrays;

class ValOfK{
    int[] arr;
    ValOfK(int[] arr)
    {
        this.arr = arr;
    }

    protected int findMaximumNum()
    {
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        //Write your code here




    }
}

public class MaxValK {
    public static void main(String[] args) {
        int[] arra = {2, 3, 4, 5, 6, 7};
        ValOfK vk = new ValOfK(arra);
        int output = vk.findMaximumNum();

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