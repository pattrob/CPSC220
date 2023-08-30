
/**
 * Write a description of class Devil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Devil extends UpdatedPerson
{
        
    public Devil(String n, int a, SocialYear sy, int gy) throws InvalidGradYearException
    {
        super(n, a, sy);
        if(gy % 2 != 1){
            this.gradYear = gy;
        
        } else {
            throw new InvalidGradYearException("Devils graduate in odd years only!");
            
            
        }
    }

    public String cheer()
    {
        return "Go Devils! Get odd!" + this.gradYear;
    }
}
