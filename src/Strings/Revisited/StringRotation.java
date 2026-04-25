package Strings.Revisited;

// https://www.geeksforgeeks.org/batch/jbdl-blr-8/track/Java-Collections-String/problem/check-if-strings-are-rotations-of-each-other-or-not-1587115620
public class StringRotation {
    public static void main(String[] args) {
        StringBuffer first = new StringBuffer("GFG");

        System.out.println(first.toString().indexOf(" "));


        String a = null;
        String b = null;
        try {
            System.out.println(a.contains(b));
        }
        catch (NullPointerException e){
            System.out.println("Knull hogaya !");

        }
    }
}