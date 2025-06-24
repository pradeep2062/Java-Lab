package unit3;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        JTabbedPane pane = new JTabbedPane();
        pane.setBounds(60,60,250,250);
        JPanel pnl1 = new JPanel();
        pnl1.setBackground(Color.BLACK);
        JPanel pnl2 = new JPanel();
        pnl2.setBackground(Color.RED);
        JPanel pnl3 = new JPanel();
        pnl3.setBackground(Color.darkGray);
        pane.add("Panel1",pnl1);
        pane.add("Panel 2",pnl2);
        pane.add("Panel 3",pnl3);
        frame.add(pane);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
