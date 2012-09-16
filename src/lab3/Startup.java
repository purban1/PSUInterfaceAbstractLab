package lab3;

/**
 *
 * @author production
 */
public class Startup {
    public static void main(String[] args) {
        
        // Creating a Ranch Home
        RanchHome rh = new RanchHome();
        
        // Creating a 2 Story home
        TwoStoryHome twoStory = new TwoStoryHome();
        
        // Creating a 2 Story home with finnished Basement
        TwoStoryHomeBasement tsb = new TwoStoryHomeBasement();
        
        // Setup Ranch home
        rh.setGarageLength(30);
        rh.setGarageWidth(18);
        
        rh.setKitchenLength(10);
        rh.setKitchenWidth(8);
                
        rh.setLivingRoomLength(16);
        rh.setLivingRoomWidth(10);        
        
        rh.setNumberOfBedrooms(4);
        
        System.out.println(rh);
        
        // Setup Two Story 
        twoStory.setGarageLength(28);
        twoStory.setGarageWidth(16);
        
        twoStory.setKitchenLength(11);
        twoStory.setKitchenWidth(10);
                
        twoStory.setLivingRoomLength(18);
        twoStory.setLivingRoomWidth(9);
        
        twoStory.setNumberOfBedrooms(3);
        
        System.out.println(twoStory);
        
        // Setup Two Story with finnsihed Basement
        tsb.setGarageLength(25);
        tsb.setGarageWidth(18);
        
        tsb.setKitchenLength(10);
        tsb.setKitchenWidth(10);
        
        tsb.setLivingRoomLength(14);
        tsb.setLivingRoomWidth(12);
        
        tsb.setNumberOfBedrooms(4);
        
        tsb.setFinishedBasementLength(22);
        tsb.setFinishedBasementWidth(12);
        
        System.out.println(tsb);
        
    }
}
