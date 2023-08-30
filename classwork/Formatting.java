// Import statements for Scanner and Random
import java.util.Scanner;
import java.util.Random;

/**
 * This class practices formatting output.
 * 
 * @author Dr. Zeitz
 */
public class Formatting
{
    public static void main(String[] args)
    {
        // Declare and initialize a random number generator
        Random r = new Random();
        
        // Create three variables with random integers
        // Define the range of one as 0-5 inclusive
        int random1 = r.nextInt();
        int random2 = r.nextInt(5);

        // Create a variable with a random double
        double random3 = r.nextDouble();
        
        // Print out all 3 in one line
        System.out.println(random1 + "  " + random2 + "  " + random3);
        
        // Declare and initialize two decimals
        double m = 2.7259;
        double t = 11.8;
        // Only specifier (d for int or f for double)
        System.out.println("Simplest format:");
        System.out.printf("%f \n", m);
        
        // Multiple numbers/variables within one string
        System.out.println("Multiple variables");
        
        
        // With decimal precision
        System.out.println("Printed with 2 decimal places");
        System.out.printf("%.2f \n", m);
        
        // Padding
        System.out.println("Padding columns for vertical organization");
        
        
        // Padding with zeroes - 0 flag
        System.out.println("Padding columns with zeroes");
        
        
        // Flags (+ or -)
        System.out.println("Flag +");
        
        
        // Print these three numbers in a column where all decimal places line up
        // Only print two decimal places
        double x = 1.99;
        double y = 4.2369;
        double z = 10.241;
        double w = 275.23098;
        System.out.printf("%9.2f\n%9.2f\n%9.2f\n%9.2f\n", x, y, z, w);
        
    }
}
