package Strings;

import java.util.Arrays;

public class CharacterArraySORT {

    static void Bubble(String str)
    {
        char[] c = str.toCharArray();
        int len = c.length;
        char temp;
        System.out.println(c);

            for(int i=0; i<len; i++)
            {
                for(int j=0; j<len-i-1; j++)
                {
                    if(c[j] > c[j+1])
                    {
                        temp = c[j];
                        c[j] = c[j+1];
                        c[j+1] = temp;
                    }
                }
            }

            System.out.println(c);
    }

    static void selection(String str2)
    {
        char[] c2 = str2.toCharArray();
        int len = c2.length;
        int index;
        char temp;
        System.out.println(c2);

            for(int i=0; i<len; i++)
            {
                index= i;
                for(int j=i+1; j<len; j++)
                {
                    if(c2[j] < c2[index])
                        index = j;
                }
                temp = c2[i];
                c2[i] = c2[index];
                c2[index] = temp;
            }

            System.out.println(c2);
    }

    static void counting(String str3)
    {
        int test = 'a';
        System.out.println(test);

        int[] chararr = new int[25];
        int len = str3.length();
        int x;

        for(int i=0; i<len; i++)
        {
            x = str3.charAt(i);
            chararr[x-1]++;
        }

        for(int j:chararr)
        {
            System.out.print(j+" ");
        }
    }

    public static void main(String[] args) {
        Bubble("dba");
        selection("check");
        counting("laugh");
    }
}
