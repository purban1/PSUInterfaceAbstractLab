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

    private int numberOfBedrooms;
    private int upperNumberOfBedrooms;
    private int lowerNumberOfBedrooms;
    private final String HOME_TYPE = "I am a two story home.";

    /**
     * @return the numberOfBedrooms
     */
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * @param numberOfBedrooms the numberOfBedrooms to set
     */
    public void setNumberOfBedrooms(int numberOfbedrooms) {
        // Validate the input
        this.numberOfBedrooms = numberOfbedrooms;
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
    /**
     * @return the HOME_TYPE
     */
    public String getHOME_TYPE() {
        return HOME_TYPE;
    }
    
    @Override
    public String toString() {
        return "\n" + this.getHOME_TYPE() + " I have a garage size of " + this.getGarageLength() + " x " + this.getGarageWidth() +
                " feet with a kitchen size of " + this.getKitchenLength() + " x " + this.getKitchenWidth() + " feet. \nMy livingroom "
                + "dimensions are " + this.getLivingRoomLength() + " x " + this.getLivingRoomWidth() + "."
                + "\nI have " + this.getNumberOfBedrooms() + " bedrooms."
                + "\n" + super.getHomeFeature();
    }
}
