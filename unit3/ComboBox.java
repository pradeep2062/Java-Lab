package unit3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 400);

        JLabel label = new JLabel("Gender: ");
        label.setBounds(50, 100, 80, 30);
        //combobox
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Male");
        comboBox.addItem("Female");
        comboBox.addItem("Other");
        comboBox.setBounds(130, 100, 100, 30);

        panel.add(label);
        panel.add(comboBox);
        frame.add(panel);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        comboBox.addActionListener( new ActionListener() {
            @Override
                    public void actionPerformed(ActionEvent e){
                String item = (String)comboBox.getSelectedItem();
                System.out.println("You selected: " + item);
            }
        });

    }
}
