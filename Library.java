import java.util.HashMap;  // import the HashMap class
import ecs100.*;
/**
 * Write a description of class library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private HashMap<String, Book> books;

    /**
     * Constructor for objects of class library
     */
    public Library()
    {
        books = new HashMap<String, Book>();
        UI.addButton("Add Movie", this::addValues);
    }
    
    public void addValues() {
        String title, author, genre;
        title = UI.askString("Enter the book title: ");
        author = UI.askString("Enter the author of the book: ");
        int pages = UI.askInt("Enter the number of pages in the book: ");
        int publish = UI.askInt("Enter the year the book was published: ");
        genre = UI.askString("Enter the genre of the film: ");
        Book book1 = new Book(author, title, pages, publish, genre);
        this.books.put(title, book1);
        
        // print out movies after one has been added
        for (String key : books.keySet()) {
            System.out.println(books.get(key));
        }
    }
    
    public void removeValues() {
        
    }
}
