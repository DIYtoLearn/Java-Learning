package SmallTOPICS.Generics;

class TestClass{

    // Utility Function
    protected static <T> void print(T values){
        System.out.println(values);
    }

    // Identity Function
    protected static <T> T print2(T values2){
        return values2;
    }

    // Generic Method with Two Type parameter and returning a generic Types
    protected static <T,U> T print3(T values3, U values4){
       if(values4.equals(100))
        return values3;

       else
           return null;
    }

    public static <T> T getLast(T[] array){

        // Print every element of the array
        for(T element : array){
            System.out.print(element+" ");
        }

        // return only the last element of the array
        int len = array.length;
        return array[len-1];
    }
}

public class MethodsWithGenerics {
    public static void main(String[] args) {

        TestClass.print("String");
        TestClass.print(100);
        TestClass.print(new StudentRecord<>(1, 100));

        Integer res1 = TestClass.print2(100); System.out.println(res1);
        String res2 = TestClass.print2("Hello"); System.out.println(res2);

        Character c1 = TestClass.print3('W', 10);
        System.out.println(c1);

        Integer[] arr = {1,2,3,4,5};
        Integer retval = TestClass.getLast(arr);
        System.out.println("\n"+retval);

    }
}