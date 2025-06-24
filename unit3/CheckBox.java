package unit3;

import javax.swing.*;

public class CheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Programming Languages: ");
        JCheckBox java = new JCheckBox("Java");
        JCheckBox c = new JCheckBox("C");
        JCheckBox cpp = new JCheckBox("C++");
        JCheckBox python = new JCheckBox("Python");
        java.setBounds(100,100,100,30);
        c.setBounds(150,100,100,30);
        cpp.setBounds(200,100,100,30);
        python.setBounds(250,100,100,30);
        label.setBounds(100,50,150,30);
        panel.add(label);
        panel.add(java);
        panel.add(c);
        panel.add(cpp);
        panel.add(python);
        frame.add(panel);
        frame.setSize(400,400);
       frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
