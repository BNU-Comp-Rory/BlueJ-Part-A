
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @ Rory Guilfoyle
 * @ 24.11.2020
 */
public class StockApp
{   
    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "printall";
    public static final String REMOVE = "remove";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String SEARCH = "search";
    public static final String DISPLAY_LOW_STOCK = "display low stock";
    public static final String RE_STOCK = "restock";
    
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo(manager);
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        printHeading();
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            
            if(choice.equals(QUIT))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }
    
    /**
     * 
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if (choice.equals(PRINT_ALL))
        {
            manager.printProductDetails();
            String value = input.getString();
        }
        else if (choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if (choice.equals(DELIVER))
        {
            deliverProduct();  
        }
        else if (choice.equals(SELL))
        {
            sellProduct();
        }
        else if (choice.equals(SEARCH))
        {
            searchProduct();
        }
        else if (choice.equals(DISPLAY_LOW_STOCK))
        {
            lowStockPrint();
        }
        // else if (choice.equals(RE_STOCK))
        // {
            // restock();
        // }
    }
    
    /**
     * 
     */
    private void addProduct()
    {
        System.out.println("Adding a new product\n");
        
        System.out.println("Please enter product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
       while (manager.findProduct (id)!=null)
       {
           System.out.println("Product Id already exists\n Please enter another ID");
           value = input.getString();
           id = Integer.parseInt(value);
       }
       
        if (manager.findProduct (id) == null)
       {
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        while (name.length() == 0)
        {
            System.out.println("Cannot leave blank");
            name = input.getString();
        }
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println("\n You have added ID: " + product);
        System.out.println();
       }
    }
    
    /**
     * 
     */
    private void removeProduct()
    {
        System.out.println("Removing an existing product\n");
        
        System.out.println("Please enter product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        Product product = manager.findProduct(id);
        if (product != null)
        {
            System.out.println("Product Removed: " + product.toString());
            manager.removeProduct(product);
        }
        else
        System.out.println ("Product not found");
    }
    
    /**
     * 
     */
    private void deliverProduct()
    {
        System.out.println("Deliver product\n");
        
        System.out.println("Please enter product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        Product product = manager.findProduct(id);
        if (product != null)
        {
            System.out.println("Please enter amount delivered: ");
            String string = input.getString();
            int amount = Integer.parseInt(string);
            
            manager.delivery(id, amount);
        }
        else
        System.out.println ("Product not found");
    }
    
    /**
     * 
     */
    private void sellProduct()
    {
        System.out.println("Sell product\n");
        
        System.out.println("Please enter product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        Product product = manager.findProduct(id);
        if (product != null)
        {
            System.out.println("Please enter amount sold: ");
            String string = input.getString();
            int amount = Integer.parseInt(string);
            
            manager.sellMultiple(id, amount);
        }
        else
        System.out.println ("Product not found");
    }
    
    /**
     * 
     */
    private void searchProduct()
    {
        System.out.println("Search products\n");
        
        System.out.println("Please enter product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        Product product = manager.findProduct(id);
        if (product != null)
        {
            manager.findProduct(id);
            System.out.println("Product found: " + product.toString());
        }
        else
        System.out.println ("Product not found");
    }
    
    /**
     * 
     */
    private void lowStockPrint()
    {
        System.out.println("The following items are low in stock:\n");
        manager.checkLowStock();
    }
    
    // /**
     // * 
     // */
    // private void restock()
    // {
        // System.out.println("Restocking low stock products\n");
        
    // }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("\t\tMenu options");
        System.out.println("Add:\t\t\tAdd a new product");
        System.out.println("Remove:\t\t\tRemove an old product");
        System.out.println("PrintAll:\t\tPrint all products");
        System.out.println("Quit:\t\t\tQuit the program");
        System.out.println("Deliver:\t\tDeliver a product");
        System.out.println("Sell:\t\t\tSell a product");
        System.out.println("Search:\t\t\tSearch for a product");
        System.out.println("Display low Stock:\tPrint Low stock items");
        System.out.println("Restock:\t\tRestock Products below 5");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Rory Guilfoyle");
        System.out.println("******************************");
    }
}
