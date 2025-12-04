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
            if(arr[mid] == target)
            {
                mid+=1; // To start indexing from 1
                System.out.println("index = "+mid);
                found = true;
                break;
            }

            else {
                if(high < low)
                {
                    System.out.println("NOT FOUND");
                    break;
                }
                if(arr[mid] < target)
                {
                    low = mid + 1;
                    mid = (low + high) / 2;
//                    if(arr[high] == target || arr[low] == target)
//                    {
//                        System.out.println("index "+high+" index2 "+low);
//                        found = true;
//                        break;
//
//                    }
                }
                else if(arr[mid] > target)
                {
                    high = mid - 1;
                    mid = (low + high) / 2;
//                    if(arr[high] == target || arr[low] == target)
//                    {
//                        System.out.println("index "+high+" index2 "+low);
//                        found = true;
//                        break;
//
//                    }
                }
            }
        }

        System.out.println(found);
    }

    protected void bs2GPT(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found);
    }
}

public class BinarySearch {
    public static void main(String[] args) {

        InputClass ic = new InputClass();
        int[] in = ic.Input();

        Search sc2 = new Search();
        sc2.bs(1,in);
    }
}
