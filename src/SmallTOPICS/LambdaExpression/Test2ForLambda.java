package SmallTOPICS.LambdaExpression;


@FunctionalInterface
interface Hello {
    void Operation(int n, int a);
}

class Solution {
    public static Hello helperFunction() {
        Hello obj =  (n,a) -> {
            int result = n * 5;
            int result2 = n+a;
            System.out.println(result+" "+result2);
        };
        return obj;
    }
}

public class Test2ForLambda {
    static void main() {
        Hello h =  Solution.helperFunction();
        h.Operation(10, 10);
    }
}