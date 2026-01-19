package SmallTOPICS.ExceptionHandling;

class throwshow
{
    static int divide(int a, int b) {
        if(b==0)
            throw new ArithmeticException("Cannot divide by 0");
        return a/b;
    }
}

public class ShowcaseTHROW {
    public static void main(String[] args) {
        int output = 0;
        try{
            output = throwshow.divide(10,5);
            System.out.println(output);
            output = throwshow.divide(10,0);
            System.out.println(output);
        }
        catch (ArithmeticException e) {
            System.out.println("Does not make sense, "+e.getMessage());
        }
    }
}