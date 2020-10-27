
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
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
        
        System.out.println("Final Mark = " + finalMark);
    }
    
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
      module1.print();
      module2.print();
      module3.print();
      module4.print();
    }
}
