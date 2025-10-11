package GFG.pracrise.Loops;

public class Hollow_square {
    public static void main(String[] args) {
        int s = 10;
        // (s-2)*2 spaces
        for(int i=1; i<=s; i++)
        {
            for(int j=1; j<=s; j++){
            if(i==1 || i==s)
            System.out.print("* ");
            else if(j==1 || j==s) {
                System.out.print("* ");
                for(int k = 1; k <= (s -2)*2; k++) {
                    System.out.print(" ");
                }
              }
            }
            System.out.println();
        }
        System.out.println();
        //GPT
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                if (i == 1 || i == s || j == 1 || j == s) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // two spaces
                }
            }
            System.out.println();
        }

    }
}