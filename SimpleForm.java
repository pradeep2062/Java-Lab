import javax.swing.*;
import java.awt.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Form");
        JLabel label = new JLabel("First Name:");
        JTextField textField = new JTextField();
        JLabel label1 = new JLabel("Last Name:");
        JTextField textField1 = new JTextField();;
        JPanel panel = new JPanel(new GridLayout(2,2,1,5));
        panel.add(label);
        panel.add(label1);
        panel.add(textField);
        panel.add(textField1);
        panel.setBounds(10,10,300,50);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
