package SmallTOPICS.LambdaExpression;

import java.util.Arrays;
import java.util.List;

class GFG2{
    private String Hello = "new world";

    public void setHello(String msg) {
        Hello = msg;
        System.out.println(Hello);
    }

     static void Square(int n)
     {
         System.out.println(n*n);
     }
}

public class MethodReference {
    public static void main(String[] args) {

        GFG2 obj = new GFG2();

        List<String> alist = Arrays.asList("java", "mastery");
        alist.forEach(obj::setHello); //objectReference::instanceMethod // Reference to an Instance Method of a Particular Object


        List<Integer> alist2 = Arrays.asList(3,4);
        alist2.forEach(GFG2::Square); // ClassName::staticMethodName // Reference to a Static Method

    }
}