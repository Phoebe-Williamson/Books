import java.util.HashMap;  // import the HashMap class
import ecs100.*;
/**
 * Write a description of class library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class library
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> library;

    /**
     * Constructor for objects of class library
     */
    public library()
    {
        library = new HashMap<String, String>();
        addValues();
    }
    
    public void addValues() {
        for ( int Books = 0; Books <= 5; Books++) {
            String title, author;
            title = UI.askString("Enter the book title: ");
            author = UI.askString("Enter the author of the book: ");
            library.put(title, author);
        }
        
        for (String key : library.keySet()) {
            System.out.println("Title: "  + key + ", Author: " + library.get(key));
        }
    }
    
}
