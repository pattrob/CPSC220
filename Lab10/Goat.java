
/**
 * Write a description of class Goat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goat extends UpdatedPerson
{
    

    /**
     * Constructor for objects of class Goat
     */
    public Goat(String n, int a, SocialYear sy, int gy) throws InvalidGradYearException
    {
        super(n, a, sy);
        if(gy % 2 == 0){
        this.gradYear = gy;
        
        } else {
            throw new InvalidGradYearException("Goats graduate in even years only!");
            
            
        }
    }
    
    
    
    public String cheer()
    {
        return "Go goats! Get even!" + this.gradYear;
    }
}
