package unit3;
import javax.swing.*;
public class StudentFormSwing extends JFrame {
    private JLabel lblF,lblL,lblE,lblFab,lblG,lbP;
    private JTextField txtF,txtL,txtE;
    private JRadioButton rdoM,rdoF,rdoO;
    private ButtonGroup bg;
    private JComboBox<String> cbP;
    private JCheckBox cb1,cb2,cb3;
    private JButton btnC,btnS;

    public StudentFormSwing(){

        setTitle("Student Form");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //first name
        lblF=new JLabel("First Name");
        lblF.setBounds(70,40,100,25);
        add(lblF);
        txtF=new JTextField();
        txtF.setBounds(70,70,125,25);
        add(txtF);
        //last name
        lblL=new JLabel("Last Name");
        lblL.setBounds(270,40,100,25);
        add(lblL);
        txtL=new JTextField();
        txtL.setBounds(270,70,125,25);
        add(txtL);
        //email
        lblE=new JLabel("Email");
        lblE.setBounds(70,110,100,25);
        add(lblE);
        txtE=new JTextField();
        txtE.setBounds(70,140,325,25);
        add(txtE);
        //gender
        lblG=new JLabel("Gender");
        lblG.setBounds(70,190,100,25);
        add(lblG);
        rdoM = new JRadioButton("Male");
        rdoM.setBounds(70, 220, 70, 25);
        add(rdoM);
        rdoF = new JRadioButton("Female");
        rdoF.setBounds(150, 220, 80, 25);
        add(rdoF);
        rdoO = new JRadioButton("Others");
        rdoO.setBounds(240, 220, 90, 25);
        add(rdoO);
        bg=new ButtonGroup();
        bg.add(rdoM);
        bg.add(rdoF);
        bg.add(rdoO);
        //program combobox
        lbP=new JLabel("Program");
        lbP.setBounds(70,250,100,25);
        add(lbP);
        cbP=new JComboBox<>(new String[]{"BE Computer","BCA","BE Civil"});
        cbP.setBounds(160,250,200,25);
        cbP.setSelectedIndex(-1);
        add(cbP);
        //checkbox for favourite progrmming subject
        lblFab=new JLabel("Favourite Programming");
        lblFab.setBounds(70,290,200,25);
        add(lblFab);

        cb1=new JCheckBox("Java");
        cb1.setBounds(70,320,80,25);
        add(cb1);
        cb2 = new JCheckBox("Python");
        cb2.setBounds(150, 320, 80, 25);
        add(cb2);
        cb3 = new JCheckBox("C");
        cb3.setBounds(240, 320, 50, 25);
        add(cb3);
        // clear and submit button
        btnC=new JButton("Clear");
        btnC.setBounds(100,380,100,30);
        add(btnC);
        btnS=new JButton("Submit");
        btnS.setBounds(220,380,100,30);
        add(btnS);
        //action for clear button
        btnC.addActionListener(e -> {
            txtF.setText("");
            txtL.setText("");
            txtE.setText("");
            bg.clearSelection();
            cbP.setSelectedIndex(-1);
            cb1.setSelected(false);
            cb2.setSelected(false);
            cb3.setSelected(false);
        });
        //action for submit button
        btnS.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,"Form submitted successfully","success",JOptionPane.INFORMATION_MESSAGE);
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentFormSwing();
    }
}
