package NewIDEAS;

import java.io.File;
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

        protected void readfromFile() throws Exception
        {
            Scanner sc = new Scanner(new File("/Users/admin/Desktop/Sum.txt"));
            // For Mac "/Users/admin/Desktop/read"
            // For windows "C:\\Users\\Upayan\\Desktop\\read.txt"
            int req = 0;
            while(sc.hasNext()) {
                int each = sc.nextInt();
                System.out.println(each);
                req = returnSumInFile(each);
            }
            System.out.println("Final Sum = "+req);
        }

        protected static int returnSumInFile(int n)
        {
             classvariable += n;
             return classvariable;
        }
    }

public class FileRead2 {
    public static void main(String[] args)  {

        Reader rr = new Reader();

        try {
            rr.readfromFile();
            System.out.println("We got this via get method "+rr.getClassvariable()); // This line will not be executed if an exception occurs in the previous line
        }
        catch (Exception e)
        {
            System.out.println("Check if the file path or if the file is present at the desired location !!\n"+e.getMessage());
        }

    }
}