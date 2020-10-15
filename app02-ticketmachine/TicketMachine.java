import java.util.*;
import java.util.Date;
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * @ Modified Rory Guilfoyle
 * @ Modified 07.10.2020
 * @ Modified 13.10.2020
 */
public class TicketMachine
{
  
    public Coin coin;
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //private Ticket issuedTicket;
    private Ticket issuedTicket;
   
    public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);  
    public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
    public static final Ticket HIGHWYCOMBE_TICKET = new Ticket("High Wycombe", 330);
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
    }
    
    public void insertCoin(Coin coin)
    {
        balance = balance + coin.getValue();
    }

    /**
     * 
     * 
     */
    public void selectAylesbury()
    {
        issuedTicket = AYLESBURY_TICKET;
    }
    
    /**
     * 
     * 
     */
    public void selectAmersham()
    {
        issuedTicket = AMERSHAM_TICKET;
    }
    
    /**
     * 
     * 
     */
    public void selectHighWycombe()
    {
        issuedTicket = HIGHWYCOMBE_TICKET;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }


    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= issuedTicket.getPrice()) 
        {
            // Simulate the printing of a ticket.
            System.out.println();
            issuedTicket.printTicket();
            // Reduce the balance by the price.
            balance = balance - issuedTicket.getPrice();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               ( issuedTicket.getPrice()- balance) + " more cents.");
                    
        }
    }
 
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
