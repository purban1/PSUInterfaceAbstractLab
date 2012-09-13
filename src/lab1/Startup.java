package lab1;

/**
 *
 * @author Patrick
 */
public class Startup {
    
    public static void main(String[] args) {
    
        /* The good.
         * I thought in this example abstract class worked out well because
         * the Intro To programming, Intro to Java and Advanced Java all had 
         * the exact same methods for setting and getting Course Name, Course Number
         * and number of credits. So since the methods are all the same, it saves time
         * by having them in the abstract class.
         * 
         * The Bad.
         * 
         */ 
        
        // Testing the subclasses to make sure the abstract class us working
        IntroToProgrammingCourse ip = new IntroToProgrammingCourse("Intro", "153-296");
        ip.setCredits(4.0);
        
        IntroJavaCourse ijp = new IntroJavaCourse("Intro J", "153-396");
        ijp.setCredits(4.0);
        
        System.out.println(ip.getCourseName()); 
        System.out.println(ip.getCourseNumber());
        System.out.println(ip.getCredits());
        
        System.out.println(ijp.getCourseName()); 
        System.out.println(ijp.getCourseNumber());
        System.out.println(ijp.getCredits());
    }
    
}
