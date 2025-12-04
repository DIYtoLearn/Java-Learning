package BinarySearch;

class Search
{
    protected void bs(int target, int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        boolean found = false;
        while(true)
        {
            if(mid == target)
            {
                found = true;
                break;
            }

            else {
                

            }

        }
    }
}

public class BinarySearch {
    public static void main(String[] args) {

        InputClass ic = new InputClass();
        int[] in = ic.Input();

        Search sc2 = new Search();
        sc2.bs(11,in);
    }
}
