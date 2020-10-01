import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * 
 * Modified by Rory Guilfoyle
 * 01.10.2020
 * Modifications, Work in progress
 * Adding a method to add a course to the student
 * Adding the course to the print list
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    // the course assigned to the student 
    private String course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " 
        + credits );
    }

    /** Add a Course to this student.
     * 
     */
    //public void selectcourse (Course NewCourse)
    //    {
    //        course.(NewCourse);
    //    }
}
    
    /**
     * Add a Course to this student, if enrolled.
     */
    //public void selectcourse(Course newCourse)
    //{
    //    if(LabClass.Arraylist<Student>(Object[] elementData() == null) 
    //    {
    //        System.out.println("The student has not enrolled in class");
    //    }
    //    else 
    //    {
    //        students.add(newCourse);
    //    }
    //}
//}
