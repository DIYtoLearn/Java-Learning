package Strings.Revisited;

class RevisitingAllProblems{

    public static void LengthOfString(String s)
    {
        int NumberOfcharacters = 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        System.out.println(len);
        System.out.println(s.length());

        try {
            while(true)
            {
                char ch = s.charAt(NumberOfcharacters);
                NumberOfcharacters++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("chodna");
            NormalFlow(NumberOfcharacters);
        }
    }

    private static void NormalFlow(int n)
    {
        System.out.println("Length of a string without using any method = "+n);
    }
}

public class HelloString {
    static void main() {
        RevisitingAllProblems.LengthOfString("DeatHerTZ"); // You cannot safely check bounds without length — only workaround is exception handling
    }
}