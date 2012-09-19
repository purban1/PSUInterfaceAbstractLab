package lab3;

/**
 *
 * @author production
 * 
 * Abstract class will store all necessary information for a home while
 * the type of home will store the bedroom information. Ranches have
 * one lever of bedrooms while a two story home can have a number of bedrooms
 * on the upper level and CAN at have at least one bedroom on the lower level.
 * 
 * Therefore the only abstract methods will involve the number of bedrooms
 * 
 */
public abstract class Home{
    private int garageWidth;
    private int garageLength;
    private int kitchenWidth;
    private int kitchenLength;
    private int livingRoomWidth;
    private int livingRoomLength;
    private HomeFeature homeFeature = new NoFeature();

       
    /**
     * @param homeFeature the homeFeature to set
     */
    public void setHomeFeature(HomeFeature feature) {
        // Validate the number
        this.homeFeature = feature;
    }
    
    /**
     * @param homeFeature the homeFeature to set
     */
    public String getHomeFeature() {
        // Validate the number
        return homeFeature.getHomeFeature() ;
    }
    
    /**
     * @return the garageWidth
     */
    public int getGarageWidth() {
        return garageWidth;
    }

    /**
     * @param garageWidth the garageWidth to set
     */
    public void setGarageWidth(int garageWidth) {
        // Validate the number
        this.garageWidth = garageWidth;
    }

    /**
     * @return the garageLength
     */
    public int getGarageLength() {
        return garageLength;
    }

    /**
     * @param garageLength the garageLength to set
     */
    public void setGarageLength(int garageLength) {
        // Validate the number
        this.garageLength = garageLength;
    }

    /**
     * @return the kitchenWidth
     */
    public int getKitchenWidth() {
        return kitchenWidth;
    }

    /**
     * @param kitchenWidth the kitchenWidth to set
     */
    public void setKitchenWidth(int kitchenWidth) {
        // Validate the number
        this.kitchenWidth = kitchenWidth;
    }

    /**
     * @return the kitchenLength
     */
    public int getKitchenLength() {
        return kitchenLength;
    }

    /**
     * @param kitchenLength the kitchenLength to set
     */
    public void setKitchenLength(int kitchenLength) {
        // Validate the number
        this.kitchenLength = kitchenLength;
    }

    /**
     * @return the livingRoomWidth
     */
    public int getLivingRoomWidth() {
        return livingRoomWidth;
    }

    /**
     * @param livingRoomWidth the livingRoomWidth to set
     */
    public void setLivingRoomWidth(int livingRoomWidth) {
        // Validate the number
        this.livingRoomWidth = livingRoomWidth;
    }

    /**
     * @return the livingRoomLength
     */
    public int getLivingRoomLength() {
        return livingRoomLength;
    }

    /**
     * @param livingRoomLength the livingRoomLength to set
     */
    public void setLivingRoomLength(int livingRoomLength) {
        // Validate the number
        this.livingRoomLength = livingRoomLength;
    }
    
    /**
     * 
     * The two methods below are abstract because the number of bedrooms on a 
     * level of a home can differ when going from a ranch to two story home.
     */
    public abstract void setNumberOfBedrooms(int numberOfbedrooms);
    public abstract int getNumberOfBedrooms();
}
