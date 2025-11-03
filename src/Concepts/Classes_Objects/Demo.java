package Concepts.Classes_Objects;


class user
{
    int PlayerID;
    static int id = 0;
    private int nint = 110;

    // Global constant variable for the class user
     static final int XXX ;
     // static initialization is class level
     static {
         XXX = 133;
     }

    user(String _playerName, int _playerAge)
    {
        //PlayerID = ++id;
        System.out.println("Name: "+_playerName+" "+"Age: "+_playerAge+" "+"ID: "+getPlayerCount());

    }

    static int getPlayerCount()
    {
        return ++id;
    }
}

class Demo
{
    public static void main(String[] args)
    {
        user cret = new user("Upayan", 26);
        user cret2 = new user("Adrija", 25);

        //int val = cret2.nint; // Cannot use this because of private specifier of the instance variable nint

        // ClassName.static_class-variable
        System.out.println(user.id);

        //objectName.class_variable
        System.out.println(cret.PlayerID);
        System.out.println(cret2.PlayerID);

        //static method can be used without a class object
        // ClassName.static_method
        System.out.println(user.getPlayerCount());

        /* "final StringBuffer sb" Can be used to perform addition of string or modification of the already initialized string
        but cannot be used to create a new string object in the heap memory using sb = new StringBuffer("Hello");
         */

        final StringBuffer sb = new StringBuffer("final");
        sb.append(" Not!");
        System.out.println(sb);

        sb.delete(0,sb.length());
        System.out.println(sb+" T");
    }
}