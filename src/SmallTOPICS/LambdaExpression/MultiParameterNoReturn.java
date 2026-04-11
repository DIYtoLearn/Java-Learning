package SmallTOPICS.LambdaExpression;

@FunctionalInterface
interface implementation2{
    void print(int a, int b);
}


public class MultiParameterNoReturn {

    static void fun(implementation2 imp){
        imp.print(5,5);
    }

    static void fun2(implementation2 imp2,int p1, int p2){
        imp2.print(p1,p2);
    }

    static void main() {
        implementation2 lambda = (a,b) -> System.out.println("Operation "+(a+b));
        lambda.print(5,7);

        fun((a,b) -> System.out.println("Operation "+(a+b)));

        fun2((a,b)-> System.out.println("Operation "+(a+b)),10,20);

    }
}