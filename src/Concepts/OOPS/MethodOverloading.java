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


    protected float Sum(float a, float b)
    {
        System.out.println("The float is called ");
        float sum = (a+b);
        return sum;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        newTest nt = new newTest();
        double req = nt.Sum(1.21,1.52);
        System.out.println("The Sum = "+req);


    }
}
