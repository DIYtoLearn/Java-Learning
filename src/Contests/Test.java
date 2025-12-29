package Contests;

import java.util.stream.Stream;

class MyException extends Exception
{
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Stream.of("a","b","c").count());
        try {
            throw new MyException();
        }
        catch (Exception e)

        {
            System.out.println("caught");
        }
        finally {
            System.out.println("finally");
        }

    }
}
