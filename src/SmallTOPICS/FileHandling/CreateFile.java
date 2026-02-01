package SmallTOPICS.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File fl = new File("/Users/admin/Desktop/Java-Learning/src/SmallTOPICS/FileHandling/Custom2.txt");

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
                +fl.length() // size of a file in bytes
        );

        //fl.mkdir() // Create directory

    }
}