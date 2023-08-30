import java.util.Scanner;

public class WrapPresents
{
    
    
    public static void main(String[] args)
    {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // Get input for number of presents wrapped
        System.out.println("How many identical presents do you need to wrap?");
        double presents_num = input.nextDouble();
        
        //Length input
        System.out.println("Enter the length in inches: ");
        double length = input.nextDouble();
        
        //Width input
        System.out.println("Enter the width in inches: ");
        double width = input.nextDouble();
        
        //Height input
        System.out.println("Enter the height in inches: ");
        double height = input.nextDouble();
        
        //Surface area formula
        double sa1 = 2 * (length * height);
        double sa2 = 2 * (length * width);
        double sa3 = 2 * (width * height);
        
        double SA = sa1 + sa2 + sa3;
        
        //Surface area * number of identical presents
        double final_SA = SA * presents_num;
        
        //Return the surface area
        System.out.println("Surface area: " + final_SA);
        
        //Surface area divided by wrapping paper
        double paper_SA = 96 * 30;
        double num_of_rolls = final_SA / paper_SA;
        
        //Rounding the number of rolls
        double rounded_rolls = Math.ceil(num_of_rolls);
        
        //Return the number of rolls needed
        System.out.printf("Rolls: %.0f", rounded_rolls);
        System.out.println();
        
    
        
        //Cost
        double cost = 3.50;
        double total_cost = cost * rounded_rolls;
        
        //Return the Cost
        System.out.print("Cost: $");
        System.out.printf("%.2f", total_cost);
        
        //Final output
        System.out.println();
        System.out.printf("To wrap %.1f inches of surface area, you should purchase %.0f roll(s) for $%.2f", final_SA, rounded_rolls, total_cost);
        
    }

    
}
