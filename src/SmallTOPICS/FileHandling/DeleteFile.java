package SmallTOPICS.FileHandling;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fl = new File("/Users/admin/Desktop/Upayan_Docs/Java_Practise/src/SmallTOPICS/FileHandling/CustomHoe.txt");

            if(fl.delete())
                System.out.println("File is deleted "+fl.getName()); // output File is deleted CustomHoe.txt

            else
                System.out.println("failed to delete files ");
    }
}
