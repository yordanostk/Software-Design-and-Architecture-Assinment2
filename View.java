import java.awt.BorderLayout;
import javax.swing.*;
public class View {
    private JFrame frame;
    private JTextField firstnameTextfield;  // This will be used to display product info
    private JButton firstnameSaveButton;  // This can act as the "Scan" button
    private JButton bye;
    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Create UI elements
        firstnameTextfield = new JTextField();  // This field will display the product info
        firstnameSaveButton = new JButton("Scan Product");  // This is the scan button
        bye = new JButton("Exit");
        // Add UI elements to frame
        frame.getContentPane().add(firstnameTextfield, BorderLayout.NORTH);
        frame.getContentPane().add(firstnameSaveButton, BorderLayout.CENTER);
        frame.getContentPane().add(bye, BorderLayout.SOUTH);
    }
    public JTextField getFirstnameTextfield() {
        return firstnameTextfield;
    }
    public JButton getFirstnameSaveButton() {
        return firstnameSaveButton;
    }
    public JButton getBye() {
        return bye;
    }
}
