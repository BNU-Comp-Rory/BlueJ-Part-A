
/**
 * Present coin values for Ticket Machine
 * 10p
 * 20p
 * 100p - £1
 * 200p - £2
 * 
 * @ Author  Rory Guilfoyle
 * @ Version 07.10.2020
 * @ Modified 21.10.2020
 */
public enum Coin
{
    P10 (10),
    P20 (20),
    P100 (100),
    P200 (200);
    
    private final int value;
    
    /**
     * Assigns the final value to value
     */
    private Coin(int value)
    {
        this.value = value;
    }
    
    /**
     * return the Value of the coin
     */
    public int getValue()
    {
        return value;
    }
}
