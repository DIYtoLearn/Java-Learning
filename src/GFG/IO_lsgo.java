package GFG;

import java.io.*;

public class IO_lsgo {

    public static void main(String[] args) throws IOException{
        //Buffered Reader
        // Characters are 2 bytes in data, the system.in takes in byte stream of user input from the keyboard
        // Then the InputStreamReader convert's the byte stream to a character stream
        // Which is then read using the Buffered Reader
        //In case of integer input we need to user Integer.parseInt to read to inputted number
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a string ");
    String s = br.readLine();
    System.out.println("Your GFG.pracrise.Input: "+s);

    System.out.println("Enter an integer ");
    int x = Integer.parseInt(br.readLine());
    System.out.println("Your GFG.pracrise.Input: " +x);
    float f1 = Float.parseFloat(br.readLine());
    System.out.println("Float input using bfreader "+f1);

    }
}
