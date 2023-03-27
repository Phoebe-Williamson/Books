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
        addValues();
    }
    
    public void addValues() {
        for ( int books = 0; books <= 1; books++) {
            String title, author;
            title = UI.askString("Enter the book title: ");
            author = UI.askString("Enter the author of the book: ");
            int pages = UI.askInt("Enter the number of pages in the book: ");
            Book book1 = new Book(author, title, pages);
            this.books.put(title, book1);
        }
        
        for (String key : books.keySet()) {
            System.out.println(books.get(key));
        }
    }
    
}
