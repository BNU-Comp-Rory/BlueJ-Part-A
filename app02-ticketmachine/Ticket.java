import java.util.Date;
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
  private int price;
  private Date issueDateTime;
  
  /**
   *  
   * 
   */
  public Ticket(String destination , int price)
  {      
    this.destination = destination;
    this.price = price;
    issueDateTime = new Date ();
  }
    
  /**
   * 
   */
  public int getPrice()
  {
      return price;
  }    
  
  /**
  *Print method for the Ticket.
  *It will display the Destination, Price and Date Issued.
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

