
/**
 * This class defines a CandyBar object.
 *
 * @author Dr. Zeitz
 * @version CPSC 220
 */
public class CandyBar
{
    public enum Color { BLUE, BROWN, GOLD, GREEN, ORANGE, PURPLE, RED, SILVER, WHITE, YELLOW }
    
    // instance variables
    private String name;
    private double weight;
    private Color wrapper;

    /**
     * Constructor for objects of class CandyBar
     */
    public CandyBar(String n, Color c, double w)
    {
        this.name = n;
        this.weight = w;
        this.wrapper = c;
    }

    public String getName()
    {
        return this.name;
    }
    
    public double getWeight()
    {
        return this.weight;
    }
    
    public Color getWrapperColor()
    {
        return this.wrapper;
    }
    
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.printf("%.1f oz with a ", this.weight);
        System.out.println(this.wrapper + " wrapper");
    }
}
