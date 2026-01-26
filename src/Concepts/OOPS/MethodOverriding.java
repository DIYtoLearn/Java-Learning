package Concepts.OOPS;

abstract class Employees
{
    abstract void raiseSalary();
    abstract void promote();
}

class Engineer extends Employees{
    @Override
    void raiseSalary()
    {
        System.out.println("ENGINEER: salary raised by 20%");
    }

    @Override
    void promote()
    {
        System.out.println("ENGINEER: Promotion will be done in the next financial Year ");
    }

}

class KamTeam extends Employees{
    void raiseSalary()
    {
        System.out.println("KamTeam: Bohot Paisa");
    }

    void promote()
    {
        System.out.println("KamTeam: Get that senior Tag");
    }

}


public class MethodOverriding {
    public static void main(String[] args) {
        Employees[] emp = {new Engineer(), new KamTeam()}; // An array of class Employees where each element is a new object of the
        // child classes / implementation classes that implment the interface Employees

        System.out.println("---2026 Promotion---");
        for(Employees e : emp)
        {
            e.promote();
        }

        System.out.println("\n---2026 Salaries---");
        for(Employees e: emp)
        {
            e.raiseSalary();

        }
    }
}