import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Scanner {
    private JFrame frame;
    private JPanel scannerPanel;
    private JButton scanButton;
    public Scanner() {
        frame = new JFrame("Scanner");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);
        frame.setLocation(300,50);
        frame.setVisible(true);

        // Create UI elements
        scanButton = new JButton("Scan");
        scannerPanel = new JPanel();

        // Add UI element to frame
        scannerPanel.add(scanButton);
        frame.getContentPane().add(scannerPanel);

        scanButton.addActionListener(e -> generateUPC());
    }
    public int generateUPC() {
        int upcCode = 12345; // Simulated UPC code
        System.out.println("Generated UPC: " + upcCode);
        return upcCode;
    }
}
