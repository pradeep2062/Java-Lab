package unit3;

import javax.swing.*;

public class RadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        JPanel panel = new JPanel();
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        JRadioButton r3 = new JRadioButton("Other");
        JLabel label = new JLabel("Gender: ");
        r1.setBounds(100,100,100,30);
        r2.setBounds(150,100,100,30);
        r3.setBounds(200,100,100,30);
        label.setBounds(50,100,150,30);
        panel.add(label);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
