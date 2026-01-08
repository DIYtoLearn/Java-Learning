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
