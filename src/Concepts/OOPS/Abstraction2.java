package Concepts.OOPS;

//This program demonstrates partial abstraction by defining an abstract class Shape that includes an abstract method area(), a concrete method getColor(), and a constructor.

import java.util.Arrays;

abstract class shape{
    abstract double area();

    String color;
    // Setting the color value inside the construtor
    shape(String color)
    {
        this.color = color;
    }
    // A concrete method
    public String getcolor(){
        return color;
    }

    public abstract String toString();
}

class Circle extends shape {
     int radius;

    Circle(String color, int radius){
        super(color);
        System.out.println("Made the call to the abstract constructor for the color setting of shape circle");
        this.radius = radius;

    }

    @Override
     double area()
    {
         return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString()
    {
        //return   getClass().getName() + '@' + Integer.toHexString(hashCode());
       return "The area of circle is = "+area()+" and the color is "+super.getcolor();

    }
}

class Rectangle extends shape{
    int length, breath;

    Rectangle(String color, int length, int breath)
    {
        super(color);
        System.out.println("Made the call to the abstract constructor for the color setting of shape Rectangle");
        this.length = length;
        this.breath = breath;
    }

    @Override
    double area() {
        return length*breath;
    }

    @Override
    public String toString() {
        return "The area of the Rectangle = "+area()+" and the color is "+getcolor();
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        shape s1 = new Circle("Godly",2);
        System.out.println(s1);

        shape s2 = new Rectangle("Mega",5,4);
        System.out.println(s2);
        //System.out.println(s1.getcolor() + " "+ Arrays.toString(s2.getClass().getConstructors())); // Playing around
    }
}