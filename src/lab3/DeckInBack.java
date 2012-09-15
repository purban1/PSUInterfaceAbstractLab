package lab3;

/**
 *
 * @author Patrick Urban
 * 
 * This interface makes sure that if you have a deck on the back of your home
 * that you include the necessary getters and setters to store and retrieve
 * the size parameters of the deck.
 * 
 */
public interface DeckInBack {
    public abstract void setDeckLength(int deckLength);
    public abstract void setDeckWidth(int deckWidth);
    public abstract int getDeckLength();
    public abstract int getDeckWidth();
}

