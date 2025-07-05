package unit3;
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends JFrame {
    public GridBagLayoutDemo(){
        // Set window title
        setTitle("Grid Bag Layout Example");

        // Create GridBagConstraints to control component layout
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        // Default settings for GridBagConstraints
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding

        // Add button in position (0,0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JButton("Button 1"), gbc);

        // Add button in position (1,0)
        gbc.gridx = 1;
        add(new JButton("Button 2"), gbc);

        // Add button in position (2,0)
        gbc.gridx = 2;
        add(new JButton("Button 3"), gbc);

        // Add text field spanning 3 columns in position (0,1)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(new JTextField("Spans three columns"), gbc);

        // Add large button in position (1,2)
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipady = 40; // Make this component taller
        add(new JButton("Tall Button"), gbc);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
