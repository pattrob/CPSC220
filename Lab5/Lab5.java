import java.util.Scanner;

public class Lab5
{
    
    public static void main(String[] args)
    {
        //Create input
        Scanner input = new Scanner(System.in);
        
        //Ask for the first word
        System.out.println("Enter the first word: ");
        String word1 = input.nextLine();
        
        //Ask for the second word
        System.out.println("Enter the second word: ");
        String word2 = input.nextLine();
        
        //Ask for the third word
        System.out.println("Enter the third word: ");
        String word3 = input.nextLine();
        
        //Compare the words
        int one_and_two = word1.compareTo(word2);
        int one_and_three = word1.compareTo(word3);
        int two_and_three = word2.compareTo(word3);
        
        //Order and output the words with if statements
        if (one_and_two < 0 && one_and_three < 0 && two_and_three < 0){
            System.out.println(word1 + " " + word2 + " " + word3);}
        else if (one_and_two < 0 && one_and_three < 0 && two_and_three > 0){
            System.out.println(word1 + " " + word3 + " " + word2);}
        else if (one_and_two > 0 && one_and_three < 0 && two_and_three < 0){
            System.out.println(word2 + " " + word1 + " " + word3);}
        else if (one_and_two > 0 && one_and_three > 0 && two_and_three < 0){
            System.out.println(word2 + " " + word3 + " " + word1);}
        else if (one_and_two < 0 && one_and_three > 0 && two_and_three > 0){
            System.out.println(word3 + " " + word1 + " " + word2);}
        else if (one_and_two > 0 && one_and_three > 0 && two_and_three > 0){
            System.out.println(word3 + " " + word2 + " " + word1);}
            
            
            
        
    
        
        
        
        
        
        
        
            

        
        
       
        
        
    
        
        
        
        
    }
}
