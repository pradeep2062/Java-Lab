package unit3;
import javax.swing.*;
public class Button extends JFrame {
    public Button(){
        setTitle("Button Example");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
	JButton btn = new JButton("Click Me");
	btn.setBounds(150,150,100,30);
	add(btn);
    setLocationRelativeTo(null);
	setVisible(true);
    }

    public static void main(String[] args) {
        new Button();
    }
}
