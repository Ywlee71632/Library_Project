/**
 * create a subclass called Book
 * @author Yewon Lee
 */
public class Book extends Resource {

    /**
     * Specific instance variables for Book 
     */
    protected String author;
    protected int numOfPages;
    protected int pubYear;
    protected String genre;

    /**
     * Constructor of Book
     * @param title
     * @param publisher
     * @param isElectronic
     * @param author
     * @param numOfPages
     * @param pubYear
     * @param genre
     */
    public Book(String title, String publisher, boolean isElectronic, String author, int numOfPages, int pubYear, String genre){
        super(title, publisher, "Book", isElectronic);
        this.author = author;
        this.numOfPages = numOfPages;
        this.pubYear = pubYear;
        this.genre = genre; 
    }
}
