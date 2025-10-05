package Array_Strings;

public class String_test {
    public static void main(String[] args) {
        char[] arr = {'g', 'e', 'e', 'k', 's'};
        System.err.println(arr);
        System.out.println(arr.length);

        String s = "GeekFG";
        System.out.println(s);
        System.out.println(s.substring(1, 3));

        String s1 = "geeks";
        String s3 = new String("geeks");

        if (s1 == s3)
            System.out.println("Fo");
        else if (s1.equals(s3))
            System.out.println("A String literal and an object created using the new keyword will never be equal even if they have the same content,\n this is because the object created using new keyword is stored in the heap memory");
        else
            System.out.println("NONE");

        String m1 = "checking";
        int len = m1.length();
        System.err.println(len+10);
    }
}