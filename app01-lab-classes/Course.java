
/**
 * create a course that the students can take, includes Title and Course Code.
 *
 * @author Rory Guilfoyle
 * @version 01.10.2020
 */
public class Course
{
    // instance variables - Created the title for course and course code
    // the Course title
    private String title;
    // the Course code 
    private String courseCode;

     /**
     * Set the title for this Course.
     */
    public void setTitle(String title)
    {
        title = title;
    }
    
    /**
     * Set the code for this Course.
     */
    public void setCourseCode(String courseCode)
    {
        courseCode = courseCode;
    }
}
