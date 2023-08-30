
import java.util.Scanner;

public class Lab3
{
    public static void main(String[] args)
    {
        //Create input
        Scanner input = new Scanner(System.in);
        
        //Ask for input
        System.out.println("Please enter an abreviation: ");
        String abv = input.nextLine();
        
        
        
        
        // Cycle through possible inputs
        if (abv.equals("AMA"))
        {System.out.println("ask me anything");
        }
        else if (abv.equals("LOL"))
        {System.out.println("laughing out loud");
        }
        else if (abv.equals("LMK"))
        {System.out.println("let me know");
        }
        else if (abv.equals("IMHO"))
        {System.out.println("in my humble opinion");
        }
        else if (abv.equals("IDK"))
        {System.out.println("i don't know");
        }
        else
        {System.out.println("Unknown");
        }
        
    }
}
