package Concepts.OOPS;

public class Instance {
    public static void main(String[] args) {
        System.err.println("WARNING");

        //Instance of the class User = Object
        User u = new User();
        u.set_Values("Upayan", "Gold");
        System.out.println(u.getName());
        System.out.println(u.get_membership());

    }
}
