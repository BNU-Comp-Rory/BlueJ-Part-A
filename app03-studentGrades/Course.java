
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock
 * @version 0.1 11/Sep/2020
 *
 * Modified by Rory Guilfoyle
 * 26.10.2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
        
    private Grades finalGrade;
    public boolean coursePassed;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        // initialise instance variables
        this.title = title;
        this.codeNo = codeNo;
        this.finalMark = 0;
        this.finalGrade = null;
        createModule();
    }

    public void createModule()
    {
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Maths for Games", "CO462");
        module3 = new Module("Concept Visualisation", "CO411");
        module4 = new Module("Game Design Theory", "CO412");
    }
    
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
        
        System.out.println("Final Mark = " + finalMark);
    }
    
    public void setMark(int mark,String codeNo) 
    {
      if(module1.getCodeNo() == codeNo)
      {
          module1.awardMark(mark);
      }
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 39))
        
        {
            return Grades.F;
        } 
        return Grades.X;
    }
    
    public void calculateFinalMark()
    {
       if(coursePassed)
       {
         int totalMark = module1.getMark() + module2.getMark() +
          module3.getMark() + module4.getMark();
           
         finalMark = totalMark / 4;
         print();
       }
       else
       {
       
       }
    }
    
    public boolean coursePassed()
    {
        if((((module1.isPassed()) && module2.isPassed()) 
            && module3.isPassed()) && module4.isPassed())
            {
                return true;
            }
            else return false;
    }
    
    public void printModules()
    {
        if (coursePassed)
        {
            System.out.println("final Mark = " + finalMark);
        }
    }
}
