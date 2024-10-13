import java.util.HashMap;
import java.util.Map;
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
public class CashRegister {
    private Map<Integer, Product> products;
    public CashRegister() {
        products = new HashMap<>();
        // Add products to the Cash Register
        products.put(12345, new Product("Coffee", 8.32));
        products.put(67890, new Product("Tea", 5.50));  // Additional example product
    }
    // Fetch product details by UPC code
    public Product getProduct(int upc) {
        return products.get(upc);
    }
}



