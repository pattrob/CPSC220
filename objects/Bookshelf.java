import java.util.ArrayList;

/**
 * This class tests our Book class
 *
 * @author Dr. Zeitz
 */
public class Bookshelf
{
    public static void main(String[] args)
    {
        // Create three instances of a Book object using each constructor
        Book b = new Book();
        Book shrugged = new Book("Atlas Shrugged", "Ayn Rand");
        Book harryP = new Book("Harry Potter", "JK Rowling", 1997, 280, Genre.Fiction);
        
        // Declare and initialize an ArrayList to hold Book objects
        ArrayList<Book> Books =
            new ArrayList<Book>();
            
        // Add books to shelf
        b.setTitle("1984");
        
        Books.add(b);
        Books.add(shrugged);
        Books.add(harryP);
        
        
        // Print bookshelf using for loop
        for(int i = 0; i < Books.size(); i++){
            System.out.println(Books.get(i).getTitle());
        }
        
        // Remove the book at index 1
        
        
        
        // Print updated bookshelf using for each loop
        
    }
}
