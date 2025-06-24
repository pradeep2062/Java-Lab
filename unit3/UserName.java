package unit3;
import javax.swing.*;
import java.awt.*;

public class UserName {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 400);

        JLabel lb1 = new JLabel("Id:");
        JLabel lb2 = new JLabel("Password:");
        JTextField txt1 = new JTextField();
        JPasswordField j1 = new JPasswordField();

        JPanel jp1 = new JPanel(new GridLayout(2, 2, 10, 10));
        jp1.add(lb1);
        jp1.add(txt1);
        jp1.add(lb2);
        jp1.add(j1);
        jp1.setBounds(50, 50, 300, 80);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);

        frame.setLayout(null);
        frame.add(jp1);
        frame.add(loginButton);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}