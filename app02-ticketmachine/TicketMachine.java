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
    private Date issueDateTime;
    private Ticket issuedTicket;
    
    private int price;
    public Coin coin;
    
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // Coin enum
    //public int coin;
    
    //private Ticket issuedTicket;
    private Ticket aylesburyTicket;

   
    // public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);  
    //public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
    //public static final Ticket HIGHWYCOMBE_TICKET = new Ticket("High Wycomb", 330);
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
       
        
        // aylesburyTicket = new Ticket("Aylesbury",220);
        //amershamTicket = new Ticket("Amersham",300);
        //highWycombeTicket = new Ticket("High Wycombe",330);
        //issuedTicket = null;
        
    }
    
    public void insertCoin(Coin coin)
    {
        balance = balance + coin.getValue();
    }

    
    /**
     * 
     * 
     */
    public void createAylesbury()
    {
        // Ticket Aylesbury = AYLESBURY_TICKET;
    }
    // /**
     // * @Return The price of a ticket.
     // */
    // public int getPrice()
    // {
        // return price;
    // }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println(issuedTicket);
            
            // for (int i = 0; i <issuedTicket.size(); i++)//(Ticket tickets : issuedTicket)
            // {
               // System.out.print(issuedTicket.get(i));
               // //issuedTicket.printTicket();
            // }
            
            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }
    
    // /**
     // * Selects the ticket for Aylesbury
     // */
    // public void selectAylesbury()
    // {
        // issuedTicket = aylesburyTicket;
    // }  
    
    // public void print()
    // {
        // AYLESBURY_TICKET.print();
    // }
    
    // /**
     // * Selects the ticket for Amersham
     // */
    // public void selectAmersham()
    // {
        // issuedTicket = amershamTicket;
    // }  
    
    // /**
     // * Selects the ticket for High Wycombe
     // */
    // public void selectHighWycombe()
    // {
        // issuedTicket = highWycombeTicket;
    // }  
    
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
