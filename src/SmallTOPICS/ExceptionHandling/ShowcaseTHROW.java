package SmallTOPICS.ExceptionHandling;

class throwshow
{
    static int divide(int a, int b) throws Exception, ArithmeticException{ // Can declare multiple exceptions comma-separated
        if(b==0)
            throw new Exception("Cannot divide by 0"); // We throw this exception here
        // If we replace Exception with Arithmetic Exception then we do not need to add the statement throws Exception as we are stating
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
        catch (Exception e) {
            System.out.println("Does not make sense, "+e.getMessage()); // And the message we put in the throw statement is picked up in this catch block
        }
    }
}