import java.util.ArrayList;

/**
 * This lab practices implementing sorting algorithms.
 *
 * @author Dr. Zeitz
 * @version CPSC 220
 */
public class Lab15
{
    public static void main(String[] args)
    {
        ArrayList<CandyBar> bars = new ArrayList<CandyBar>();
        addCandyBarsToList(bars);
        
        System.out.println("=====================================");
        printList(bars);
        System.out.println("=====================================");
        bubbleSort(bars);
        printList(bars);
    }
    
    public static void bubbleSort(ArrayList<CandyBar> list)
    {
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                //look at the weights of the candy bars at the indices
                //swap if necessary 
                if(list.get(i).getWeight() > list.get(j).getWeight()){
                    CandyBar placeholder = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, placeholder);
                    
                    
                    
                }
            }
        }
    }
    
    public static void selectionSort(ArrayList<CandyBar> list)
    {
        
    }
    
    public static void insertionSort(ArrayList<CandyBar> list)
    {
        
    }
    
    public static void printList(ArrayList<CandyBar> list)
    {
        for (CandyBar b : list) {
            b.printInfo();
        }
    }
    
    public static void addCandyBarsToList(ArrayList<CandyBar> list)
    {
        CandyBar babyRuth = new CandyBar("Baby Ruth", CandyBar.Color.SILVER, 2.1);
        list.add(babyRuth);
        CandyBar kitkat = new CandyBar("KitKat", CandyBar.Color.RED, 1.5);
        list.add(kitkat);
        CandyBar musketeers = new CandyBar("Three Musketeers", CandyBar.Color.SILVER, 1.92);
        list.add(musketeers);
        CandyBar payDay = new CandyBar("PayDay", CandyBar.Color.ORANGE, 1.85);
        list.add(payDay);
        CandyBar goodbar = new CandyBar("Mr. Goodbar", CandyBar.Color.YELLOW, 1.75);
        list.add(goodbar);
        CandyBar crunch = new CandyBar("Crunch", CandyBar.Color.BLUE, 1.55);
        list.add(crunch);
        CandyBar henry = new CandyBar("Oh Henry", CandyBar.Color.YELLOW, 1.8);
        list.add(henry);
        CandyBar krackel = new CandyBar("Krackel", CandyBar.Color.RED, 1.55);
        list.add(krackel);
        CandyBar caramello = new CandyBar("Caramello", CandyBar.Color.PURPLE, 1.6);
        list.add(caramello);
        CandyBar grand = new CandyBar("One-hundred Grand", CandyBar.Color.RED, 1.5);
        list.add(grand);
        CandyBar what = new CandyBar("Whatchamacallit", CandyBar.Color.YELLOW, 1.6);
        list.add(what);
        CandyBar twix = new CandyBar("Twix", CandyBar.Color.GOLD, 1.79);
        list.add(twix);
        CandyBar hershey = new CandyBar("Hershey", CandyBar.Color.BROWN, 1.55);
        list.add(hershey);
        CandyBar milkyWay = new CandyBar("Milky Way", CandyBar.Color.GREEN, 1.84);
        list.add(milkyWay);
        CandyBar reeses = new CandyBar("Reese's FastBreak", CandyBar.Color.ORANGE, 2);
        list.add(reeses);
        CandyBar snickers = new CandyBar("Snickers", CandyBar.Color.BLUE, 1.86);
        list.add(snickers);
        CandyBar butterfinger = new CandyBar("Butterfinger", CandyBar.Color.YELLOW, 1.9);
        list.add(butterfinger);
        CandyBar almond = new CandyBar("Almond Joy", CandyBar.Color.BLUE, 1.61);
        list.add(almond);
        
    }
}
