package GFG.pracrise.Loops;

public class Test {
    public static void main(String[] args) {

        String s = "Geeks";
        for(int i=0; i<s.length(); i++)
        {

            if(i%2==0)
                System.out.println(s.charAt(i));
        }
        int n = 229;
        int count = (int)(Math.log10(n)+1);
        System.out.println(count);

        for(;;)
        {
            return;
        }

    }
}