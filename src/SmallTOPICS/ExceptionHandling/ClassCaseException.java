package SmallTOPICS.ExceptionHandling;

public class ClassCaseException {
    public static void main(String[] args) {

        Object obj = "String";
        Object obj2 = 12;
        String Casted_Object_to_String;
        String Casted_object_incorrectly;

        // Everything made in java can be stored as an object

        if(obj instanceof String) {
             Casted_Object_to_String = (String) obj;
             System.out.println(Casted_Object_to_String);
        }

        // This will result in the error ClassCastException as we are trying to cast an Integer to String
        if(obj2 instanceof Integer) {
            Casted_object_incorrectly = (String) obj2;
             System.out.println(Casted_object_incorrectly);
        }

        // To avoid the above scenario Pattern Matching was introduced in Java 16 for InstanceOf


    }
}