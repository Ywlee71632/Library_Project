/**
 *  create an abstract class called Resource 
 *  @author Yewon Lee
 */
public abstract class Resource {

    // Instance variables
    protected String title;
    protected String publisher;
    protected String type;
    protected boolean isElectronic;
    protected boolean isCheckedOut;
    protected String checkedOutBy; 

    /**
     * Constructor of Resource
     * @param title
     * @param publisher
     * @param type
     * @param isElectronic
     */
    public Resource(String title, String publisher, String type, boolean isElectronic){
        this.title = title;
        this.publisher = publisher;
        this.type = type;
        this.isElectronic = isElectronic;
        this.checkedOutBy = "";
    }

    /**
    * Getter for each property of resource instance 
    * @return the value of each property 
    */

    public String getTitle() {
        return title;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getType(){
        return type;
    }

    public boolean getIsElectronic(){
        return isElectronic;
    }

    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }

    public String getCheckedOutBy(){
        return checkedOutBy;
    }

    /**
    * Organize the list of information of instance object
    * @return the string that contains the properties of the object
    */
    //ToString method: prints the information of each resource in an organized format
    public String toString(){
        return "Title: " + title + "\n" + "Type: " + type + "\n" + "Author: " + "publisher: " + publisher + "\n" + "IsElectronic: " + isElectronic + "\n" + "IsCheckedOut: " + isCheckedOut + "\n" + "Checked out by: " + checkedOutBy;
    }

    /**
    * Show that the resource is checked out and identify the person who borrowed 
    */
    public void checkOut(String checkedOutTo){
        isCheckedOut = true;
        checkedOutBy = checkedOutTo;
    }

    /**
    * Show that the resource is returned     
    */
    public void checkIn(){
        isCheckedOut = false;
        checkedOutBy = "";
    }
}