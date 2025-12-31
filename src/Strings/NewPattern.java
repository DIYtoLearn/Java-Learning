package Strings;

class Geeks {
     int follPatt(String s) {
        // Your code here
        int[] arr = new int[26];
        //int diff_cal = 'a';

        int len = s.length();
        //int present_integerValue_of_char;
        //char convert;
        //int counterForX = 0;
        //int counterForY = 0;

        if(s.charAt(0) == 'y')
            return 0;
        int i=0;
        while(i<len)
        {
            if(s.charAt(i) == 'x')
                arr[23]++;


            if(s.charAt(i) == 'y')
            {
                for(int j=0;j<arr[23];j++)
                {
                    if(s.charAt(i) != 'y')
                        return 0;

                    i++;
                }

                arr[23] = 0;

            }
            i++;
        }

        return 1;
    }
}

public class NewPattern {
    public static void main(String[] args) {

    }
}
