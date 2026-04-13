package SmallTOPICS.LambdaExpression;
import java.util.Arrays;
public class MethodReference2 {
    static void main() {
        String[] a = {"GFG", "IDE", "HOLA"};
        String[] b = {"gfg", "ide", "hola"};

        if(Arrays.equals(a,b,String::compareToIgnoreCase))
            System.out.println("Is Equal");
        else
            System.out.println("Not equal");

        //Lambda Way

    }
}