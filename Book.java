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
    private int publish;
    private String genre;
    //private String image;
    

    /**
     * Constructor for objects of class book
     */
    public Book(String auth, String name, int pg, int year, String type)
    {
        // initialise instance variables
        this.author = auth;
        this.title = name;
        this.pages = pg;
        this.publish = year;
        this.genre = type;
    }
    
    public String toString() {
        // prints out the movies in hashmap
        return "Title: "  + title + ", Author: " + author + ", Pages: " + pages
        + ", Year published: " + publish + ", Genre: " + genre;
    }

}