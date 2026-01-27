package Concepts.OOPS;

interface Shape2{

    double CalculateArea();
}

class circle2 implements Shape2 {
    private double radius;

    circle2(double radius) {
        this.radius = radius;
    }

     public double CalculateArea()
    {
        return Math.PI*radius*radius;
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Shape2 s1 = new circle2(2.22);
        System.out.println("The Area = "+s1.CalculateArea());
    }
}