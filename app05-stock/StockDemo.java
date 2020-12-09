import java.util.Random;
import java.util.*;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * 
 * @ Modified Rory Guilfoyle
 * @ 28.10.2020
 * @ 03.11.2020
 * @ 08.11.2020
 * @ 09.12.2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    // Generates a random number for deilvery and sales examples
    private Random generator;

    /**
     * Creates a StockManager and populates it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        generator = new Random();
        
        manager.addProduct(new Product(100, "Milk"));
        manager.addProduct(new Product(101, "Bread"));
        manager.addProduct(new Product(102, "Bacon"));
        manager.addProduct(new Product(103, "Sausage"));
        manager.addProduct(new Product(104, "Beans"));
        manager.addProduct(new Product(105, "Eggs"));
        manager.addProduct(new Product(106, "Butter"));
        manager.addProduct(new Product(107, "Flour"));
        manager.addProduct(new Product(108, "Tomatoes"));
        manager.addProduct(new Product(109, "Pizza"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        System.out.println ("This is the stock for Rory's Shop");
        System.out.println ();
        manager.printProductDetails(manager.getStock());
        print("Delivery");
        deliverProducts(manager.getStock());
        print ("Sell");
        sellProducts();
    }
    
    /**
     * Deliver a random amount of products to the store.
     * 20 max and 5 min delivery.
     */
    public void deliverProducts(ArrayList<Product> list)
    {
        for (Product product : list)
        {
            int amount = generator.nextInt(20 - 5) + 5;
            manager.delivery(product.getID(),amount);
        }
        
    }
    
    /**
     * Sell random products from the store.
     * 8 max and 1 min sold
     */
    private void sellProducts()
    {
        int amount = 0;
        
        for (int id = 100; id <= 109; id++)
        {
            amount = generator.nextInt(8) + 1;
            manager.sellMultiple(id,amount);
        }
    }
    
    /**
     * Creates a space for aesthetic printing.
     */
    private void print(String spacer)
    {
        System.out.println ();
        System.out.println ("Demonstrating: " + spacer);
        System.out.println ();
    }
}
