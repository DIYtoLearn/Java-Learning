package Test;

public class Chk1 {
    public static void main(String[] args) {

        int[][] m = new int[3][3];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                m[i][j] = j+1;
            }
        }
        // Printing the array
        for(int[] x : m)
        {
            for(int z : x)
            {
                System.out.print(z+" ");
            }
            System.out.println();
        }
        System.out.println(m[0][2]);
    }
}
