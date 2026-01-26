package Concepts.OOPS;

class newTest{

    protected int Sum(int a, int b)
    {
        System.out.println("The int method is called ");
        int sum = a+b;
        return sum;
    }

    /* As we know Method overloading only based on the return type of a method is not correct
    In Our version of JAVA which is 21 it is straight away throwing a error before compilation that we cannot have same signature and only different return type
    'Sum(int, int)' clashes with 'Sum(int, int)'; both methods have same erasure // ERROR
    Changing the type of one of the variable or reducing the number of parametes removes the error
    * */
//    protected double Sum(int a, int b)
//    {
//        double sum = a;
//        return sum;
//    }


    /*
    * In the below method the arguments passed as the parameters for the method are of type float
    * whereas the accepting data type is double
    * In this method overloaded case since double can hold a float value hence the arguments are upcasted to double
    *
    * */

    protected int Sum(double a, double b)
    {
        System.out.println("The float is called ");
        int sum = (int)(a+b);
        return sum;
        //System.out.println(sum);
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        newTest nt = new newTest();
        int req = nt.Sum(1.2111f,1.5221f);
        System.out.println(req);

        int req2 = nt.Sum(1,2);
        System.out.println(req2);
    }
}