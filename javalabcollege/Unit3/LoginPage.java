package javalabcollege.Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class LoginPage extends JFrame{
    private  JLabel lblUsername,lblPassword;
    private  JTextField txt1;
    private JPasswordField txt2;
    private  JButton btn;
    private JPanel pnl;
   public LoginPage(){
       setTitle("Login Page");
       setSize(350,400);
      lblUsername= new JLabel("Username:");
       lblPassword = new JLabel("Password:");
       txt1= new JTextField();
       txt2=new JPasswordField();
       btn=new JButton("Log In");
       pnl = new JPanel(new GridLayout(2,2,1,5));
       pnl.add(lblUsername);
       pnl.add(txt1);
       pnl.add(lblPassword);
       pnl.add(txt2);
       pnl.setBounds(10,10,300,50);
       btn.setBounds(140,120,80,20);
       setLocationRelativeTo(null);
       btn.addActionListener(ActionEvent->{
           if(txt1.getText().equals("admin") && txt2.getText().equals("pradeep")){
               btn.setBackground(Color.green);
               dispose();
               new Calculator();
           }
           else{
               btn.setBackground(Color.red);
               btn.setForeground(Color.white);
               JOptionPane.showMessageDialog(btn,"Invalid Credentials");
           }
       });
       setLayout(null);
       add(pnl);
       add(btn);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
       new LoginPage();
    }
}
