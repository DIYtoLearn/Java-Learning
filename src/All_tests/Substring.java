package All_tests;

public class Substring {
    public static void main(String[] args) {

        String s = "Hello";
        String p = "ol";

        int sLen = s.length();
        int pLen = p.length();

        if (pLen > sLen) {
            System.out.println(-1);
            return;
        }

        boolean found = false;

        for (int i = 0; i <= sLen - pLen; i++) {
            String sub = s.substring(i, i + pLen);
            System.out.println(sub);
            if (sub.equals(p)) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println(-1);
    }
}
