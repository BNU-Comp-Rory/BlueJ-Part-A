import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @ Author Rory Guilfoyle 
 * @ 28.10.2020
 * 
 * @ Modified
 * @ 03.11.2020
 * @ 08.11.2020
 */
public class StockManager
{
    // An array list of the products.
    private ArrayList<Product> stock;
    // True or false if the stock exists to modify
    private boolean validate;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered : " + product);
        }
        else
        System.out.println("Product ID " + id + " not found!");
    }
    
    /**
     * Search the products using name
     */
    public void search(String name)
    {
        validate = false;
        for(Product product : stock)
        {
            if(product.getName().equals(name))
            {
                System.out.println(product);
                validate = true;
            }
            
        }
        validate();
    }
    
    /**
     * Validate if products are true or false
     */
    private void validate()
    {
        if(validate != true)
        {
            System.out.println("Product not found!");
            
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Sell a product individually and specify the amount.
     */
    public void sellMultiple(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.sell(amount);
            System.out.println("Product Sold : " + product.getName() + 
            " Amount sold : " + amount);
        }
    }
    
    /**
     * Rename the product.
     */
    public void renameProduct(int id, String newName)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            System.out.println("Product: " + product.getName());
            product.renameProduct(newName);
            System.out.println("Product Renamed to : " + product.getName());
        }
    }
    
    /**
     *  Remove a product
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            System.out.println("Product Removed: " + product.toString());
            stock.remove(product);
        }
        else
        System.out.println ("Product not found");
        
    }
    
    /**
     * Check if the stock of any product is below 5 and print result. 
     */
    public void checkLowStock()
    {
        int low = 5;
        for (Product product : stock)
        {
          if (product.getQuantity() <= low)
          {
            System.out.println(product.toString());
          }
        }
        
    }

    /**
     * Print details of all the products and stock level.
     */
    public void printProductDetails()
    {
        for (Product product : stock)
        {
            System.out.println(product.toString());
        }
    }
}
