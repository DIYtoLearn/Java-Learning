package BinarySearch;

public class RecursiveBinarySearch {
    static void main() {
        int[] arr = { 2, 3, 4, 10, 40 };
        int length = arr.length;
        int searchElement = 400;

        int res = BinarySearch(arr, 0, length - 1, searchElement);

        System.out.println("Element to be searched is : "+ searchElement);

        if (res == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index: " + res);

    }

    protected static int BinarySearch(int[] arr, int left, int right, int target)
    {
        if(left <= right)
        {
            int mid = (right+left)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] > target)
                return BinarySearch(arr, left, mid-1,target);

            return BinarySearch(arr,mid+1,right,target);
        }

        return -1;
    }
}