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
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        manager = new StockManager();
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
        // Show details of all of the products.
        manager.printProductDetails();
    }
    
    // /**
     // * Show details of the given product. If found,
     // * its name and stock quantity will be shown.
     // * @param id The ID of the product to look for.
     // */
    // public void showDetails(int id)
    // {
        // Product product = getProduct(id);
        
        // if(product != null) 
        // {
            // System.out.println(product.toString());
        // }
    // }
    
    // /**
     // * Sell one of the given item.
     // * Show the before and after status of the product.
     // * @param id The ID of the product being sold.
     // */
    // public void sellProduct(int id)
    // {
        // Product product = getProduct(id);
        
        // if(product != null) 
        // {
            // showDetails(id);
            // product.sellOne();
            // showDetails(id);
        // }
    // }
    
    // /**
     // * Get the product with the given id from the manager.
     // * An error message is printed if there is no match.
     // * @param id The ID of the product.
     // * @return The Product, or null if no matching one is found.
     // */
    // public Product getProduct(int id)
    // {
        // Product product = manager.findProduct(id);
        
        // if(product == null) 
        // {
            // System.out.println("Product with ID: " + id +
                               // " is not recognised.");
        // }
        // return product;
    // }
}
