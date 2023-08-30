    
public class main{


    public static void main(String[] args)
    {
         int zipcode = 24060;
         String state = findState(zipcode);
         System.out.print(state);

         System.out.print(" and ");
         
         zipcode = 43215;
         state = findState(zipcode);
         System.out.print(state);
         
    }
    
    public static String findState(int zip)
    {
         String state;
 
         if ((zip > 20100 && zip < 20199) || (zip > 22000 && zip < 24699)) {
             state = "Virginia";
             return state;
         } else if (zip > 20600 && zip < 21299) {
             state = "Maryland";
             return state;
         } else if (zip > 27000 && zip < 28999) {
             state = "North Carolina";
             return state;
         } else if ((zip > 40000 && zip < 41899) || (zip > 42000 && zip < 42799)) {
             state = "Kentucky";
             return state;
         }
          return "Unknown";
    }
    
}  
    
    