package unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;

public class CardLayoutDemo  implements ActionListener {
    private CardLayout card;
    private JButton btn1,btn2,btn3;
    JFrame frame;
    CardLayoutDemo(){
        frame = new JFrame();
        frame.setTitle("Card Layout Example");
        card = new CardLayout();
        frame.setLayout(card);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(new JLabel("Card 1"));
        panel2.add(new JLabel("Card 2"));
        panel3.add(new JLabel("Card 3"));

        btn1 = new JButton("Next");
        btn2 = new JButton("Next");
        btn3 = new JButton("Next");

        panel1.add(btn1);
        panel2.add(btn2);
        panel3.add(btn3);

        frame.add(panel1, "1");
        frame.add(panel2, "2");
        frame.add(panel3, "3");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(frame);
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
