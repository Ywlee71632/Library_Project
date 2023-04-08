/**
 * create a subclass called DVD
 * @author Yewon Lee
 */
public class DVD extends Resource {

    /**
     * specific instance variables of DVD
     */
    protected int year;
    protected int length;
    protected String performers;
    protected String genre;

    /**
     * Constructor of DVD
     * @param title
     * @param publisher
     * @param year
     * @param length
     * @param performers
     * @param genre
     */
    public DVD(String title, String publisher, int year, int length, String performers, String genre){
        super(title, publisher, "DVD", false);

        this.year = year;
        this.length = length;
        this.performers = performers;
        this.genre = genre; 
    }
}
