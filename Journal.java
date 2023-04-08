/**
 * create a subclass called Journal
 * @author Yewon Lee
 */
public class Journal extends Resource {

    /**
     * specific instance variable of Journal
     */
    protected String rangeOfYears;
    protected String howOftenPub;

    /**
     * Constructor of Journal
     * @param title
     * @param publisher
     * @param rangeOfYears
     * @param howOftenPub
     */
    public Journal(String title, String publisher, String rangeOfYears, String howOftenPub){
        super(title, publisher, "Journal", true);

        this.rangeOfYears = rangeOfYears;
        this.howOftenPub = howOftenPub;
    }
}
