package unit3;
import javax.swing.*;
import java.awt.*;

public class Page extends JFrame {
    public Page(){
        setTitle("Signup Page");
        setSize(500,500) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        setLayout(null);
        setLocationRelativeTo( null) ;
        setVisible(true);
    }

    public static void main(String[] args) {
        new Page();
    }
}
