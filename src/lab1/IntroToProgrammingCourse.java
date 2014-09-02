package lab1;



/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course {
    public IntroToProgrammingCourse(){
        
    }
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
    
   

    @Override
    public void showPrerequisites() {
        System.out.println("There are no prerequisites for this course");
    
    }
    

    
}
