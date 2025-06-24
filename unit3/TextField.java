package unit3;

import javax.swing.*;

public class TextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");
        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField("Hello World!");
        JTextField textField2 = new JTextField(12);
        JTextField textField3 = new JTextField("How are you?",12);
        textField.setBounds(120,80,100,30);
        textField1.setBounds(120,120,100,30);
        textField2.setBounds(120,160,100,30);
        textField3.setBounds(120,200,100,30);
        frame.add(textField);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
