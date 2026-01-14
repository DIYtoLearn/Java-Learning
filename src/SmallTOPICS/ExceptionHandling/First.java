package SmallTOPICS.ExceptionHandling;

    public class First {
        public static void main(String[] args) {
            System.out.println("Inside Main Method");
            First fs = new First();
            fs.MethodA();

        }

        protected void MethodA()
        {
            System.out.println("Inside Method A");
            MethodB();

        }

        protected static void MethodB()
        {
            System.out.println("Inside Method B");
            MethodC();
        }

        protected static void MethodC()
        {
            System.out.println("Inside Method C");
            int[] arr = new int[2];
            arr[0] = arr[1] = 5;
            int b = 9;

            //arr[2] = b;

    //        try {
    //            arr[2] = b;
    //        }
    //        catch (IndexOutOfBoundsException e)
    //        {
    //            System.out.println("Exception Handled in C "+ e.getMessage());
    //        }

            System.out.println("The value of b "+ b);

        }
    }

class checkAccessMeth
    {
        protected void AccessChecker()
        {
            First.MethodB();
        }
    }