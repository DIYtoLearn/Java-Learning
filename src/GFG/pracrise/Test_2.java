package GFG.pracrise;

class Test_2{
    public static int getword()
    {
        int a = 5, b = 6, c = 7;
        int check = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        return check;
    }// end of method getword
    public static void main(String[] args) {
        int result = getword();
        System.out.println(result);


        char ch = 'a';
        switch (ch) {
            case 97:
                System.out.println("First");
                break;
            default:
                System.out.println("Second");
        }
        
    }//end of main
}//end of class
