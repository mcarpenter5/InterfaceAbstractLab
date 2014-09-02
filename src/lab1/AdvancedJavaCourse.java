package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
    @Override
    public void showPrerequisites() {
        System.out.println("The intro to java course is required before you take this course.");
    }
    
}
