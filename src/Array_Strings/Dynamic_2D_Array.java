package Array_Strings;

import java.util.Arrays;

public class Dynamic_2D_Array {

    public static void main(String[] args) {
        //[ROW][COLUMN]
        int[][] m = new int[3][3];

        int len = m.length; // length of rows
        int len2 = m[0].length; // length of columns
        int check = 1;

        while(true) {
            try {
                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < len2; j++) {
                        m[i][j] = check;
                        check++;
                    }
                    System.out.print("\r"+Arrays.deepToString(m));
                    Thread.sleep(500);
                }
                if (check>10) break;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
