package unit3;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Event");
        JButton btn = new JButton("Click Me");
        btn.setBounds(150,150,200,50);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("You Clicked Me!");
                JOptionPane.showMessageDialog(null,"You Clicked Me!");
             }

        });
    }
}