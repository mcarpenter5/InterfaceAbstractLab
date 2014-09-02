package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
   public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
   }

    @Override
    public void showPrerequisites() {
        System.out.println("Intro to Programming course is required before you take this course");
    }

}
