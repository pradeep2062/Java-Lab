package unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LogInPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400,400);
        JLabel username = new JLabel("Username:");
        JLabel password = new JLabel("Password:");
        JTextField txt = new JTextField();
        JPasswordField pass = new JPasswordField();
        JPanel pnl1 = new JPanel(new GridLayout(2, 2, 5, 5));
        pnl1.add(username);
        pnl1.add(txt);
        pnl1.add(password);
        pnl1.add(pass);
        pnl1.setBounds(20,50,300,50);
        frame.setLayout(null);
        JButton btn = new JButton("Log In");
        btn.setBounds(150,150,80,30);
        frame.add(btn);
        btn.addActionListener( e -> {
            JOptionPane.showMessageDialog(frame,"Successfully logged in");
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(pnl1);
        frame.setVisible(true);
    }

}
