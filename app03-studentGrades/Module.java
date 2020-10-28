
/**
 * Write a description of class Module here.
 *
 * @ Rory Guilfoyle
 * @ 26.10.2020
 * 
 * @ Modified
 * @ 27.10.2020
 */
public class Module
{ 
   // Modules Title
   private String title;
   // Modules Code Number
   private String codeNo;
   // Mark for the Modules
   private int mark;
   // Credit for the Modules
   private int credit;
   // Passed or Failed the Modules
   private boolean passed;
    
   /** 
     * Sets the default feilds for the modules
     */
   public Module(String title, String codeNo)
   {
     mark = -1;
     this.title = title;
     this.codeNo = codeNo;
     credit = 15;
     passed = false;
   }
   
   /**
     * Give a mark to the module, 0-100
     */
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
  
   /**
     * Print the modules information and current mark
     */ 
   public void print()
   {
      System.out.println("Module: " + codeNo +
          " " + title + ", Mark = " + mark);
   }
   
   /**
     * Returns the mark
     */
   public int getMark()
   {
     return mark; 
   }
    
   /**
     * Returns the modules code number
     */
   public String getCodeNo()
   {
     return codeNo;   
   }
   
   /**
     * Checks mark and returns true or false if passed or failed.
     */
   public boolean isPassed()
   {
     return mark >=40;  
   }
}
