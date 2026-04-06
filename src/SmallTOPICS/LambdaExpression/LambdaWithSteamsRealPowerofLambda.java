package SmallTOPICS.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaWithSteamsRealPowerofLambda {
    static void main() {

        List<Integer> alist =  Arrays.asList(10,20,30,40,50,60);

        alist.stream()
                .filter(n -> n>20)
                .forEach(System.out::println);

        List<String> names = Arrays.asList(
                "Alice", "Bob", "Charlie", "Adam");


        System.out.println("\nNames starting with 'A':");
        names.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}