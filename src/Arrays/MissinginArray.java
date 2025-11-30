package Arrays;

class Solution {
    int missingNum(int arr[]) {
        int len = arr.length+1;
        int sum = 0;
        int sum2 = 0;
        int missing_element;

        for(int i=1; i<=len; i++)
        {
            sum = sum+i;

            if(i<=len-1)
            {
                sum2 = sum2+arr[i-1];
            }
        }
        System.out.println(sum2+" "+sum);
        missing_element = sum - sum2;
        return  missing_element;

    }
}

public class MissinginArray {
    public static void main(String[] args) {

        Solution sn = new Solution();
        int[] arr = {1};
        int req = sn.missingNum(arr);
        System.out.println(req);

    }
}