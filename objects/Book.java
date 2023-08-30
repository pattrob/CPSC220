
/**
 * This class represents a book.
 *
 * @author Dr. Zeitz
 */
public class Book
{
    // instance variables
    private String title;
    private String author;
    private int year;
    private int pages;
    private int currentPage;
    
    // Add a genre field (fiction, nonfiction, mystery, fantasy, romance)
    private Genre genre;
    

    /**
     * Default constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        this.title = "";
        this.author = "author unknown";
        this.year = -1;
        this.pages = -1;
        this.currentPage = -1;
    }

    /**
     * Non-default constructor for objects of class Book
     */
    public Book(String title, String a)
    {
        this.title = title;
        this.author = a;
    }
    
    /**
     * Another non-default constructor for objects of class Book
     */
    
    public Book(String t, String a, int y, int p, Genre g)
    {
        this.title = t;
        this.author = a;
        this.year = y;
        this.pages = p;
        this.genre = g;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String t)
    {
        this.title = t;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public void setAuthor(String a)
    {
        this.author = a;
    }
    
    public int getYear()
    {
        return this.year;
    }
    
    public void setYear(int y)
    {
        this.year = y;
    }
    
    public int getPages()
    {
        return this.pages;
    }
    
    public void setPages(int p)
    {
        this.pages = p;
    }
    
    public int getCurrentPage()
    {
        return this.currentPage;
    }
    
    public void updateCurrentPage(int cp)
    {
        if (cp < this.pages) {
            this.currentPage = cp;
        } else {
            System.out.println("Invalid page number");
        }
    }
    /*
    public String toString()
    {
        String s = this.title + " " + this.year + " " + this.author + " " + this.genre;
        return s;
    }
    */
}
