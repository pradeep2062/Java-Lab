package javalabcollege.Unit3;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JLabel lbl1,lbl2,lbl3;
    private JTextField txt1,txt2,txt3;
    private JButton add,sub,mul,div,mod;
    JPanel pnl1,pnl2;
    public Calculator(){
        setTitle("Calculator");
        setLayout(null);
        lbl1 = new JLabel("Number 1:");
        lbl2 = new JLabel("Number 2:");
        lbl3 = new JLabel("Result:");

        txt1= new JTextField();
        txt2 = new JTextField();

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");

        pnl1 = new JPanel(new GridLayout(2,2,5,5));
        pnl1.add(lbl1);
        pnl1.add(txt1);
        pnl1.add(lbl2);
        pnl1.add(txt2);
        pnl1.setBounds(5,5,300,60);

        pnl2 = new JPanel(new GridLayout(1,5,1,1));
        pnl2.add(add);
        pnl2.add(sub);
        pnl2.add(mul);
        pnl2.add(div);
        pnl2.add(mod);
        pnl2.setBounds(5,90,300,20);
        lbl3.setBounds(20,140,40,20);
        txt3 = new JTextField();
        txt3.setBounds(70,140,80,20);
        add(pnl1);
        add(pnl2);
        add(lbl3);
        add(txt3);
        add.addActionListener(ActiveEvent->{
            txt3.setText(String.valueOf(calculate(txt1.getText(),txt2.getText(),"+")));
        });
        sub.addActionListener(ActiveEvent->{
            txt3.setText(String.valueOf(calculate(txt1.getText(),txt2.getText(),"-")));
        });
        mul.addActionListener(ActiveEvent->{
            txt3.setText(String.valueOf(calculate(txt1.getText(),txt2.getText(),"*")));
        });
        div.addActionListener(ActiveEvent->{
            txt3.setText(String.valueOf(calculate(txt1.getText(),txt2.getText(),"/")));
        });
        mod.addActionListener(ActiveEvent->{
            txt3.setText(String.valueOf(calculate(txt1.getText(),txt2.getText(),"%")));
        });
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public float calculate(String x,String y,String sign){
        float a = Float.parseFloat(x);
        float b = Float.parseFloat(y);
        switch (sign){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            case "%":
                return a%b;
            default:
                System.out.println("Invalid Sign!");
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        new Calculator();
    }
}