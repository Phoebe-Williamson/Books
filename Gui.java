import ecs100.*;
/**
 * CLass to handle the gui functions
 *
 * @author (Phoebe)
 * @version (28/3/23)
 */
public class Gui
{
    // instance variables - replace the example below with your own
    private Library books;

    /**
     * Constructor for objects of class Gui
     */
    public Gui()
    {
        // initialise instance variables
        books = new Library();
        UI.initialise();
        // UI.addButton("all", books::printAll);
        // UI.addButton("all", Library::addValues);
        // UI.addButton("find", books::printAll);
        UI.addButton("quit", UI::quit);
    }
    
    public void addValues() {
        final int MAX_QUANTITY = 999;
        
        String title, author, genre, image;
        title = UI.askString("Enter the book title: ");
        author = UI.askString("Enter the author of the book: ");
        int pages = UI.askInt("Enter the number of pages in the book: ");
        int publish = UI.askInt("Enter the year the book was published: ");
        genre = UI.askString("Enter the genre of the film: ");
        Book book1 = new Book(author, title, pages, publish, genre);
        //this.books.put(title, book1);
    }
}
