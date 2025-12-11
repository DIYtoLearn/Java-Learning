package Arrays;
/*
Input:
n = 3
a[] = {4,1,2}
b[] = {1,7,3}
q = 2
query[] = {0,1}
Output :
2
1
Explanation:
For 1st query, the given index is 0, a[0] = 4. There are 2 elements(1 and 3) which are less than or equal to 4.
For 2nd query, the given index is 1, a[1] = 1. There exists only 1 element(1) which is less than or equal to 1.
* */

class CountEl
{
    protected int[] Element(int[] a, int[] b, int n, int[] query, int q)
    {
        int[] count = new int[n];
        int index = 0;
        int new_index=-1;

        for(int i=0; i<query.length; i++)
        {
            if(i >= n)
            {
                return count;
            }

            else
            {
                for(int j=0; j<n; j++)
                {
                    if(b[j] <= a[i])
                        count[index]++;

                }
                index++;
                new_index++;
            }
        }
        //System.out.println(new_index);

        int[] required = new int[new_index];

        return count;

    }
}



public class CountTHEelements {
    public static void main(String[] args) {

        int[] arr = {1,1,5,5};
                //{4,1,2};
        int[] arr2 = {0,1,2,3};
                //{1,7,3};
        int size = arr.length;

        int query_element = 4;
        int[] query_array = {0,1,2,3};
                //{0,1};

        CountEl Cel = new CountEl();
        int[] val = Cel.Element(arr,arr2,size,query_array,query_element);

        for(int x : val)
        {
            System.out.println(x);
        }
    }
}