package OOPS;

public class User {
    private String name;
    String membership;

    // Setter method to set the value for the class attribute name
    public void set_Values(String name, String membership)
    {
        // this keyword is used in setter methods in Java primarily to resolve ambiguity when an instance variable (or class attribute) has the same name as a method parameter.ame
        this.name = name;
        this.membership = membership;
    }

    // Getter method to get the value for the class attribute name that is set using the method set_Name
    String getName()
    {
        return name;
    }

    String get_membership()
    {
        return membership;
    }
}
