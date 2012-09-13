package lab2;

/**
 *
 * @author Patrick
 */
public class Startup {
    
    public static void main(String[] args) {
    
        /* The good.
         * Having an interface was very helpful. The classes that implemented
         * the interface (IntroJavaCourse) red flagged any missing methods.
         * 
         * The Bad.
         * Interfaces require more work. Methods common to all classes were missing
         * verifiers and the verifiers needed to be added to each of the classes unlike 
         * the abstract class where the same verifier would have been only needed
         * once.
         */ 
        
        // Testing the subclasses to make sure the abstract class us working
        IntroToProgrammingCourse ip = new IntroToProgrammingCourse("Intro to programming", "153-296");
        ip.setCredits(4.0);
        
        IntroJavaCourse ijp = new IntroJavaCourse("Intro to Java", "153-396");
        ijp.setCredits(4.0);
        
        System.out.println(ip.getCourseName()); 
        System.out.println(ip.getCourseNumber());
        System.out.println(ip.getCredits());
        
        System.out.println(ijp.getCourseName()); 
        System.out.println(ijp.getCourseNumber());
        System.out.println(ijp.getCredits());
    }
    
}
