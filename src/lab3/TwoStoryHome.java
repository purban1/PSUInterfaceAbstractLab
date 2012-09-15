package lab3;

/**
 *
 * @author Patrick Urban
 * 
 * This subclass will store the necessary values in the the number of bedrooms
 * in a two story home
 * 
 */
public class TwoStoryHome extends Home{
    private int numberOfbedrooms;
    private int upperNumberOfBedrooms;
    private int lowerNumberOfBedrooms;

    /**
     * @return the numberOfbedrooms
     */
    public int getNumberOfBedrooms() {
        return numberOfbedrooms;
    }

    /**
     * @param numberOfbedrooms the numberOfbedrooms to set
     */
    public void setNumberOfBedrooms(int numberOfbedrooms) {
        // Validate the input
        this.numberOfbedrooms = numberOfbedrooms;
    }

    /**
     * @return the upperNumberOfBedrooms
     */
    public int getUpperNumberOfBedrooms() {
        return upperNumberOfBedrooms;
    }

    public void setUpperAndLowerBedroomCount(int upperRooms){
        // Validate the input to makes sure that number of upper bedrooms
        // does not exceed the total number of bedrooms
        // and to make sure that upperRooms is a valid number
        setUpperNumberOfBedrooms(upperRooms);
        setLowerNumberOfBedrooms(this.getNumberOfBedrooms() - this.getUpperNumberOfBedrooms());
    }
    
    /**
     * @param upperNumberOfBedrooms the upperNumberOfBedrooms to set
     */
    private void setUpperNumberOfBedrooms(int upperNumberOfBedrooms) {
        //validate the number being passed.
        this.upperNumberOfBedrooms = upperNumberOfBedrooms;
    }

    /**
     * @return the lowerNumberOfBedrooms
     */
    public int getLowerNumberOfBedrooms() {
        return lowerNumberOfBedrooms;
    }

    /**
     * @param lowerNumberOfBedrooms the lowerNumberOfBedrooms to set
     */
    private void setLowerNumberOfBedrooms(int lowerNumberOfBedrooms) {
        //validate the number being passed.
        this.lowerNumberOfBedrooms = lowerNumberOfBedrooms;
    }
}
