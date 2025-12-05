package GFG;

public class TwoSum {
    public static void main(String[] args) {
        int i2 = -1;
        int j2 = 2;
        int c = 0;
        c = i2 + j2;
        //System.out.println(c);

        int[] arr = {0, -1, 2, -3, 1};
                //{1, -2, 1, 0, 5};
        //{0, -1, 2, -3, 1};
        int target = -2;
        boolean bool = false;

                int pair_sum = 0;
                for (int i = 0; i < arr.length - 1; i++)
                {
                    if(bool == true)
                        break;

                    for(int j=i+1; j < arr.length ; j++)
                    {
                        pair_sum = arr[i] + arr[j];
                        if(pair_sum == target)
                        {
                            bool = true;
                            break;
                        }
                    }
                }

        System.out.println(bool);
    }
}