package SmallTOPICS.ExceptionHandling;

// If the custom exception class extends from Exception then the exception created is a checked one
// If the custom exception class extends RunTimeException then the exception created is an unchecked one
class InvalidAgeException extends Exception{
    InvalidAgeException(String message)
    {
        super(message);
    }
}

class AgeChecker
{
     int age;
    AgeChecker(int age)
    {
        this.age = age;
    }

    protected void checkAge() throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("check the entered age it is "+age);
        else if(age > 18 && age < 25)
            System.out.println("young Adult "+age);
        else
            System.out.println("Full Blown Adult"+age);

    }
}

public class MyException {
    public static void main(String[] args) {
        AgeChecker ag = null;

        ag = new AgeChecker(24);
        try{
        ag.checkAge();}
        catch (InvalidAgeException e)
        {
            System.out.println("Custom error, "+e.getMessage());
        }

        ag = null;
        ag = new AgeChecker(11);
        //ag.checkAge();
        try{
            ag.checkAge();
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Custom error, "+e.getMessage());
        }

    }
}