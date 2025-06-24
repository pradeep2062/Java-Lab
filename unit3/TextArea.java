package unit3;
import javax.swing.*;
public class TextArea extends JFrame {
    public TextArea() {
        setTitle("Text Area Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JTextArea text = new JTextArea("Hello, What's Up? What's going on out there?");
        text.setBounds(50, 100, 300, 200);
        this.add(text);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TextArea();
    }
}
