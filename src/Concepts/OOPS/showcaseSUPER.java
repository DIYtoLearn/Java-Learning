package Concepts.OOPS;

class havesome{
    int x_case ;
    havesome()
    {
        x_case = 10;
    }

    havesome(int x_case)
    {
        this.x_case = x_case;
    }
}

class derived extends havesome{
    int y_case;
    derived()
    {
        //super(); // Line not required as when no value is passed for X, then it is printed it is default initialized using the
        // Default constructor, that is why when parameterized constructors are defined it is important to define default one's as well
        y_case = 10;
    }

    derived(int val1, int val2)
    {
        super(val1); // Removing val1 from here will default initialize X with the value 10
        y_case = val2;
    }

    void Print()
    {
        System.out.println("x Val = "+super.x_case);
        System.out.println("y Val = "+y_case);
    }
}

public class showcaseSUPER {
    public static void main(String[] args) {
        derived dr = new derived(110,120);
        dr.Print();
        System.out.println();
        dr = new derived();
        dr.Print();
    }
}
