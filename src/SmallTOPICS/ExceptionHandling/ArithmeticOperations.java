package SmallTOPICS.ExceptionHandling;

import java.util.ArrayList;
import java.util.ListIterator;

class ALloperations{

    static ArrayList<Integer> als = new ArrayList<>();

    protected static void AddAllvaluesAfterOperation(int a, int b)
    {
        int sum = a+b;
        int sub = a-b;
        int multi = a*b;
        int div = 0;

        try{
        div = a/b;}
        catch (ArithmeticException e)
        {
            System.out.println("Division by 0 not allowed, "+e.getMessage());
        }

        als.add(sum);
        als.add(sub);
        als.add(multi);
        als.add(div);
    }

    protected static int returnMinimum()
    {
        AddAllvaluesAfterOperation(50,2);
        System.out.println(als);
        ListIterator<Integer> it = als.listIterator();
        int min = Integer.MAX_VALUE;

        while(it.hasNext())
        {
            int compare_element = it.next();
            if(compare_element < min)
                min = compare_element;
        }
        return min;
    }
}

public class ArithmeticOperations {
    public static void main(String[] args) {

        int req = ALloperations.returnMinimum();
        System.out.println("The minimum after all operations "+req);
    }
}