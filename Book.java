
/**
 * Write a description of class book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
    private int pages;
    

    /**
     * Constructor for objects of class book
     */
    public Book(String auth, String name, int pg)
    {
        // initialise instance variables
        author = auth;
        title = name;
        pages = pg;
    }
    
    public String toString() {
        return "Title: "  + title + ", Author: " + author + ", Pages: " + pages;
    }

}
