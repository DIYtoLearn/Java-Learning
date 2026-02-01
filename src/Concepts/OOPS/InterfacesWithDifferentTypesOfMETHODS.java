package Concepts.OOPS;

// ---------------------------------------------------------
// 1. STATIC METHODS (Added in Java 8)
// ---------------------------------------------------------
interface StaticMethod {
    // DOC NOTE: These act like utility methods (helpers).
    // They belong to the Interface itself, NOT the object implementing it.
    // You cannot override them.
    static void method1() {
        System.out.println("Static Method: Accessed via StaticMethod.method1()");
    }
}

// ---------------------------------------------------------
// 2. PRIVATE METHODS (Added in Java 9)
// ---------------------------------------------------------
interface PrivateMethod {
    // DOC NOTE: These are used to share code between 'default' methods
    // to avoid code duplication inside the interface.
    // They are NOT visible to the implementing class.
    private void method2() {
        System.out.println("Private Method: Only visible inside this Interface.");
    }

    // A default method is required to expose the logic of the private method
    default void returnsThePrivateMethod() {
        System.out.print("Default calling Private -> ");
        method2(); // calling the internal helper
    }
}

// ---------------------------------------------------------
// 3. PROTECTED METHODS (Not Allowed)
// ---------------------------------------------------------
interface ProtectedMethod {
    // DOC NOTE: This is ILLEGAL.
    // Interfaces define a public contract ("What I can do").
    // 'Protected' implies internal inheritance details, which conflicts with
    // the concept of an interface being a public standard.

    /* protected void method3() {
        // COMPILER ERROR: Modifier 'protected' not allowed here
    }
    */
}

// ---------------------------------------------------------
// 4. DEFAULT METHODS (Added in Java 8)
// ---------------------------------------------------------
interface DefaultMethod {
    // DOC NOTE: These allow you to add new methods to an interface
    // WITHOUT breaking the classes that already implement it.
    // The class CAN override this, but it doesn't HAVE to.
    default void method4() {
        System.out.println("Default Method: Available to the object automatically.");
    }
}


// ---------------------------------------------------------
// MAIN CLASS
// ---------------------------------------------------------
public class InterfacesWithDifferentTypesOfMETHODS implements StaticMethod, PrivateMethod, DefaultMethod {

    public static void main(String[] args) {

        InterfacesWithDifferentTypesOfMETHODS obj1 = new InterfacesWithDifferentTypesOfMETHODS();

        // 1. Calling Default Method (Inherited automatically)
        obj1.method4();

        // 2. Calling Private Method Logic (Via the public default wrapper)
        obj1.returnsThePrivateMethod();

        // 3. Calling Static Method (Must use Interface Name)
        // obj1.method1(); // ERROR: Cannot call static interface methods via object reference
        StaticMethod.method1(); // CORRECT
    }
}

/*

Modifier,   Version,    Description,                                                                  Can be Overridden?
public,     Java 1.0,   The standard. Implicit for all abstract methods.,                             Yes (Must be public in child)

default,    Java 8,     Provides a fallback implementation.
                        Used for backward compatibility                                               Yes (Optional)

static,     Java 8,    "Utility helpers associated with the interface, not the object.",              NO

private,    Java 9,    Internal helpers to reduce code duplication within the interface itself.,      NO

protected,  N/A,       Never allowed. Interfaces are about public contracts only.,                    N/A



* */