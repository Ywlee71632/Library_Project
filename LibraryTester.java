/**
 * main method for testing classes and their methods
 * @author Yewon Lee
 * modified the code written by Lab instructor Tayloe and Professor Pon-Barry
 */
public class LibraryTester {
    public static void main(String[] args) {

        /**
         * Create Resource array with 12 slots 
         */
        Resource[] libraryArray = new Resource[12];

        /**
         * Values stored in libraryArray
         */
        libraryArray[0] = new Book("Ancillary Justice", "Orbit", false, "Ann Leckie", 409, 2013, "Science Fiction");

        libraryArray[1] = new Book("Data science for dummies", "Lillian Pierson", true,
        "John Wiley and Sons, Inc.", 0, 2017, "Electronic Books");

        libraryArray[2] = new Book("Madame Récamier : The Biography of a Flirt",
        "Henry Dwight Sedgwick", true, "Borodino Books", 265, 2017, "Electronic Books");

        libraryArray[3] = new Book("Ninefox Gambit", "Yoon Ha Lee", false, "Solaris",
        317, 2016, "Science fiction");

        libraryArray[4] = new Book("The tale of Cho Ung : a classic of vengeance, loyalty, and romance",
        "Sookja Cho", false, "Columbia University Press", 200, 2018, "Romance Fiction");

        libraryArray[5] = new Journal("Annual review of criminology", "Annual Reviews", "2018-", " Annual");

        libraryArray[6] = new Journal("Inks : the journal of the Comics Studies Society",
        "The Ohio State University Press", "2017-", "Three times a year");

        libraryArray[7] = new Journal("Tax benefits for adoption", "Dept. of the Treasury, Internal Revenue Service",
        "2002-2004", " Annual ");

        libraryArray[8] = new CD("Anthem", "Matt Haimovitz", "Oxingale Records : Artemis Classics",
        2003, 69);

        libraryArray[9] = new CD("Never mind the bollocks, here’s the Sex Pistols",
        "Sex Pistols", "Warner Bros", 1977, 37);

        libraryArray[10] = new DVD("Horrible Bosses 2", "Warner Home Video", 2015, 108,
        "Jason Bateman, Charlie Day, Jason Sudeikis, Jennifer Aniston, Jamie Foxx, Chris Pine, Kevin Spacey, Christoph Waltz",
        "Comedy Films");

        libraryArray[11] = new DVD("Sweeney Todd: the demon barber of Fleet Street",
        "Turner Home Entertainment", 2004, 139,
        "Angela Lansbury, George Hearn, and the original Broadway cast", "Musicals");


        /**
         * Method Tester
         */
        libraryArray[0].checkOut("A Tayloe");
        libraryArray[3].checkOut("A Tayloe");
		libraryArray[6].checkOut("Yewon Lee");
        libraryArray[8].checkOut("Valerie Barr");
		libraryArray[9].checkOut("Valerie Barr");
		libraryArray[11].checkOut("Yewon Lee");
        libraryArray[0].checkIn();
        libraryArray[8].checkIn();
		
        /**
         * Collect the resources that are checked out
         */
        Resource[] checkedOut = LibraryUtil.getAllCheckedOut(libraryArray);
        
        /**
         * Print all the resources that are checked out
         */
		System.out.println();
		System.out.println("All checked out:");
		for(int i = 0; i < checkedOut.length; i++){
            if(checkedOut[i] != null && checkedOut[i].getIsCheckedOut() == true) {
			System.out.println(checkedOut[i].toString() + "\n");
            }
		}   
        System.out.println("-------------------------------------------");

        /**
         * Collect the resources that are checked out by Yewon Lee
         */
        Resource[] checkedOutAmy = LibraryUtil.getAllUserHasCheckedOut(libraryArray, "Yewon Lee");

        /**
         * Print all the resources that are checked out by Yewon Lee
         */
        System.out.println();
		System.out.println("All checked out to Yewon Lee:");
		for(int i = 0; i < checkedOutAmy.length; i++){
            if(checkedOutAmy[i] != null && checkedOutAmy[i].getIsCheckedOut()) {
			System.out.println(checkedOutAmy[i].toString() + "\n");
            }
		}
        System.out.println("-------------------------------------------");

        /**
         * Collect that resources that are classified as Journal type
         */
        Resource[] allDVD = LibraryUtil.getAllOfType(libraryArray, "Journal");

        /**
         * Print all the Journal resources
         */
        System.out.println();
		System.out.println("All Journals:");
		if (allDVD.length != 0)
		for(int i = 0; i < allDVD.length; i++){
            if(allDVD[i] != null && allDVD[i].getType() == "Journal"){
			System.out.println(allDVD[i].toString() + "\n");
            }
		}
		else System.out.println("null");
        System.out.println("-------------------------------------------");

        /**
         * Let all the resources get checked out by YOUR MOM 
         */
        for(int i = 0; i < libraryArray.length; i+= 2){
			libraryArray[i].checkOut("John Kim");
		}

        /**
         * Print all the resources that are checked out by A Tayloe
         * Print null if none of resources are checked out by A Tayloe
         */
        System.out.println();
		System.out.println("All checked out to A Tayloe:");
		checkedOutAmy = LibraryUtil.getAllUserHasCheckedOut(libraryArray, "A Tayloe");

		if (checkedOutAmy.length != 0)
		for(int i = 0; i < checkedOutAmy.length; i++){
            if(checkedOutAmy[i] != null && checkedOutAmy[i].getCheckedOutBy() == "A Tayloe") {
                System.out.println(checkedOutAmy[i].toString() + "\n");
            }
		}
		else System.out.println("null");
        System.out.println("-------------------------------------------");

    
        
        
        /**
         * Collect the resources that are classified as AIR type
         */
        System.out.println();
		System.out.println("All AIR:");
		allDVD = LibraryUtil.getAllOfType(libraryArray, "AIR");
        

        /**
         * Print all the AIR type resources
         * Print null if none of resources are classified as AIR type
         */
		if (allDVD.length != 0)
		for(int i = 0; i < allDVD.length; i++){
            if(allDVD[i] != null && allDVD[i].getType() == "AIR"){
			System.out.println(allDVD[i].toString());
            }
		}
		else System.out.println("null");
        System.out.println("-------------------------------------------");
        
    }
    

}
