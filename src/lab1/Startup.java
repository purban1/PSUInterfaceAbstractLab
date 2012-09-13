package lab1;

/**
 *
 * @author Patrick
 */
public class Startup {
    
    public static void main(String[] args) {
    
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
