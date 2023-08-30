// Imports for reading a file
import java.util.Scanner;
import java.io.FileInputStream;

// Imports for writing to a file
import java.io.PrintWriter;
import java.io.FileOutputStream;

// Imports for exceptions
import java.io.IOException;

/**
 * Arrays Practice
 * 
 * @author Dr. Zeitz
 */
public class Arrays
{
    // We will discuss exceptions later
    public static void main(String[] args) throws IOException {
    
        // Create an array of integers
        
        
        // Print all values from the array
        
        
        // Read text from a file
        FileInputStream fileIn = new FileInputStream("myInputFile.txt");
        Scanner scnr = new Scanner(fileIn);
        
        // Get first line and print it
        String firstLine = scnr.nextLine();
        System.out.println(firstLine);
        
        // Get first integer
        int firstInt = scnr.nextInt();
        System.out.println(firstInt);
        
        // Get second integer
        int secInt = scnr.nextInt();
        
        // Must close file for safety
        fileIn.close();
        
        // Write text to a file
        FileOutputStream fileOut = new FileOutputStream("myOutputFile.txt");
        PrintWriter out = new PrintWriter(fileOut);
        
        // Write everything from the original file
        out.println("First line: " + firstLine);
        out.println("First int: " + firstInt);
        out.println("Second int: " + secInt);
        
        // Call flush method
        out.flush();
        
        // Must close the file or nothing will be written
        fileOut.close();
    }
}
