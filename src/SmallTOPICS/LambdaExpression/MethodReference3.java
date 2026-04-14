package SmallTOPICS.LambdaExpression;
import java.util.function.Function;
import java.util.function.Supplier;

class ConstructorMethodReference {
    String wassup = null;
    ConstructorMethodReference(String wassup){
        this.wassup = wassup;
        System.out.println(wassup);
    }

}

public class MethodReference3 {
    static void main() {
        //Constructor reference + parameters = use Function, not Supplier
        Function<String, ConstructorMethodReference> sup = ConstructorMethodReference::new;
        sup.apply("Hello");

        // Since Supplier cannot pass any value, we use lambda to pass value manually
        Supplier<ConstructorMethodReference> sup2 = () -> new ConstructorMethodReference("Hello2");
        sup2.get(); // When sup2.get() is called, a new object is created

    }
}

// Method/constructor reference's don’t take arguments directly, The functional interface decides what arguments are passed