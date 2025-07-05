package unit3;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo(){
        setTitle("Border Layout Demo");
        setSize(500,500);
        setLayout(new BorderLayout());
        JPanel pnl1 = new JPanel();
        pnl1.setBackground(Color.red);
        JPanel pnl2 = new JPanel();
        pnl2.setBackground(Color.green);
        JPanel pnl3 = new JPanel();
        pnl3.setBackground(Color.blue);
        JPanel pnl4 = new JPanel();
        pnl4.setBackground(Color.yellow);
        JPanel pnl5 = new JPanel();
        pnl5.setBackground(Color.pink);
        pnl1.setPreferredSize(new Dimension(260,50));
        pnl2.setPreferredSize(new Dimension(50,260));
        pnl3.setPreferredSize(new Dimension(50,260));
        pnl4.setPreferredSize(new Dimension(260,50));
        add(pnl1,BorderLayout.NORTH);
        add(pnl2,BorderLayout.EAST);
        add(pnl3,BorderLayout.WEST);
        add(pnl4,BorderLayout.SOUTH);
        add(pnl5,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
