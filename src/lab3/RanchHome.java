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
    private final String HOME_TYPE = "I am a ranch style home.";

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
