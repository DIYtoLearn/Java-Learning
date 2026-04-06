package SmallTOPICS.LambdaExpression;

@FunctionalInterface
interface Operation{
    int DoingSomething (int a, int b);

    default void Display(int res)
    {
        System.out.println(res);
    }
}

public class Lambda1 {
    static void main() {

        Operation LambdaAddition = (x,y) -> (x+y);
        int result = LambdaAddition.DoingSomething(10,20);

        LambdaAddition.Display(result);

        Operation LambdaMultiplication = ((x,y) -> x*y);
        int result2 = LambdaMultiplication.DoingSomething(10,30);

        LambdaMultiplication.Display(result2);

    }
}