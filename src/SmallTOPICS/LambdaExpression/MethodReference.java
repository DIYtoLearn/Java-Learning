package SmallTOPICS.LambdaExpression;

import java.util.function.Supplier;

class GFG2{
    private static String Hello = "new world";

    public static String getHello()
    {return Hello;}
}

public class MethodReference {
    public static void main(String[] args) {
        //GFG2 obj = new GFG2();
        //System.out.println(obj.getHello());

        Supplier<String> sup = GFG2::getHello;
        System.out.println(sup.get());

    }
}