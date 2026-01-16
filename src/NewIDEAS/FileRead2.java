package NewIDEAS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Reader
{
    private static int classvariable ;
    static {
        classvariable = 0;
    }

    protected int getClassvariable()
    {
        return classvariable;
    }

    protected int readfromFile() throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("C:\\Users\\Upayan\\Desktop\\read.txt"));
        int req = 0;
        while(sc.hasNext()) {
            int each = sc.nextInt();
            System.out.println(each);
            req = returnSumInFile(each);
        }
        return req;
    }

    protected static int returnSumInFile(int n)
    {
         classvariable += n;
         return classvariable;
    }
}

public class FileRead2 {
    public static void main(String[] args) throws FileNotFoundException {

        Reader rr = new Reader();
        int val = rr.readfromFile();

        System.out.println("Final Sum = "+val);
        System.out.println("We got this via get method "+rr.getClassvariable());
    }
}