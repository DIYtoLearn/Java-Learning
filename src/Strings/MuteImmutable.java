package Strings;

public class MuteImmutable {

    static void Immutable(String s1)
    {
        String s2 = s1;
        int has1 = s2.hashCode();
        s1 = s1.concat("ing");
        int has0 = s1.hashCode();

            if(has1 == has0)
                System.out.println("Both String literal point to the same memory location in the String Pool !");
            else
                System.out.println("Different hascodes !");

    }

    static void Mutable(StringBuffer s3)
    {
        StringBuffer s4 = s3;
        int has2 = s4.hashCode();
        s3.append(" Operations!");
        int has3 = s3.hashCode();

        if(has2 == has3)
            System.out.println("String builder and buffer are mutable even when content is changed the memory location / hascode remains same !!");
        else
            System.out.println("Different hascodes !");

    }

    public static void main(String[] args) {
        // safe to use in multi-threaded environments and as keys in data structures like HashMap
        String s = "check";
        Immutable(s);

        // much more memory-efficient for repeated modifications
        StringBuffer sb = new StringBuffer("checking");
        Mutable(sb);

    }
}
