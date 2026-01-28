package Concepts.AccessModifersMORE;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionForceFulWay {
    private String secretMessage = "Hidden Data";
    private void displaySecret() {
        System.out.println("Hidden Method Executed");
    }
}

public class PrivateAccess2 {
    public static void main(String[] args) throws Exception {
        ReflectionForceFulWay obj = new ReflectionForceFulWay();

        // 1. Accessing a Private Variable
        Field privateField = ReflectionForceFulWay.class.getDeclaredField("secretMessage");
        // The Key Step: Turn off the access check
        privateField.setAccessible(true);
        String value = (String) privateField.get(obj);
        System.out.println("Accessed Variable: " + value);

        // 2. Accessing a Private Method
        Method privateMethod = ReflectionForceFulWay.class.getDeclaredMethod("displaySecret");
        // The Key Step: Turn off the access check
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);
    }
}

