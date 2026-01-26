package Concepts.AccessModifersMORE;

class user{
    int playerID;
    static int id = 0; // No matter How many objects of the class user is created the value for ID will be same for all of them
    String PlayerName;

    user()
    {
        PlayerName = "Tron";
        playerID = 02041;
    }

    user(String name)
    {
        PlayerName = name;
        playerID = ++id;

    }
    void print()
    {
        System.out.println("Name: "+PlayerName+" ID: "+playerID);
    }
}


public class Static {
    public static void main(String[] args) {
        user u1 = new user("DeatHerTZ");
        user u2 = new user("TooMuch");

        u2.print();
        u1.print();

        u1 = new user();
        u1.print();

        System.out.println("Accessed value of id in class user directly without object creation since the field is static = "+user.id);
    }
}