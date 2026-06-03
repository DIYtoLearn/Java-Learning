package Concepts.Equals_Hashing;

import java.util.Objects;

public class GenZEmployeeClass {

    private final int id;
    private  String name;

    // Default Constructor
    GenZEmployeeClass()
    {
        id = 0;
        name = null;
    }

    // Initialize with User inputted values
    GenZEmployeeClass(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "This Person "+name+" "+"ID'z "+id;
    }

    @Override
    public boolean equals(Object Obj)
    {
        if(this == Obj)
            return true;

        if(!(Obj instanceof GenZEmployeeClass Gcc)) // Pattern Matching
            return false;

        assert this.name != null;
        return this.name.equalsIgnoreCase(Gcc.name) ;

    }

    @Override
    public int hashCode() {
        if(name == null)
            this.name = "CricStar";
        return Objects.hash(name.toLowerCase());
    }
}