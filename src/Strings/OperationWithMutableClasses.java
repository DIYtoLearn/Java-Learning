package Strings;

public class OperationWithMutableClasses {
    public static void main(String[] args) {

        StringBuffer sbuf = new StringBuffer("Operation Die hard");

        StringBuilder sbuild = new StringBuilder("Paranormal Activity");

        // the current size of that internal array, i.e., how many characters it can hold before needing to resize.
        System.out.println(sbuf.capacity());

        // This is another proof of mutability where the original sequence of characters itself are reversed
        StringBuilder chk = sbuild.reverse();
        System.out.println(chk);
        System.out.println(sbuild);

        sbuf.replace(10,13,"SEX");
        System.out.println(sbuf);

        // Reversing the character sequence again and deleting the sequence of character`s from START to END-1
        sbuild.reverse();
        sbuild.delete(0,4);
        System.out.println(sbuild);

        sbuf.insert(18,"er");
        System.out.println(sbuf);

        //Changing a character
        sbuild.setCharAt(0,'N');
        System.out.println(sbuild);

        sbuf.deleteCharAt(9);
        System.out.println(sbuf);

    }
}
