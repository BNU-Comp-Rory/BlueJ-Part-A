
/**
 * Write a description of class Module here.
 *
 * @ Rory Guilfoyle
 * @ 26.10.2020
 */
public class Module
{ 
   private String title;
    
   private String codeNo;
    
   private int mark;
    
   private int credit;
    
   private boolean passed;
    
   /**
     * Constructor for objects of class Module
     */
   public Module(String title, String codeNo)
   {
     mark = -1;
     this.title = title;
     this.codeNo = codeNo;
     credit = 15;
     passed = false;
   }
    
   public void awardMark(int mark)
   {
     if((mark >= 0) && (mark <= 100))
     {
        this.mark = mark;
     }
     else
     {
        System.out.print("Invalid mark!!!");
     }
   }
    
   public void print()
   {
      System.out.println("Module: " + codeNo +
          " " + title + ", Mark = " + mark);
   }

   public int getMark()
   {
     return mark; 
   }
    
   public String getCodeNo()
   {
     return codeNo;   
   }
   
   public boolean isPassed()
   {
     return mark >=0;  
   }
}
