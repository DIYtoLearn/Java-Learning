package Contests;

public class NewTest {
    public static void main(String[] args) {
        int x =2;
        int y = 0;
        for(;y<10;++y)
        {
            if(y%x==0)
                continue;
            else if(y==8)
                break;
            else
                System.out.println(y+" ");

        }

        final int a=10, b=20;
//        while(a>b)
//        {
//            System.out.println("Hello");
//        }
        System.out.println("GEEKS");

        int var1 =5, var2=6;
        if((var2=1)==var1)
            System.out.println(var2);
        else
            System.out.println(++var2);


        int x2=10;
        if(++x2<10 && (x2/0 > 10))
            System.out.println("Upayan");
        else
            System.out.println("Geeks");



    }
}
