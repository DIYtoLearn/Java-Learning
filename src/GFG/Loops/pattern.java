package GFG.Loops;

public class pattern {
    public static void main(String[] args) {
        //Simple Right angle triangle pattern
        int s =4;
        for(int i=0; i<s; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(i==2 && j==1)
                {System.out.print("  ");}
                else
                { System.out.print("* ");}
            }
            System.out.println();
        }


        /* Pattern 2
        Input: s = 9
        Output:
        *
        * *
        *   *
        *     *
        *       *
        *         *
        *           *
        *             *
        * * * * * * * * *
        Explanation: Length of perpendicular and base of triangle is 9.
  */
        //*, 1,3,5,7,9,11,13, all stars
        //Space logic
        // AP logic: a+(n-1)*d (n (0,8))

//        int i = 8;
//        2 * (i - 1) - 1;

        

    }// end of main
}// end of class
