package All_tests.Test;

import java.util.Random;

public class RandomNumberGen {

    public static void main(String[] args) {
        Random rand = new Random();
        int Generate_random_number = rand.nextInt(9);

        System.err.println(Generate_random_number);
    }
}
