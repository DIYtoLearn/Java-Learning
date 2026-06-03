package SmallTOPICS.ExceptionHandling;

public class ClassCastException {
    public static void main(String[] args) {

        Object obj = "String";
        Object obj2 = null;
        String Casted_Object_to_String;
        String Casted_object_incorrectly;

        // Everything made in java can be stored as an object

        if(obj instanceof String) {
             Casted_Object_to_String = (String) obj;
             System.out.println(Casted_Object_to_String);
        }

        // This will result in the error ClassCastException as we are trying to cast an Integer to String
        if(obj2 instanceof Integer) {
            try {
                Casted_object_incorrectly = (String) obj2;
                System.out.println(Casted_object_incorrectly);
            }
            catch (java.lang.ClassCastException cp){
                System.out.println("No Casting");
            }
        }

        // To avoid the above scenario Pattern Matching was introduced in Java 16 for InstanceOf
        // Better way of writing the above code

        if(obj2 instanceof String str){
            System.out.println(str+" !");
        }
        else if(obj2 instanceof Integer i && i > 5){
            System.out.println(i+10);
        }
        else{
            System.out.println(obj2+" Cannot be owned ");
        }


        // Same Thing with Switch
        switch (obj2) {
            case String s when s.length() > 3 ->
                    System.out.println(s.toLowerCase());

            case Integer i when i > 3 ->
                    System.out.println(i + 20);

            case null ->
                System.out.println("KNULL Wins");

            default ->
                    System.out.println("Unstoppable");
        }
    }
}