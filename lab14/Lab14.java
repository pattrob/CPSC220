import java.util.ArrayList;

/**
 * This lab practices writing and using search algorithms.
 *
 * @author Dr. Zeitz
 * @version CPSC 220
 */
public class Lab14
{
    public static void main(String[] args)
    {
        ArrayList<CandyBar> bars = new ArrayList<CandyBar>();
        addCandyBarsToList(bars);
        
        /**
         * Use the methods you wrote below to answer all of
         * the following questions.
         */

        /**
         * Part A:
         */
        
        /**
         * Is Twix in the list?
         * If so, print all information about it.
         * If not, print a message to the user.
         */
        int twix = findCandyBar(bars, "Twix");
        if(twix != -1){
            bars.get(twix).printInfo();
        } else {
            System.out.println("This candy bar does not exist in the list.");
        }
        /**
         * Is Mounds in the list?
         * If so, print all information about it.
         * If not, print a message to the user.
         */
        int mounds = findCandyBar(bars, "Mounds");
        if(mounds != -1){
            bars.get(mounds).printInfo();
        } else {
            System.out.println("This candy bar does not exist in the list.");
        }
        
        /**
         * Part B:
         */
        
        /**
         * Print all the names of candy bars with yellow wrappers.
         */
        findByColor(bars, CandyBar.Color.YELLOW);
        

        /**
         * Part C:
         */

        /**
         * Count how many candy bars are 1.75 oz or more.
         */
        int count = countByWeight(bars, 1.75);
        System.out.println("There are " + count + " candy bars that weigh 1.75 oz or more.");
        
        /**
         * Part D:
         */

        /**
         * Is there a candy bar that is 1.86 oz?
         * If so, print the information.
         * If not, print a message to the user.
         * Write a binary search method to get the answer.
         */
        int index = binaryFind(bars, 0, bars.size(), 1.86);
        if(index != -1){
            bars.get(index).printInfo();
        } else {
            System.out.println("There is not a candy bar that weighs 1.86 oz.");
        }

    }
    
    /**
     * This method searches a list to find a candy bar by name.
     *
     * @param    list    the list to search
     * @param    n        a name to find
     * @return            the index of the candy bar 
     */
    public static int findCandyBar(ArrayList<CandyBar> list, String n)
    {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName() == n){
                return i;
            }
        
        }
    
        return -1;
    }
    
    /**
     * This method prints the names of the candy bars that have a certain
     * wrapper color.
     *
     * @param    list    the list to search
     * @param    c        the color wrapper to find 
     */
    public static void findByColor(ArrayList<CandyBar> list, CandyBar.Color c)
    {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getWrapperColor() == c){
                System.out.println(list.get(i).getName());
            }
        }
        
    }
    
    /**
     * This method counts the number of candy bars that weigh greater than
     * or equal to the weight input parameter.
     *
     * @param    list    the list to search
     * @param    w        the weight to compare to
     * @return            the count of candy bars 
     */
    public static int countByWeight(ArrayList<CandyBar> list, double weight)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getWeight() >= weight){
                count += 1;
            }
            
        }
        return count;
        
    }
    
    /**
     * This method searches a list using binary search.
     *
     * @param    list    the list to search
     * @param    first   the first index
     * @param    last    the last index
     * @param    w        the value to search for
     * @return            the index of the candy bar 
     */
    public static int binaryFind(ArrayList<CandyBar> list, int first, int last, double w)
    {
        int middle = first + (first + last) / 2;
        while(last >= first){
            double target = list.get(middle).getWeight();
            if(list.get(middle).getWeight() == w){
                return middle;
            } else if(list.get(middle).getWeight() < w){
                first = middle-1;
            } else if(list.get(middle).getWeight() > w){
                last = middle;
            } else {
                first = middle;
            }
            middle = ((first + last) / 2);
        }
        return -1;
    }
    
    /**
     * This method adds candy bars to a list.
     *
     * @param    list    the list to add to
     */
    public static void addCandyBarsToList(ArrayList<CandyBar> list)
    {
        CandyBar kitkat = new CandyBar("KitKat", CandyBar.Color.RED, 1.5);
        list.add(kitkat);
        CandyBar grand = new CandyBar("One-hundred Grand", CandyBar.Color.RED, 1.5);
        list.add(grand);
        CandyBar crunch = new CandyBar("Crunch", CandyBar.Color.BLUE, 1.55);
        list.add(crunch);
        CandyBar hershey = new CandyBar("Hershey", CandyBar.Color.BROWN, 1.55);
        list.add(hershey);
        CandyBar krackel = new CandyBar("Krackel", CandyBar.Color.RED, 1.55);
        list.add(krackel);
        CandyBar caramello = new CandyBar("Caramello", CandyBar.Color.PURPLE, 1.6);
        list.add(caramello);
        CandyBar what = new CandyBar("Whatchamacallit", CandyBar.Color.YELLOW, 1.6);
        list.add(what);
        CandyBar almond = new CandyBar("Almond Joy", CandyBar.Color.BLUE, 1.61);
        list.add(almond);
        CandyBar goodbar = new CandyBar("Mr. Goodbar", CandyBar.Color.YELLOW, 1.75);
        list.add(goodbar);
        CandyBar twix = new CandyBar("Twix", CandyBar.Color.GOLD, 1.79);
        list.add(twix);
        CandyBar henry = new CandyBar("Oh Henry", CandyBar.Color.YELLOW, 1.8);
        list.add(henry);
        CandyBar milkyWay = new CandyBar("Milky Way", CandyBar.Color.GREEN, 1.84);
        list.add(milkyWay);
        CandyBar payDay = new CandyBar("PayDay", CandyBar.Color.ORANGE, 1.85);
        list.add(payDay);
        CandyBar snickers = new CandyBar("Snickers", CandyBar.Color.BLUE, 1.86);
        list.add(snickers);
        CandyBar butterfinger = new CandyBar("Butterfinger", CandyBar.Color.YELLOW, 1.9);
        list.add(butterfinger);
        CandyBar musketeers = new CandyBar("Three Musketeers", CandyBar.Color.SILVER, 1.92);
        list.add(musketeers);
        CandyBar reeses = new CandyBar("Reese's FastBreak", CandyBar.Color.ORANGE, 2);
        list.add(reeses);
        CandyBar babyRuth = new CandyBar("Baby Ruth", CandyBar.Color.SILVER, 2.1);
        list.add(babyRuth);
    }
}
