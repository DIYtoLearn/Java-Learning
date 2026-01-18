package Concepts.OOPS;

    class complex
    {
        int real, imaginary;

        // Default Constructor
        complex()
        {
            this.real = 10;
            this.imaginary = 20;
        }

        // Argument accepting constructor
        complex(int real, int imaginary)
        {
            this.real = real;
            this.imaginary = imaginary;

        }

        void print()
        {
            System.out.println(real +" i"+imaginary);
        }

        void Add(complex c)
        {
            this.real +=  c.real;
            this.imaginary +=  c.imaginary;
        }
    }

public class Procedural {
    public static void main(String[] args) {
        complex c1 = new complex(10,20);
        c1.print();

        // How the add method is working ?
        // Initially during object creation c2 is created with real = 10 and imaginary = 20
        // Then we create a new object for the class complex 'c', where we pass real = 30 and imaginary = 20
        // We add the current value of real and imaginary held by reference c2 with reference c and get the output (40 i40)
        complex c2 = new complex();
        c2.Add(c2); // This is valid
        c1.Add(new complex(30,20));

        c2.print();
        c1.print();
    }
}