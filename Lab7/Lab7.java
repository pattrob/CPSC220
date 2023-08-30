//Imports for reading a file
import java.util.Scanner;
import java.io.FileInputStream;

//Imports for writing to a file
import java.io.FileOutputStream;
import java.io.PrintWriter;

//Imports for arrays
import java.util.Arrays;

//Imports for exceptions
import java.io.IOException;

public class Lab7
{
    
    public static void main(String[] args) throws IOExcepsStion
    {
        //Read text from the file
        FileInputStream file_input = new FileInputStream("haikuFun.txt");
        Scanner scan = new Scanner(file_input);
    
        //Declare an int for the loop
        int num = 0;
        
        //Create the array
        String[] lines = new String[6];
        
        //Loop through the file, print and add each line to the array one at a time
        while(num <=5){
            //String line = scan.nextLine();
            String line = scan.nextLine();
            System.out.println(line);
            lines[num] = line;
            num += 1;
        }

        
        
        //Write the text to a file
        FileOutputStream output = new FileOutputStream("reverse.txt");
        PrintWriter pw_output = new PrintWriter(output);
        
        //Write to the file
        pw_output.println(lines[5]);
        pw_output.println(lines[4]);
        pw_output.println(lines[3]);
        pw_output.println(lines[2]);
        pw_output.println(lines[1]);
        pw_output.println(lines[0]);
        
        //Flush method
        pw_output.flush();
        
        //Close the file
        output.close();
        
        
                
    }
    
        
}

    

