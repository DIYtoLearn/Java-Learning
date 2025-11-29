package Strings;

class solution3
{
    static String str, str2;

    solution3(String st, String st2)
    {
        str = st;
        str2 = st2;
    }

    static void Countchars()
    {
        System.out.println(str+" "+ str2);
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        int len = str.length();
        int len2 = str2.length();
        int max = Math.max(len, len2);

        int x = 'a';
        int ch;

        for(int i=0; i<max; i++)
        {
            if(i<len){
            ch = str.charAt(i);
            c1[ch-x]++; }

            if(i<len2){
                ch = str2.charAt(i);
                c2[ch-x]++;
            }

        }

//        for(int x2 : c2)
//        {
//            System.out.print(x2+" ");
//        }

        int count = 0;
        for(int i=0; i<26; i++)
        {
//            if(c1[i] != c2[i])
//                count++;
            count += Math.abs(c1[i] - c2[i]);


        }
        System.out.println(count);

    }
}

public class Test2 {
    public static void main(String[] args) {

        new solution3("geeksforgeeks", "geeksforgeekscoursesgeeks");

        solution3.Countchars();
    }
}
