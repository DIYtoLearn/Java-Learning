package SmallTOPICS.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        try {
            // 1. Create the File Reader
            FileReader flr = new FileReader("/Users/admin/Desktop/Upayan_Docs/Java_Practise/src/SmallTOPICS/FileHandling/Custom.txt");

            // 2. Variable to hold the character data (read() returns an int)
            int data;

            // 3. Loop: Read character by character until the end (-1 means End of File)
            while ((data = flr.read()) != -1) {
                //System.out.print(data); // Proof that read send int data
                // 4. Cast the int to char to print the actual letter
                System.out.print((char) data);
            }

            // 5. Always close the stream to release system resources
            flr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        //Option 2 of Reading from a File
        try{
        File flr2 = new File("/Users/admin/Desktop/Upayan_Docs/Java_Practise/src/SmallTOPICS/FileHandling/Custom.txt");
        Scanner sc = new Scanner(flr2);

        while(sc.hasNextLine())
        {
            String data = sc.nextLine();
            System.out.print(data);
        }
        sc.close();

        }
        catch (IOException e)
        {
            System.out.println("Error "+e.getMessage());

        }
    }
}