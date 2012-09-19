//package lab3;
//
///**
// *
// * @author Patrick Urban
// * 
// * This class extends the concrete class TwoStoryHome to store the necessary 
// * values in the fields declared
// * 
// */
//public class TwoStoryHomeBasement extends TwoStoryHome implements FinishedBasement{
//
//    private int finishedBasementWidth;
//    private int finishedBasementLength;
//    private final String HOME_TYPE = "I am a two story home "
//            + "with a finnished basement.";
//
//    /**
//     * @return the finnishedBasementWidth
//     */
//    public int getFinishedBasementWidth() {
//        return finishedBasementWidth;
//    }
//
//    /**
//     * @param finnishedBasementWidth the finnishedBasementWidth to set
//     */
//    public void setFinishedBasementWidth(int finishedBasementWidth) {
//        this.finishedBasementWidth = finishedBasementWidth;
//    }
//
//    /**
//     * @return the finnishedBasementLength
//     */
//    public int getFinishedBasementLength() {
//        return finishedBasementLength;
//    }
//
//    /**
//     * @param finnishedBasementLength the finnishedBasementLength to set
//     */
//    public void setFinishedBasementLength(int finishedBasementLength) {
//        this.finishedBasementLength = finishedBasementLength;
//    }
//    
//    public void setSizeOfRoom(int wid, int len){
//        //validate the inputs
//        this.setFinishedBasementWidth(wid);
//        this.setFinishedBasementLength(len);
//    }
//    
//    /**
//     * @return the HOME_TYPE
//     */
//    public String getHOME_TYPE() {
//        return HOME_TYPE;
//    }
//    
//    @Override
//    public String toString() {
//        return this.getHOME_TYPE() + " I have a garage size of " + this.getGarageLength() + " x " + this.getGarageWidth() +
//                " feet with a kitchen size of " + this.getKitchenLength() + " x " + this.getKitchenWidth() + " feet. \nMy livingroom "
//                + "dimensions are " + this.getLivingRoomLength() + " x " + this.getLivingRoomWidth() + "."
//                + "\nI have " + this.getNumberOfBedrooms() + " bedrooms. I also have a finnished basement that is " + this.getFinishedBasementLength()
//                + " x " + this.getFinishedBasementWidth() + " feet in size.\n";
//    }
//}
