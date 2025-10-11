class Solution { int n,x ;
}

public class ValuePass_ReturnVal {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.n = 10;
        returnValue(s);
        s.x = s.n * s.n;
        System.out.println(s.x);
    }

    public static void returnValue(Solution s)
    {
        s = new Solution();
        s.n = 5;
        s.x = s.n*s.n;
        System.out.println("inside method "+s.x);
    }
}