package GFG.pracrise.Loops;


public class Infinite_loop {
    public static void main(String[] args) {

        int x;
        for(x=1; x>0; x++)
        {
            if(x==100000) break;
            System.out.print(x +" ");
        }

        System.out.println("Aight imma head out...");
    }
}
