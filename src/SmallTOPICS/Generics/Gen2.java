package SmallTOPICS.Generics;

public class Gen2 {

    protected static <T> int count(T[] arr, T x){

        int res = 0;
        for(T e : arr)
        {
            if(e.equals(x))
                res++;
        }
        return res;
    }


    public static void main(String[] args) {
        Integer[] arr = {11,10,23,10,24,10,54,10};
        int req = count(arr,10);

        System.out.println("Repetition = "+req);


    }
}