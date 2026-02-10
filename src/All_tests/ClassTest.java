package All_tests;

import java.util.ArrayList;
import java.util.List;

abstract class Shape2{

    protected abstract double calculateArea();

    protected void display()
    {
        System.out.println("This is a shape");
    }
}


class CircleNew extends Shape2{

    private double radius;

    CircleNew(double radius)
    {
        this.radius = radius;
    }

    @Override
    protected double calculateArea()
    {
        return Math.PI*radius*radius;
    }
}

class RectangleNew extends Shape2{

    private double length, width;

    RectangleNew(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calculateArea()
    {
        return length*width;
    }
}


public class ClassTest {
    public static void main(String[] args) {

        List<Shape2> ls1 = new ArrayList<>();
        ls1.add(new CircleNew(11));
        ls1.add(new RectangleNew(11,11));


        // 1. Get the object safely via enhanced for loop
        // Shape s = new CircleNew(11) this is what we are doing inside the loop when iterating through the loop
        for (Shape2 s : ls1) {
            s.display();          // 2. Call the void method
            double area = s.calculateArea(); // 3. Call the abstract method
            System.out.println("AREA = " + area);

        }
    }
}