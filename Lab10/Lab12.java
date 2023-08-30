import java.util.ArrayList;

/**
 * This class practices polymorphism and exceptions.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab12
{
    public static void main(String[] args)
    {
        // Create an ArrayList for Student objects
        ArrayList<UpdatedPerson> list = new ArrayList<UpdatedPerson>();

        try{
        // Create some devils and goats and add them to the list
        Devil erin = new Devil("Erin", 23, SocialYear.SENIOR, 2019);
        Goat sarah = new Goat("Sarah", 22, SocialYear.JUNIOR, 2020);
        Devil bert = new Devil("Bert", 24, SocialYear.SENIOR, 2018);
            
        list.add(erin);
        list.add(sarah);
        list.add(bert);
    } catch(InvalidGradYearException e){
        System.err.println("InvalidGradYearException: " + e.getMessage());
    }
        // Print out all the students cheering
        for(int i=0; i<list.size(); i++) {
            String c = list.get(i).cheer();
            System.out.println(c);
        }
    }
}
