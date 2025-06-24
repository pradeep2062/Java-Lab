package unit3;
import javax.swing.*;
import java.awt.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing Application");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
//        frame.getContentPane().setBackground(Color.red);
        ImageIcon img = new ImageIcon("D:/faviicon-60x60.png");
        frame.setIconImage(img.getImage());
        JLabel label = new JLabel("Hi, I am Pradeep Pant.");
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);
        label.setForeground(Color.red);
        frame.setVisible(true);
    }
}
