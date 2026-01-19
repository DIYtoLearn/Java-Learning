package SmallTOPICS.ExceptionHandling;

public class NullException {
    public static void main(String[] args) {
        String test = null;

        try {
            System.out.println(test.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Understanding the Null error, "+e.getMessage());
        }
    }
}
