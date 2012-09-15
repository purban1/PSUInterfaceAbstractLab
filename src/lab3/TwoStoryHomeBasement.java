package lab3;

/**
 *
 * @author Patrick Urban
 * 
 * This class extends the concrete class TwoStoryHome to store the necessary 
 * values in the fields declared
 * 
 */
public class TwoStoryHomeBasement extends TwoStoryHome implements FinishedBasement{
    private int finishedBasementWidth;
    private int finishedBasementLength;

    /**
     * @return the finnishedBasementWidth
     */
    public int getFinishedBasementWidth() {
        return finishedBasementWidth;
    }

    /**
     * @param finnishedBasementWidth the finnishedBasementWidth to set
     */
    public void setFinishedBasementWidth(int finishedBasementWidth) {
        this.finishedBasementWidth = finishedBasementWidth;
    }

    /**
     * @return the finnishedBasementLength
     */
    public int getFinishedBasementLength() {
        return finishedBasementLength;
    }

    /**
     * @param finnishedBasementLength the finnishedBasementLength to set
     */
    public void setFinishedBasementLength(int finishedBasementLength) {
        this.finishedBasementLength = finishedBasementLength;
    }
    
    public void setSizeOfRoom(int wid, int len){
        //validate the inputs
        this.setFinishedBasementWidth(wid);
        this.setFinishedBasementLength(len);
    }
    
}
