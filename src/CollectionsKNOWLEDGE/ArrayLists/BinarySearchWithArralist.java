package CollectionsKNOWLEDGE.ArrayLists;

import BinarySearch.InputClass;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Search
{
    protected void operation(ArrayList<Integer> list)
    {
        System.out.println(list);
        int low = 0;
        int high = list.size()-1;
        boolean found = false;
        int target = 5;
        int index = -1;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(list.get(mid) == target){
                found = true;
                index = mid;
                break;
            }
            else if(list.get(mid)>target)
            {
                high = mid-1;
            }
            else{
                low = mid+1;}

        }
        System.out.println("The taget element is "+found+" and the index is "+index);
        }
    }

public class BinarySearchWithArralist {
    public static void main(String[] args) {

        InputClass ic = new InputClass();
        int[] in = ic.Input();
        //System.out.println(Arrays.toString(in));

        // Convert int[] to List<Integer>
        List<Integer> list = Arrays.stream(in)      // Create an IntStream
                .boxed()                            // Box int to Integer
                .collect(Collectors.toList());

        Search sc = new Search();
        sc.operation((ArrayList<Integer>) list);
    }
}