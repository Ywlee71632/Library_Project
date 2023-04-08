/**
 * create a subclass called CD
 * @author Yewon Lee
 */
public class CD extends Resource{

    /**
     * Specific instance variables for CD
     */
    protected String artist;
    protected int year;
    protected int length;

    /**
     * Constructor of CD
     * @param title
     * @param publisher
     * @param artist
     * @param year
     * @param length
     */
    public CD(String title, String publisher, String artist, int year, int length){
        super(title, publisher, "CD", false);

        this.artist = artist;
        this.year = year;
        this.length=length;
    }
}
