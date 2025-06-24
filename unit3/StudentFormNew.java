package unit3;
import javax.swing.*;
import java.awt.*;
public class StudentFormNew {
    public static void main(String[] args) {
        JFrame frame =  new JFrame("Student Form");
        JLabel fName = new JLabel("First Name:");
        JLabel lName = new JLabel("Last Name:");
        JLabel mail = new JLabel("E-mail:");
        JLabel gender = new JLabel("Gender:");
        JLabel program = new JLabel("Program:");
        JLabel favourite = new JLabel("Favourite Programming Language:");

        JTextField first = new JTextField();
        JTextField second = new JTextField();
        JTextField email = new JTextField();

        JRadioButton btnMale = new JRadioButton("Male");
        JRadioButton btnFemale = new JRadioButton("Female");
        JRadioButton btnOther = new JRadioButton("Other");
        ButtonGroup group = new ButtonGroup();
        group.add(btnMale);
        group.add(btnFemale);
        group.add(btnOther);

        String [] programs = {"Choose a Program:","BE Computer","BE Civil","BCA","BBA"};
        JComboBox <String >programBox = new JComboBox<>(programs);

        JCheckBox check1 = new JCheckBox("Java");
        JCheckBox check2 = new JCheckBox("Python");
        JCheckBox check3 = new JCheckBox("C++");

        JButton btnClear = new JButton("Clear");
        JButton btnSubmit = new JButton("Submit");

        JPanel panel1 = new JPanel(new GridLayout(2,2,10,5));
        panel1.add(fName);
        panel1.add(lName);
        panel1.add(first);
        panel1.add(second);
        panel1.setBounds(10,10,400,60);
        JPanel panel2 = new JPanel(new GridLayout(2,1,10,5));
        panel2.add(mail);
        panel2.add(email);
        panel2.setBounds(10,80,400,60);

        gender.setBounds(10,150,100,40);
        JPanel panel3 = new JPanel(new GridLayout(1,3,1,5));
        panel3.add(btnMale);
        panel3.add(btnFemale);
        panel3.add(btnOther);
        panel3.setBounds(10,175,200,30);

        program.setBounds(10,210,100,50);
        programBox.setBounds(10,245,200,30);

       favourite.setBounds(10,290,200,50);
        JPanel panel4 = new JPanel(new GridLayout(1,3,1,5));
        panel4.add(check1);
        panel4.add(check2);
        panel4.add(check3);
        panel4.setBounds(10,323,200,50);

        JPanel panel5 = new JPanel(new GridLayout(1,2,10,5));
        panel5.add(btnClear);
        panel5.add(btnSubmit);
        panel5.setBounds(10,390,200,30);

        btnClear.addActionListener(e -> {
            first.setText("");
            second.setText("");
            email.setText("");
            group.clearSelection();
            programBox.setSelectedIndex(0);
            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
            JOptionPane.showMessageDialog(null,"Form Cleared!");
        });

        btnSubmit.addActionListener(e -> {
            if(first.getText().isEmpty() || second.getText().isEmpty() || email.getText().isEmpty() || group.getSelection() == null|| programBox.getSelectedIndex() == 0 ||( !check1.isSelected() && !check2.isSelected() && !check3.isSelected())) {
                JOptionPane.showMessageDialog(frame,"Please fill all the fields!");
            }else {
                JOptionPane.showMessageDialog(frame,"Form Submitted!");
            }
        });
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(gender);
        frame.add(program);
        frame.add(programBox);
        frame.add(favourite);
        frame.setSize(450,475);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
