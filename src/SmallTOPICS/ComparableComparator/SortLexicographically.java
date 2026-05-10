package SmallTOPICS.ComparableComparator;
import java.util.Arrays;

class Point{
    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return("("+this.x+","+this.y+") ");
    }
}

public class SortLexicographically {
    public static void main(String[] args) {

        String[] arr = {"Abc", "Xyz", "flag", "adds", "tuTY", "dsa"};
        // Expected O/p Abc, adds, dsa, flag, tuTY, Xyz
        Arrays.sort(arr,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(arr));

        SortLexicographically.SortCoordinates();
    }


    protected static void SortCoordinates()
    {
        Point[] arr = { new Point(7,2),
                new Point(3,4),
                new Point(3,6)
        };

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (a,b)->{
            if(a.x != b.x)
                return a.x - b.x;

            return a.y - b.y;
        });

        System.out.println(Arrays.toString(arr));
    }
}