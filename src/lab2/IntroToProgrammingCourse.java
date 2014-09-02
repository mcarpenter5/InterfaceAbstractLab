package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber,double credits) {
        this.courseName= courseName;
        this.courseNumber=courseNumber;
        this.credits=credits;
    }

   public IntroToProgrammingCourse() {
        }

    public void showPrerequisites() {
        System.out.println("There are no prerequisites for this course");
    }

    public String getCourseNumber() {
    return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
    if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;    
    }

    public String getCourseName() {
    return courseName;
    }

    public void setCourseName(String courseName) {
    if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public double getCredits() {
    return credits;
    }

    public void setCredits(double credits) {
    if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }


}
