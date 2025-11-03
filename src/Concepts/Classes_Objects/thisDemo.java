package Concepts.Classes_Objects;

class User2
{
    static int User2Counter = 0; // Static counter shared by the class
    int id;                      // Instance variable, unique to each object
    String name;

    User2(String name)
    {
        this.id = ++User2Counter;

        /*
        If the below declaration is used the local variable is assigned to itself.
        The instance variable remains assigned the default value null
        Hence in this case the print statement will print something like this
        NAME: null IDENTIFICATION: 1
         */
        // name = name;

        /*
        Here the instance variable is not hidden because we use
        "this keyword" which is always a reference to the object on which the method was invoked
        The output in this case is NAME: Hertz IDENTIFICATION: 2
         */
        this.name = name;
    }

    void print()
    {
        System.out.println("NAME: "+name+" IDENTIFICATION: "+id);
    }
}

public class thisDemo {
    public static void main(String[] args) {
        User2 us1 = new User2("Death");
        User2 us2 = new User2("Hertz");

        us1.print();
        us2.print();

    }
}
