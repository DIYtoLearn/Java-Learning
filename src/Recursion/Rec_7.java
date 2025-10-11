package Recursion;

public class Rec_7 {
    static int powerRec(int a, int b)
    {
        // base case will till power == 0
        if(b == 0)
            return 1;

        return a * powerRec(a,b-1);

    }



    public static void main(String[] args) {
        int x = 2, power = 5;
        int result = powerRec(x,power);
        System.out.println(result);

    }
}
