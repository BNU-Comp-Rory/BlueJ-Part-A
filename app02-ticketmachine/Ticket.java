import java.util.Date;
/**
 * You do not need to create an object of ticket for the machine to be operational.
 * 
 * Ticket class used to denote Destination, Price, Date Issued and Print.
 *
 * @ Author  Rory Guilfoyle
 * @ Version 07.10.2020
 * 
 * @ Modified 13.10.2020
 */
public class Ticket
{
  private String destination;
  private int price;
  private Date issueDateTime;
  
  /**
   *  Creates the base ticket, using the constants in ticket machine to populate
   *  the destination and price, to be able to print.
   *  Issue Date Time is imported using util above.
   */
  public Ticket(String destination , int price)
  {      
    this.destination = destination;
    this.price = price;
    issueDateTime = new Date ();
  }
    
  /**
   * Returns the price of the ticket, used for printing.
   */
  public int getPrice()
  {
      return price;
  }    
  
  /**
   * Print method for the Ticket.
   * It will display the Destination, Price and Date Issued.
   */
  public void printTicket()
  {   
     System.out.println("################");
     System.out.println("     Ticket     ");
     System.out.println("Destination : " + destination);
     System.out.println("Price : " + price);
     System.out.println("Date Issued : " + issueDateTime);
     System.out.println("################");
  }   
}

