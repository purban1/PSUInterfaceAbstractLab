package lab3;

/**
 *
 * @author Patrick Urban
 * Version 2 of this lab based on instructor feedback
 */
public class Startup {
    public static void main(String[] args) {
        
        // Creating a Ranch Home
        RanchHome rh = new RanchHome();
        
        // Creating a 2 Story home
        TwoStoryHome twoStory = new TwoStoryHome();
        
        // Setup Ranch home
        rh.setGarageLength(30);
        rh.setGarageWidth(18);
        
        rh.setKitchenLength(10);
        rh.setKitchenWidth(8);
                
        rh.setLivingRoomLength(16);
        rh.setLivingRoomWidth(10);        
        
        rh.setNumberOfBedrooms(4);
        
        System.out.println(rh);
        
        rh.setHomeFeature(new DeckInBack());
        
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
        
        twoStory.setHomeFeature(new FinishedBasement());
        
        System.out.println(twoStory);
        
    }
}
