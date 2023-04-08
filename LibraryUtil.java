/**
 * contains methods that help user to find objects that satisfy certain conditions 
 * @author Yewon Lee
 */
public class LibraryUtil{

    /**
     * Collect and return the resources that are checked out
     * @param resourceArray
     * @return array that contains all the resources that are checked out
     */
    public static Resource[] getAllCheckedOut(Resource[] resourceArray) {
        
        /**
         * Count the number of resources that are checked out
         */
        int CheckedOutNum = 0; 
        for (int i = 0; i < resourceArray.length; i++){
            
            if(resourceArray[i].isCheckedOut == true) {
                CheckedOutNum ++;
            }
        }
        
        /**
         * Create an array with a length of CheckedOutNum
         * Assign each index with the resource from resourceArray that are checked out
         */
        Resource[] updatedResource = new Resource[CheckedOutNum];
        int count = 0;
        for (int i = 0; count < updatedResource.length; i++){
            
            if(resourceArray[i].isCheckedOut == true) {
                updatedResource[count] = resourceArray[i];
                count++;
            }
        }
        
        return updatedResource;
       
    }
    /**
     * Collect and return the resources that are checked out by a specific borrower
     * @param resourceArray
     * @param borrower
     * @return array that contains resources that are checked out by specific borrower 
     */
 
    public static Resource[] getAllUserHasCheckedOut(Resource[] resourceArray, String borrower){

        /**
         * Count the number of resources that are checked out by a specific borrower
         */
        int userCheckedOutNum = 0; 
        for (int i = 0; i < resourceArray.length; i++){
            
            if(resourceArray[i].isCheckedOut == true && resourceArray[i].checkedOutBy == borrower) {
                userCheckedOutNum ++;
            }
        }

        /**
         * Create an array with a length of userCheckedOutNum
         * Assign each index with the resource from resourceArray that are checked out by a specific borrower
         */
        Resource[] updatedResource = new Resource[userCheckedOutNum];

        int count = 0;

        for (int i = 0; count < updatedResource.length; i++) {
            if (resourceArray[i].checkedOutBy == borrower){
                updatedResource[count] = resourceArray[i];
                count++;
            }
            
        }

        return updatedResource;
    }

    /**
     * Collect and return resources that are classified with specific type 
     * @param resourceArray
     * @param specifiedType
     * @return array that contains resources that has a specific type
     */

    public static Resource[] getAllOfType(Resource[] resourceArray, String specifiedType){

        /**
         * Count the number of resources that has a specifiedType
         */
        int getAllofTypeNum = 0; 
        for (int i = 0; i < resourceArray.length; i++){
            
            if(resourceArray[i].type == specifiedType) {
                getAllofTypeNum ++;
            }
        }

        /**
         * Create an array with a length of getAllofTypeNum
         * Assign each index with the resource from resourceArray that has a specifiedType
         */
        Resource[] updatedResource = new Resource[getAllofTypeNum];

        int count = 0; 

        for (int i = 0; count < updatedResource.length; i++) {

            if (resourceArray[i].type == specifiedType) {
                updatedResource[count] = resourceArray[i];
                count ++;
            }
        }

        return updatedResource;

    }

}
