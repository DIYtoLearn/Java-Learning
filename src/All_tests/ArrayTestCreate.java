package All_tests;

public class ArrayTestCreate {
    public static void main(String[] args) {

        Integer[] arr = new Integer[5];
        // Integer type array , object created for class Integer

        for(Integer i=0; i<arr.length; i++)
        {
            arr[i] = 23;
            //System.out.print(arr[i]+" ");
        }

        for(Integer in : arr)
        {
            //in = 1;
            System.out.print(in+" 😂");
        }
    }
}
