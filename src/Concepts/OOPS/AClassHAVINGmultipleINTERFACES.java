package Concepts.OOPS;

// ---------------------------------------------------------
// 1. INTERFACES (The Capabilities)
// ---------------------------------------------------------
interface Add {
    // DOC NOTE: Interface methods are implicitly 'public' and 'abstract'.
    // You do not need to type 'public' here, but the implementing class MUST be public.
    int add(int a, int b);
}

interface Sub {
    int sub(int a, int b);
}

// ---------------------------------------------------------
// 2. ABSTRACT CLASS (The Parent)
// ---------------------------------------------------------
abstract class Multiply {
    // DOC NOTE: We use 'protected' so the Child class (Calculation) can access these directly.
    // If these were private, the Child could not see them.
    protected int a;
    protected int b;

    // DOC NOTE: Abstract classes can have constructors to initialize state,
    // even though you cannot say 'new Multiply()'.
    Multiply(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // DOC NOTE: This forces the child class to define HOW multiplication happens.
    // It can be protected or public, but NOT private.
    protected abstract int multiply();
}

// ---------------------------------------------------------
// 3. THE CHILD CLASS (The Implementation)
// ---------------------------------------------------------
// RULE: 'extends' must come before 'implements'.
// You can extend only 1 class, but implement N interfaces.
class Calculation extends Multiply implements Add, Sub {

    // DOC NOTE: I removed 'int a, b' from here.
    // We want to use the 'a' and 'b' inherited from 'Multiply', not create new ones.

    Calculation(int a, int b) {
        // CRITICAL FIX: super() must be the FIRST statement in a constructor.
        // It calls the constructor of the parent class (Multiply).
        super(a, b);
    }

    // ----------------- Implementing Abstract Parent Method -----------------
    @Override
    protected int multiply() {
        // Using 'this.a' and 'this.b' from the parent class
        return this.a * this.b;
    }

    // ----------------- Implementing Interface Methods -----------------
    // DOC NOTE: When implementing an interface, the method MUST be 'public'.
    // You cannot reduce visibility to protected or private here.

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

// ---------------------------------------------------------
// 4. MAIN CLASS
// ---------------------------------------------------------
public class AClassHAVINGmultipleINTERFACES {

    public static void main(String[] args) {

        // We pass 3,3 to the constructor, which sends it up to the 'Multiply' parent class
        Calculation c = new Calculation(3, 3);

        // These methods come from the Interfaces
        int add = c.add(5, 10);
        int subs = c.sub(10, 5);

        // This method comes from the Abstract Parent (Calculate)
        int mul = c.multiply(); // Uses the 3,3 we stored in the parent

        System.out.println("From Interfaces -> add: " + add + ", sub: " + subs);
        System.out.println("From Abstract Parent -> multiply: " + mul);
    }
}