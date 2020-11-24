
/**
 * This class will open up a UI to be able to use Stock Management.
 *
 * @ Rory Guilfoyle
 * @ 24.11.20202
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
