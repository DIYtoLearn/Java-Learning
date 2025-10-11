package Recursion;

public class Crash {

    static void crashed()//int chk)
    {
//        chk++;
//        if(chk >10)
//            return ;
//        System.out.println(chk);
        crashed();//chk);
    }

    public static void main(String[] args) {
        int check = 0;
        crashed();//check);
    }
}

// This is a recursion that shows how not adding a base condition can cause stack overflow error
// This code also has basic recursion added to overcome the stackOverflow issue by adding a base condition that clear's the stack space once the variable chk reaches the greater than 10