package Concepts.Classes_Objects;

import org.jetbrains.annotations.NotNull;

class Complex {
    int real , imag;

    public void print()
    {
        System.out.println(real + " " + imag);
    }

    Complex(int real, int imag)
    {
        this.real = real;
        this.imag = imag;

        System.out.println(real +" "+ imag);
        System.out.println(real +" "+ imag);

        real = 15;
        imag = 16;

        System.out.println(real +" "+ imag);
        System.out.println(real +" "+ imag);
    }

    public void add(@NotNull Complex c)
    {
        real = real + c.real;
        imag = imag + c.imag;
    }
}


public class ClassObj {
    public static void main(String[] args) {

        //Complex c1 = new Complex(10,20);
        //c1.print();

        Complex c2 = new Complex(20,30);
        //c1.add(c2);
        //c2.print();


    }
}
