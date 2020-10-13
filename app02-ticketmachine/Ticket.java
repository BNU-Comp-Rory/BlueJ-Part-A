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
    
  private Date issueDateTime;
    
  private int price;
  
  private Ticket aylesburyTicket;
  private Ticket amershamTicket;
  private Ticket highWycombeTicket;
  
  //public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 200);
  //public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
  //public static final Ticket HIGHWYCOMBE_TICKET = new Ticket("High Wycombe", 330);
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
  
  // /**
   // * 
   // */
  // public void createTicket ()
  // {
      // Ticket aylesbury = AYLESBURY_TICKET;
  // }
    
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
  
  /**
   * 
   */
  public String getDestination ()
  {
   return destination;
  }
  
  /**
   * 
   */
  public int price()
  {
      return price;
  }
}

