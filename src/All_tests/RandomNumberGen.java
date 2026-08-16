package All_tests;

import java.util.Random;

public class RandomNumberGen {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr1 = {65, 90}; // ASCII of A-Z
        int[] arr2 = {97, 122}; // ASCII of a-z
        int[] arr3 = {65, 90}; // ASCII of 0-9
        int origin, bound;

        int Generate_random_number = rand.nextInt(1,4);
        System.err.println(Generate_random_number+" Initial Range Selection");

        if(Generate_random_number == 1)
        {
            origin = arr1[0];
            bound = arr1[1];

        } else if(Generate_random_number ==2 ) {
            origin = arr2[0];
            bound = arr2[1];

        } else {
            origin = arr3[0];
            bound = arr3[1];
        }

        // Generate a random ASCII value from the range and convert it to its actual character symbol
        int FromRangeGenerateValue = rand.nextInt(origin, bound);
        char ActualRequired = (char) FromRangeGenerateValue ;
        System.out.println(FromRangeGenerateValue+" "+ActualRequired);

//        String s = "Anc92nAj1";
//        System.out.println(s.length());

    }
}
