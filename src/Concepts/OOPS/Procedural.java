package Concepts.OOPS;

    class complex
    {
        int real, imaginary;

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
            real = real + c.real;
            imaginary = imaginary + c.imaginary;
        }
    }

public class Procedural {
    public static void main(String[] args) {
        complex c1 = new complex(10,20);
        c1.print();
        c1.Add(new complex(30,20));
        c1.print();


    }
}