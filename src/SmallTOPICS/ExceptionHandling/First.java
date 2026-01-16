package SmallTOPICS.ExceptionHandling;

// In this code we are showcasing how exception handling works
// There are 3 steps to exception handling
// TRY , CATCH, FINALLY
// TRY - You try your maybe unchecked error throwing lines of code
// CATCH - Handling of the error message that will be shown to the end user's
// FINALLY - No matter the error this will always execute if try block is executed
// The main usefulness of this is that the methods are not abruptly ended where the error is encountered instead the remaining lines of code are executed

    public class First {
        public static void main(String[] args) {
            System.out.println("Inside Main Method");
            First fs = new First();
            fs.MethodA(); // From main method calling the non static method MethodA, which inside the same class First
            System.out.println("Done Main");
        }

        protected void MethodA()
        {
            System.out.println("Inside Method A");
            MethodB(); // Calling MethodB which is a static method, since we are inside the same class no class object is required to call the other methods
            // First.MethodB(); // We can also call MethodB in this way since it is a static method, className.MethodName

            // MethodD(); // From a non static method can directly call another non static method without creating a class object
            // Instead of performing the error handling in the Method D we can perform it under this function as well
            // Added exception handling
            try{
                First fs2 = new First();
                fs2.MethodD();
            }
            catch (Exception e)
            {
                System.out.println("Handled in A "+ e.getMessage());
            }
            finally {
                System.out.println("Final line in Method A");
            }
            System.out.println("Method A executed");
        }

        protected static void MethodB()
        {
            System.out.println("Inside Method B");
            MethodC(); // calling the method C where we do the exception handling
            System.out.println("Method B executed");
        }

        protected static void MethodC()
        {
            System.out.println("Inside Method C");
            int[] arr = new int[2];
            arr[0] = arr[1] = 5;
            int b = 9;

            // arr[2] = b; // The error code lines the array size is 2 and we are trying to access the 3rd index in the array which will result in an index out of bounds

            // Without exception handling lines of code the error would be encountered on the C Method call which then would require the OS to intervene instead of JVM
            try {
                arr[2] = b;
            }
            catch (IndexOutOfBoundsException e) // This is noting but writing IndexOutOfBoundsException e = new IndexOutOfBoundsException();
                    // All the unchecked exception inherit from the parent class Exception
            {
                System.out.println("Exception Handled in C "+ e.getMessage());
            }
            finally
            {
                System.out.println("The value of B printed via finally line in method C = "+ b);
            }

            System.out.println("Method C executed");
        }

        // Created another method where there is an error line of code
        protected void MethodD()
        {
            System.out.println("Method D started");
            int a = 10/0; // Diving a number by 0 will result in arithmetic exception
            System.out.println("error line "+a);
            // In this method nothing will be executed after the previous error line of code because the exception handling is not done here instead it is done on method A
            // Same would have if we would have not done exception handling for the error line of code in Method C
            System.out.println("Method D executed");
        }
    }