package Strings;

/*
Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""

Our task is to find that longest prefix in a given string arrays
 */

import java.util.Scanner;

class PrefixCalc{
    String[] str;

    PrefixCalc(String[] st)
    {
        str = st;
    }

    protected String longestCommonPrefix()
    {
      int arr_size = str.length;
      int len = str[0].length();
      int len2;
      int max;
      String sub_req = "";
      int req_index = -1;

          for(int i=1; i<arr_size; i++)
          {
              len2 = str[i].length();
              max = Math.max(len, len2);

              for(int j=0; j<max; j++)
              {
                  if(j<len && j<len2) {
                      if (str[i].charAt(j) != str[0].charAt(j))
                      {
                          break;

                      }

                      else
                      {
                          req_index = j;
                      }
                  }
              }
          }
            if(req_index < 0)
            {
                System.out.println(req_index);
                return "";
            }

            else
            {
                System.out.println(req_index);
                sub_req += str[1].substring(0, req_index + 1);

                return sub_req;
            }

    }
}

public class LongestPREFIX {

    public static void main(String[] args) {


//          For INPUT
//        Scanner sc = new Scanner(System.in);
//        int size = 4;
//        String[] str = new String[size];
//
//        System.out.println("Enter your string");
//        for(int i=0; i<size; i++)
//        {
//            str[i] = sc.nextLine();
//        }

            // FOR printing the INPUT to double check
//        for(String x : str)
//        {
//            System.out.print(x+" ");
//        }

        String[] str2 = {"dog","racecar","car"};

                //{"dog","racecar","car"};
                //{"flower","flow","flight"};

        PrefixCalc pc = new PrefixCalc(str2);
        String req = pc.longestCommonPrefix();

        System.out.println(req);

    }
}