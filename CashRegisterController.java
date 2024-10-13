import javax.swing.JOptionPane;

public class CashRegisterController {
    private CashRegister model;
    private View view;
    private Scanner scanner;

    public CashRegisterController(CashRegister m, View v) {
        model = m;
        view = v;
        scanner = new Scanner(); // Initialize the Scanner
        initView();
    }

    public void initView() {
        // Set initial view message
        view.getFirstnameTextfield().setText("Scan a product to display information.");
    }

    public void initController() {
        // Add action listeners for buttons
        view.getFirstnameSaveButton().addActionListener(e -> scanProduct());
        view.getBye().addActionListener(e -> exitApp());
    }

    // Action for scanning a product
    private void scanProduct() {
        int upc = scanner.generateUPC(); // Generate UPC code from Scanner
        Product product = model.getProduct(upc); // Fetch product details from CashRegister
        if (product != null) {
            // Update the text field to display UPC, Product name, and Price
            view.getFirstnameTextfield().setText("UPC: " + upc + " | Product: " + product.getName() + " | Price: $" + product.getPrice());
        } else {
            JOptionPane.showMessageDialog(null, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void exitApp() {
        System.exit(0); // Exit the application
    }
}
