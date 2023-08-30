import java.util.Scanner;

public class Lab6
{
    
    public static void main(String[] args)
    {
        //Create scanner
        Scanner input = new Scanner(System.in);
        
    
        double sum = 0;
        boolean fact = true;
        
        //Loop through to create calculator
        while (fact = true) {
            //Input a number
            System.out.println("Enter a number: ");
            double num_cont = input.nextDouble();
            
            //Update the sum
            double updated_sum = sum += num_cont;
            
            //To continue or not to continue
            System.out.println("Do you want to add to the sum (y/n): ");
            String yn_cont = input.next();
            
            //Once user is done outputting
            if (yn_cont.equals("n")){
                System.out.println("The sum is " + updated_sum);
                break;
            }
            
        }
    
        
        
    }

    
}
        
       

