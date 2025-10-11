package GFG.pracrise;
import java.util.Scanner;

class Point {int x2, y2;}

public class Methods{

    public static void main(String[] args) {
        if(args.length>0)
        {
            System.out.println("Arguments are ");
                    for(String x:args){
                        System.out.print(x+" ");
                    }
        }
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = Getmax(x,y);
        System.out.println("value of return "+z);

        Point p = new Point();
        p.x2 = 5;
        p.y2 = 10;
        passRef(p);
        passRef2(p);
        System.out.println(p.x2 +" "+ p.y2);

    }
    //Methods
    public static int Getmax(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    public static void passRef(Point p)
    {
        //In this case the changes made to the class variables x2 and y2 will be reflected back to the main call
        p.x2 = 10;
        p.y2 = 15;
    }

    public static void passRef2(Point p)
    {
        //In this case a new object is created for point what ever changes we make to x2 and y2 will not be reflected in mains output
        p = new Point();
        p.x2 = 11;
        p.y2 = 11;
    }

}