package Concepts.OOPS;

class Parent2
{
    protected void print()
    {
        System.out.println("Parent print method");
    }
}

class child2 extends Parent2
{
    protected void print()
    {
        super.print();
        System.out.println("Child is good");

    }
}

class grandChild extends child2
{
    protected void print()
    {
        super.print();
        System.out.println("Grand child is gucci");
    }
}

public class MultiLevelInheritanceWithSUPER {
    public static void main(String[] args) {
        //Parent2 p1 = new child2();
        //p1.print();

        System.out.println();

        Parent2 p2 = new grandChild();
        p2.print();
    }
}

/*

The super keyword forces the execution order to be LIFO (Last In, First Out) regarding the class hierarchy:

Start: GrandChild
Goes to: Child
Goes to: Parent (Executes fully first)
Returns to: Child (Finishes execution)
Returns to: GrandChild (Finishes execution)

If we remove the super keyword from the child print method then the parent class print method will not be called
*/