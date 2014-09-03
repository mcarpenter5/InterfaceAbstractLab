/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author dominicalaus
 */
public class StartUp {
    public static void main(String[] args) {
        // This can be used when it is when it showing an Is'a Relationship
        // It shouldn't be used when there is something different about the two like an abstraction.
        Course a = new IntroToProgrammingCourse();
        a.setCourseName("Into To programming");
        a.setCourseNumber("5450");
        a.setCredits(2);
        
        System.out.println(a.getCourseName() 
                + " " + "Course Number:" + " " + a.getCourseNumber() 
                + " " + "Credits for this course:" + " " + a.getCredits());
        System.out.println("The Prerequisites for this course are:");
        a.showPrerequisites();
        
    }
}
