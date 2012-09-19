package lab3;

/**
 *
 * @author Patrick Urban
 * 
 * This interface makes sure that if you have a finished basement in your home
 * that you include the necessary getters and setters to store and retrieve
 * the size parameters of the finished portion of the basement.
 * 
 */
public class FinishedBasement implements HomeFeature{
//    public abstract void setSizeOfRoom(int wid, int len);
//    public abstract int getFinishedBasementWidth();
//    public abstract int getFinishedBasementLength();
    
    private String feature = "I have a finnished basement.";
    
    public String getHomeFeature(){
        return feature;
    }
}
