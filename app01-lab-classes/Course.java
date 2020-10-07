
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
     * Returns the courseCode and title as a String
     * used to enable the student print method
     */
     public String toString () 
     {
      return courseCode + " - " + title;
     }
}
