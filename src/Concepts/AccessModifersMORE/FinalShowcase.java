package Concepts.AccessModifersMORE;

//Final Class
final class Hello{

    // Global Constant
    final static int MAX_VAL = 10;
    // MAX_VAL = 11; // Cannot change value final is immutable

   // Final instance variable
   final int NEW_VAL; {
       NEW_VAL = 100;
    }
    // NEW_VAL = 909; // Cannot change value final is immutable

    // Final method cannot be overriden
    final int Print()
    {
        System.out.println("Hello world!");
        return MAX_VAL;
    }
}

// Give's error Cannot inherit from final class 'Concepts.AccessModifersMORE.Hello'
//class checkingTRUTH extends Hello
//{
    // ERROR : cannot override 'Print()' in 'Concepts.AccessModifersMORE.Hello'; overridden method is final
//      final int Print(){
//        System.out.println("Overriden ??");
//    }
//}

public class FinalShowcase {
    public static void main(String[] args) {
        System.out.println(Hello.MAX_VAL); // No instance required to access a global constant

        Hello obj = new Hello();
        System.out.println(obj.NEW_VAL); // Non static instance variable requires object to access their value

        int req = obj.Print();
        System.out.println(req);


    }
}