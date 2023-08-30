
/**
 * Write a description of class recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recursion
{
    

    
    public static void main(String[] args)
    {
        int number = 5;
        int output = 1;
        for(int i = number; i > 0; i --){
            output = output * i;
            
        }
        System.out.println(output);
        
        
        System.out.println(factorial(10));
        System.out.println(bunnyears(2));
    }
    
    public static int factorial(int f)
    {
        if(f == 1){
            return 1;
        } else {
            return f * factorial(f-1);
        }
    }

    public static int bunnyears(int b)
    {
        if(b==0){
            return 0;
        } else if (b==1) {
            return 2;
        } else {
            return 2 + bunnyears(b-1); 
        }
    }
    
    public static String pix(String p)
    {
        if(p.length() <=1){
            return p;
        } else {
            if(p.charAt(0) == p && p.charAt(1) == i){
                
            }
        }
            
    }
}

