package Recursion;

// Sum of first N numbers

public class Rec_3 {
    static int Sum(int n)
    {
        if(n==0)
            return 0;

        return n + Sum(n-1);
    }

    public static void main(String[] args) {
        int res = Sum(5);
        System.out.println(res);
    }


}
