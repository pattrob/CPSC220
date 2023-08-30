Stimport java.util.Scanner;

/**
 * This is the starting file for Lab 9.
 * 
 * @author Dr. Zeitz 
 * @version CPSC 220
 */
public class Lab9
{
    /**
     * The main method tests all four method definitions.
     * 
     * @param args A string array of input arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        /**
         * Method one checks to see if a number is even or odd.
         */
        System.out.println("Testing method one");
        
        // Test with real value
        String ans1 = evenOrOdd(7); // odd
        System.out.println("7 is an " + ans1 + " number.");
        
        // Test with user input
        System.out.println("Please enter an integer: ");
        int num = input.nextInt();
        String ans2 = evenOrOdd(num);
        System.out.println("The integer is an " + ans2 + " number.");

        /**
         * Method two checks to see if either of the strings appears
         * at the very end of the other string, ignoring upper/lower
         * case differences (in other words, the computation should
         * not be "case sensitive").
         */
        System.out.println("\nTesting method two");
        
        // Test with real values
        boolean end1 = endOther("Hiabc", "abc"); // true
        boolean end2 = endOther("AbC", "HiaBc"); // true
        boolean end3 = endOther("abcXYZ", "abcDEF"); // false
        System.out.println("The booleans are: " + end1 + ", " + end2 +
                            ", " + end3);
        
        // Test with user input
        System.out.println();
        System.out.println("Please enter the first string: ");
        String first = input.next();
        System.out.println("Please enter the second string: ");
        String second = input.next();
        
        boolean end4 = endOther(first, second);
        if (end4) {
            System.out.println("\nOne of the strings appears at the end of the other string.");
        } else {
            System.out.println("\nNeither of the strings appears at the end of the other string.");
        }

        /**
         * These two methods utilize method overloading, meaning you
         * will write two methods with the same name, but different
         * input parameters. Notice the different input parameter types
         * for the first three method calls compared to the last two
         * method calls. Each method should return the sum of
         * three numbers. However, if one of the numbers is 13 then
         * it does not count toward the sum and the parameters to its
         * right do not count either. So, if the second number is 13,
         * then the second and the third number do not count toward
         * the sum.
         */
        
        System.out.println("\nTesting method three");
        
        // Test with real values
        int sum1 = luckySum(4, 2, 3); // 9
        int sum2 = luckySum(13, 2, 9); // 0
        int sum3 = luckySum(9, 4, 13); // 13
        double sum4 = luckySum(7.2, 3.4, 13.0); //10.6
        double sum5 = luckySum(6.57, 13.0, 10.1); // 6.57
        
        System.out.println("The lucky sums are: " + sum1 + ", " + sum2 +
                            ", " + sum3 + ", " + sum4 + ", " + sum5);
        // Test with user input
        System.out.println("\nPlease enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number:");
        int num3 = input.nextInt();
        
        int lucky = luckySum(num1, num2, num3);
        System.out.println("The lucky sum is " + lucky);
        
    }
    
    // Please write your methods here. Include JavaDoc method headers.
    public static String evenOrOdd(double num)
    {
        String returnn = "";
        if(num % 2 == 0)
            returnn = "Even";
        else if(num % 2 == 1)
            returnn = "Odd";
        else
            return "This number is not even or odd";
        return returnn;   
    }
    
    public static boolean endOther(String one, String two)
    {
        if(one.endsWith(two))
            return true;
        else if(two.endsWith(one))
            return true;
        else
            return false;
            
    }
    
    public static int luckySum(int num1,int num2,int num3)
    {
        int sum = 0;
        if(num1 <13 && num2 <13 && num3 <13)
            sum = num1 + num2 + num3;
            
        if(num1 <13 && num2 <13 && num3 ==13)
            sum = num1 + num2;
            
        if(num2 == 13)
            sum = num1;
        if(num1 == 13)
            sum = 0;
        return sum;
            
    }        
    
    public static double luckySum(double num1, double num2, double num3)
    {
        double sum = 0;
        if(num1 <13 && num2 <13 && num3 <13)
            sum = num1 + num2 + num3;
            
        if(num1 <13 && num2 <13 && num3 ==13)
            sum = num1 + num2;
            
        if(num2 == 13)
            sum = num1;
        if(num1 == 13)
            sum = 0;
        return sum;
    }
    
}
