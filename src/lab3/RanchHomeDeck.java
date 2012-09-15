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
}
