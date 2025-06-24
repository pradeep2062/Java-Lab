package unit3;

import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example Application");
        String [] cols = {"ID","name","stream"};
        String [][] data = {
                {"1","Ram","BCA"},
                {"2","Shyam","BCA"},
                {"3","Shubham","BCA"}
        };
        JTable tbl = new JTable(data,cols);
        JScrollPane bar = new JScrollPane(tbl);
        frame.add(bar);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
