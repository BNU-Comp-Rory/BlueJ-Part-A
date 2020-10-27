
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock
 * @version 0.1 11/Sep/2020
 *
 * @ Modified by Rory Guilfoyle
 * @ 26.10.2020
 * 
 * @ 27.10.2020
 */
public class Course
{
    // Code number for the course
    private String codeNo;
    // Title for the course
    private String title;
    // Modules for the course
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;  
    // Final mark for the course
    private int finalMark;
    // Final Grade for the course
    private Grades finalGrade;
    // T/F if the course is passed
    public boolean coursePassed;
        
    /**
     * Creates a course which requires Title and Code No.
     */
    public Course(String title, String codeNo)
    {
      this.title = title;
      this.codeNo = codeNo;
      this.finalMark = 0;
      this.finalGrade = null;
    }

    /**
     * Creates the modules, predefined information
     */
    public void createModule()
    {
      module1 = new Module("Programming Concepts", "CO452");
      module2 = new Module("Maths for Games", "CO462");
      module3 = new Module("Concept Visualisation", "CO411");
      module4 = new Module("Game Design Theory", "CO412");
    }
    
    /**
     * Award a mark for the module
     */
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        else if (moduleNo ==2)
        {
            module2.awardMark(mark);
        }
        else if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        else if (moduleNo ==4)
        {
            module4.awardMark(mark);
        }
        else 
        {
          System.out.println ("The module is not assigned to this course");
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
      System.out.println("Course " + codeNo + " - " + title); 
      System.out.println("Final Mark = " + finalMark);
    }
    
    /**
     * Converts the mark into a lettered grade
     */
    private Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))        
        {
            return Grades.F;
        } 
        else if ((mark >=40) && (mark <50))
        {
            return Grades.D;
        }
        else if ((mark >=50) && (mark <60))
        {
            return Grades.C;
        }
        else if ((mark >=60) && (mark <70))
        {
            return Grades.B;
        }
        else if ((mark >=70) && (mark <=100))
        {
            return Grades.A;
        }
        else
        {
        return Grades.X;
        }
    }
    
    /**
     * Calculates the final grade by adding all modules together then deviding by 4.
     */
    public void calculateFinalMark()
    {
       if(coursePassed()==true)
       {
         int totalMark = module1.getMark() + module2.getMark() +
          module3.getMark() + module4.getMark();
           
         finalMark = totalMark / 4;
         System.out.println("Final Grade: " + convertToGrade(finalMark));
       }
       else
       {
         System.out.println ("Cannot calculate final grade");
       }
    }
    
    /**
     * Checks to see if the modules have been passed
     */
    public boolean coursePassed()
    {
        if((((module1.isPassed()) && module2.isPassed()) 
            && module3.isPassed()) && module4.isPassed())
            {
                return true;
            }
            else return false;
    }
    
    /**
     * Prints the module information
     */
    public void printModules()
    { 
      module1.print();
      module2.print();
      module3.print();
      module4.print();
    }
}
