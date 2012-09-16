package lab3;

/**
 *
 * @author Patrick Urban
 * 
 * This class extends the concrete class RanchHome to store the necessary 
 * values in the fields declared for the deckWidth and deckLength
 * 
 */
public class RanchHomeDeck extends RanchHome implements DeckInBack{

    
    private int deckWidth;
    private int decklength;
    private final String HOME_TYPE = "I am a ranch style home with a deck.";

    /**
     * @return the deckWidth
     */
    public int getDeckWidth() {
        return deckWidth;
    }

    /**
     * @param deckWidth the deckWidth to set
     */
    public void setDeckWidth(int deckWidth) {
        this.deckWidth = deckWidth;
    }

    /**
     * @return the decklength
     */
    public int getDeckLength() {
        return decklength;
    }

    /**
     * @param decklength the decklength to set
     */
    public void setDeckLength(int deckLength) {
        this.decklength = decklength;
    }
    
    /**
     * @return the HOME_TYPE
     */
    public String getHOME_TYPE() {
        return HOME_TYPE;
    }
    
    @Override
    public String toString() {
        return this.getHOME_TYPE() + " I have a garage size of " + this.getGarageLength() + " x " + this.getGarageWidth() +
                " feet with a kitchen size of " + this.getKitchenLength() + " x " + this.getKitchenWidth() + " feet. \nMy livingroom "
                + "dimensions are " + this.getLivingRoomLength() + " x " + this.getLivingRoomWidth() + "."
                + "\nI have " + this.getNumberOfBedrooms() + " bedrooms. I also have a deck that is " + this.getDeckLength() 
                + " x " + this.getDeckWidth() + " feet in size.\n";
    }
}
