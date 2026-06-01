package Concepts.Equals_Hashing;

public class GeniusClass {

    private  String Name_of_the_genius = "";
    private  String Field_of_genius = "";


    public void setGeniusValues(String name, String field){
        Name_of_the_genius = name;
        Field_of_genius = field;

    }

    @Override
    public String toString()
    {
        return Name_of_the_genius+" "+Field_of_genius+"\nGuru Form E ache";
    }

    // Overriding the equals method of object class to return the result of comparing two objects of the class Genius as I, the developer see's fit !!
    // https://app.notion.com/p/equals-Override-372f2887bb3880149760c53855d8e51f#372f2887bb38805bb661d2942ded10d0

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        /* What does the below if statement DO ?
         Pattern Matching in java for instanceof
         Checks if obj is null (if it is, it returns false).
         Checks if obj is actually a GeniusClass object (if you tried to compare GC1 to a Scanner object, it would return false).
         If it is a GeniusClass, it automatically casts it and assigns it to a new variable called other so you can access its fields.
         */
        if (!(obj instanceof GeniusClass other))
            return false;

        return this.Name_of_the_genius.equalsIgnoreCase(other.Name_of_the_genius)
                &&
                this.Field_of_genius.equalsIgnoreCase(other.Field_of_genius);
    }
}