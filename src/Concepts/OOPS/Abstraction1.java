package Concepts.OOPS;

abstract class cuisine{
    private String item ; // Private instance variable whose value is set using the parameterized constructor

    abstract String Food(); // The abstract method which has no implementation code in it YET !

    // Constructor to set the value for item
    cuisine(String it)
    {
        item = it;
    }

    // Public GET method to return the value for item
    public String getItem() {
        return item;
    }

    protected static void FinalDishStatus() // Abstract classes can have static methods in them
    {
        String ss = "Still cooking..";
        System.out.println(ss);
    }
}

class Indian extends cuisine{

    Indian(String starter)
    {
        super(starter);
    }

    protected String Food()
    {
        String s1 = "Cooking items...";
        return s1;
    }
    // @Override  <-- This annotation would cause an ERROR here!
    protected static void FinalDishStatus() // Overriding the static method ?? NO! This is METHOD HIDING
    // Here if we create a reference type cuisine and object of Indian and call this method the child class method wil be hidden
    // The cuisine class's method code will be executed
    {
        String ss = "DONE !!";
        System.out.println(ss);
    }
}

class Abstraction1 {
    public static void main(String[] args) {

        cuisine c1 = new Indian("Fish Fry");
        String what_is_today = c1.getItem();
        System.out.println(what_is_today);

        String status_update = c1.Food();
        System.out.println(status_update);
        c1.FinalDishStatus(); // This is why we must always call static methods with the classname.methodname()
//        cuisine.FinalDishStatus();
//        Indian.FinalDishStatus();
    }
}