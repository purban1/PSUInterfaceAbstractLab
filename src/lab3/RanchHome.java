package lab3;

/**
 *
 * @author Patrick Urban
 * 
 * This subclass will store the necessary values in the the number of bedrooms
 * in the home
 * 
 */
public class RanchHome extends Home{
    private int numberOfBedrooms;

    /**
     * @return the numberOfbedrooms
     */
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * @param numberOfbedrooms the numberOfbedrooms to set
     */
    public void setNumberOfBedrooms(int numberOfbedrooms) {
        // Validate the input
        this.numberOfBedrooms = numberOfbedrooms;
    }

}
