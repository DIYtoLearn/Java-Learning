package GFG.pracrise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_read {
    public static void main(String[] args) {
        String filePath = "D:\\GATE material\\Rndm_Docs\\Finance\\New Revised Plan.txt"; // or "data.csv"

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
