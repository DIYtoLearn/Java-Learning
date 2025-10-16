package Strings;

public class Random {
    public static void main(String[] args) {
        StringBuffer first = new StringBuffer("GFG");
        System.out.println(first.toString().indexOf(" "));

        String str = "checking";
        int len = str.length() - 1;
        System.out.println(str.substring(1,len));

        int len2 = str.length();
        String res = str.toUpperCase();
        System.out.println(res.charAt(0)+""+str.substring(1,len2));
        System.out.println(res);

        int i = 3;
        System.out.println(Math.pow(2,i));
    }
}
