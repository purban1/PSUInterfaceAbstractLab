package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author purban1
 */
public abstract class ProgrammingClass {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public ProgrammingClass(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
    public final String getCourseName() {
        return courseName;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    
}
