package Concepts.OOPS;

class Parent{
    void print()
    {
        System.out.println("Parent method print");
    }
}

class child extends Parent
{
    void print()
    {
        super.print(); //Adding super with the method name calls the parent class method
        System.out.println("after super call in child class");
    }
}


public class MethodOverridingWithSuper {
    public static void main(String[] args) {

        // concept of creating an object of a child class and assigning it to a reference variable of the parent class is called Upcasting
        Parent p1 = new child();
        //Reference Type (Parent): You are telling the compiler, "Treat p1 as a generic Parent object."
        //Object Type (child): In memory, the actual object created is technically a child.
        //Because a child is-a Parent (due to inheritance), Java allows this automatically (implicitly).
        //You don't need to write (Parent) new child(); it happens naturally.

        p1.print();
    }
}
