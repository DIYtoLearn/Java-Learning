package SmallTOPICS.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {

        File fl = new File("/Users/admin/Desktop/Upayan_Docs/Java_Practise/src/SmallTOPICS/FileHandling/Custom.txt");

        try{
            if(fl.createNewFile())
                System.out.println("File has been created");
            else
                System.out.println("File already exists");

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(fl.getAbsolutePath()+"\n" // Get the full path for the file created
                +fl.getName()+"\n" // Get the name for the file
                +fl.canRead()+"\n" // Is the file readable
                +fl.lastModified()
        );

    }
}