
/**
 * create a course that the students can take, includes Title and Course Code.
 *
 * @author Rory Guilfoyle
 * @version 01.10.2020
 */
public class Course
{
    public String title;
    
    public String courseCode;

     /**
     * Set the title for this Course.
     */
    public Course (String courseCode, String title)
    {
        this.courseCode = courseCode;
        this.title = title;
    }
    
    /**
     * Set the code for this Course.
     */
    public void setCourseCode(String courseCode)
    {
        courseCode = courseCode;
    }
    
    /**
     *
     */
     public String toString () 
     {
      return courseCode + " " + title ;
     }
}
