package Concepts.Classes_Objects;

interface MyInt {
    default void fun1() {
        System.out.println("fun1()");
    }

    static void fun2() {
        System.out.println("fun2()");
    }

    void fun3();
}

class Test implements MyInt {
    public void fun3() {
        System.out.println("fun3()");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.fun1();
        MyInt.fun2();
        t.fun3();
    }
}


//class Test2
//{
//    public Test2()
//    {
//        System.out.printf("1");
//        new Test2(10);
//        System.out.printf("5");
//    }
//    public Test2(int temp)
//    {
//        System.out.printf("2");
//        new Test2(10, 20);
//        System.out.printf("4");
//    }
//    public Test2(int data, int temp)
//    {
//        System.out.printf("3");
//
//    }
//
//    public static void main(String args[])
//    {
//        Test obj = new Test2();
//
//    }
//}
