package Concepts.Classes_Objects;

class BoxVal{

    double height;
    double width;
    double length;

    BoxVal(double x, double y, double z)
    {
        height = x;
        width = y;
        length = z;
    }

    public double volume()
    {
        return height * width * length;
    }
}

public class Box {
    public static void main(String[] args) {
        BoxVal myBox = new BoxVal(10,20,30);

//        myBox.height = 10;
//        myBox.width = 10;
//        myBox.length = 10;

        double req = myBox.volume();
        System.out.println("The required volume: "+ req);


    }

}
