package Contests;

class Solving
{
    public static int equate(int n)
    {
        int sum=0;

        while(n>0) {
            double calculate_T =  ((2 * n) + Math.pow((n + 1), 2)) - ((Math.pow(n, 2)) + 4);
            sum+= (int) calculate_T;
            n--;

        }
        return sum;
    }
}

public class EquationSum {
    public static void main(String[] args) {

        for(int i=1; i<=3; i++) {
            int req = Solving.equate(i);
            System.out.println("Summation "+req);
        }
    }
}