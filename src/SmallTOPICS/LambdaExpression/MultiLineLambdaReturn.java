package SmallTOPICS.LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface implementation3
{
    boolean checkedOdd(int n);
}

public class MultiLineLambdaReturn {
    static void main() {

        implementation3 lambda = p ->{
            if(p<0 || p == 1)
                return false;
            else return p % 2 != 0;
        };

        //--INPUT--
        int number_to_check;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        number_to_check = sc.nextInt();

        boolean res = lambda.checkedOdd(number_to_check);
        System.out.println("Is Odd ? "+res);
    }
}