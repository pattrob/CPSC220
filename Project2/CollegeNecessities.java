import java.util.Scanner;

public class CollegeNecessities
{
    
    

   
    public static void main(String[] args)
    {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //First output
        System.out.println("Avaliable number of bins: ");
        
        
        
        //Take input from the user
        System.out.println("Food: ");
        int food = input.nextInt();
        System.out.println("Clothes: ");
        int clothes = input.nextInt();
        System.out.println("Textbooks: ");
        int txtbooks = input.nextInt();
        System.out.println("Entertainment: ");
        int ent = input.nextInt();
        
        //If statement to maximize food
        if(food <= 20){
            food = food;}
            else{
                food = 20;}
        //Subtract food from the rest of the bins
        int bins_after_food = 20 - food;
        
        //If statement to maximize Clothes
        if(clothes <= bins_after_food){
            clothes = clothes;}
            else{
                clothes = bins_after_food;}
           
        //Subtract food and clothes from 20
        int bins_after_FC = 20 - (food + clothes);
        
        // If statement to maximize Textbooks
        if(txtbooks <= bins_after_FC){
            txtbooks = txtbooks;}
            else{
                txtbooks = bins_after_FC;}
            
        //Subtract food, clothes, and textbooks from 20
        int last_bins_left = 20 - (food + clothes + txtbooks);
        
        //If statement to maximize entertainment
        if(ent <= last_bins_left){
            ent = ent;}
            else{
                ent = last_bins_left;}
         
        //Final output
        System.out.println("You should purchase " + food + " food " + clothes + " clothes, " + txtbooks + " textbooks, " + ent + " entertainment.");
    }
}
        
    
        
        
   