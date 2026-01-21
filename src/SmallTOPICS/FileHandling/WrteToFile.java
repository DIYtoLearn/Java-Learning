package SmallTOPICS.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WrteToFile {
    public static void main(String[] args) {

        try {
            FileWriter flw = new FileWriter("/Users/admin/Desktop/Upayan_Docs/Java_Practise/src/SmallTOPICS/FileHandling/Custom.txt");

            flw.write("Checking where is the file it writes to ?"); // This overwrote my previous comment inside the file, need to figure out a way to stop that
            // On multiple Run of this code it writing the above line on the first line of the text file, nowhere else !!
            // Even if I write a line in the 4th or 5th line of the text file when running this code it is making changes to the whole file and adding the above line in the 1st part of the text file
            flw.close();

            System.out.println("Work Done !");
        }
        catch (IOException e)
        {
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }

    }
}
