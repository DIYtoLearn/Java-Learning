package Strings;


public class String_101 {
    public static void main(String[] args) {

        String s = "check2"; // String literal that is immutable // This object is created in the string pool (which is present within the heap)
        String s2 = new String("check3"); // This object is created in the heap memory

        StringBuffer sb = new StringBuffer("checking1");

        StringBuilder sbuild = new StringBuilder("Checking4");
        // System.out.println(); // Use this statement to print everything that is written above here

        char[] str = {'c','h','k'}; // Char array
        for(char ch:str)
        {
          //  System.out.print(ch);
        }

        //checkingOperations
        // Exploring operation's with String's
        String s3 = new String("appleAir");
        String s4 = new String("apply");
        int len = s3.length();
        System.out.println("length: "+len+" "+s3.substring(0,3));
        System.out.println(s3.contains(s4));

        boolean st = s3.equals(s4);
        System.out.println(st);

        int res = s4.compareTo(s3);
        System.out.println(res);

        //  If the substring is not found, it returns -1. Is case sensitive
        int ind = s3.indexOf("ap");
        int ind1 = s3.indexOf('A',1);
        int ind2 = s4.lastIndexOf('y');
        System.out.println(ind1);
    }
}
