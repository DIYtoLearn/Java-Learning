package Concepts.AccessModifersMORE;
// Private Methods cannot be Overriden
//
class testPrivate{

    private int sumofNum(int a, int b)
    {
        int sum = a+b;
        System.out.println("return Sum");
        return sum;
    }

    int getsum(int a, int b)
    {
        return sumofNum(a,b);
    }
}

class Overdriverride extends testPrivate{
    //@Override // ERROR: method does not override or implement a method from a supertype is the compiler telling you:
    // "You asked me to replace a method from the parent, but as far as I can see, that method doesn't exist."

    // Without @Override: If you delete that line, the code will compile.
    // However, Java will treat the child's sumofNum as a brand new, completely unrelated method.
    // It just happens to have the same name.
    private int sumofNum(int a, int b){
        int diff = a-b;
        System.out.println("return diff");
        return diff;
        }

        @Override // The below method is an example of Method override
        int getsum(int a, int b)
        {
           return sumofNum(a,b);
        }
    }

public class PrivateOverride {
    public static void main(String[] args) {

        testPrivate tpr = new testPrivate();
        int reqSum = tpr.getsum(1,1);
        System.out.println(reqSum);

        testPrivate tpr2 = new Overdriverride();
        double reqSum3 = tpr2.getsum(13,145);

        System.out.println(reqSum3);
    }
}