import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Tickets and Prices to locations that the TicketMachine can print.
 *
 * @ Author  Rory Guilfoyle
 * @ Version 07.10.2020
 * 
 * @ Modified 13.10.2020
 */
public class Ticket
{
  // Attributes
    
  private String destination;
    
  private Date issueDateTime;
    
  private int price;
    
   
  /**
   * Setting the destination, price for the Ticket. 
   * The date will populate to the current systems date.
   */
  public Ticket(String destination, int price)
  {
    this.destination = destination;
    this.price = price;
        
    issueDateTime = new Date();
  }
    
  /**
  *Print method for the Ticket.
  *It will display the Destination, Price and Date Issued.
  */
  public void print()
  {   
     System.out.println("################");
     System.out.println("     Ticket     ");
     System.out.println("Destination : " + destination);
     System.out.println("Price : " + price);
     System.out.println("Date Issued : " + issueDateTime);
     System.out.println("################");
  }   
}
