package unit3;
import javax.swing.*;
public class OptionPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Option Pane Example");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(frame,"Just For Demo!");
        int value = 1;
        while(value != 0) {
             value = JOptionPane.showConfirmDialog(null, "Do you love me?", "Love Test", JOptionPane.YES_NO_OPTION);
            if (value == 0) {
                JOptionPane.showMessageDialog(null, "Hehe, I love you toooooo.", "Prem Patra", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        String name = JOptionPane.showInputDialog("What is your name my sweetie?");
        JOptionPane.showMessageDialog(frame,"I love youuuuu "+ name ,"Prem Patra",JOptionPane.INFORMATION_MESSAGE);
    }
}
