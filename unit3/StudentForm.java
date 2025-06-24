package unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StudentForm extends JFrame {
    private JTextField txtF, txtL, txtE;
    private JRadioButton rdoM, rdoF, rdoO;
    private JCheckBox cb1, cb2, cb3;
    private JComboBox<String> cbP;
    private ButtonGroup genderGroup;
    private JButton btnClear, btnSubmit;

    public StudentForm() {
        setTitle("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // First Name
        JLabel lblF = new JLabel("First Name");
        txtF = new JTextField();
        gbc.gridx = 0; gbc.gridy = 0;
        add(lblF, gbc);
        gbc.gridy = 1;
        add(txtF, gbc);

        // Last Name
        JLabel lblL = new JLabel("Last Name");
        txtL = new JTextField();
        gbc.gridx = 1; gbc.gridy = 0;
        add(lblL, gbc);
        gbc.gridy = 1;
        add(txtL, gbc);

        // Email
        JLabel lblE = new JLabel("Email");
        txtE = new JTextField();
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        add(lblE, gbc);
        gbc.gridy = 3;
        add(txtE, gbc);

        // Gender
        JLabel lblG = new JLabel("Gender");
        gbc.gridy = 4;
        add(lblG, gbc);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rdoM = new JRadioButton("Male");
        rdoF = new JRadioButton("Female");
        rdoO = new JRadioButton("Others");
        genderGroup = new ButtonGroup();
        genderGroup.add(rdoM);
        genderGroup.add(rdoF);
        genderGroup.add(rdoO);
        genderPanel.add(rdoM);
        genderPanel.add(rdoF);
        genderPanel.add(rdoO);
        gbc.gridy = 5;
        add(genderPanel, gbc);

        // Program
        cbP = new JComboBox<>(new String[]{"BE Computer", "BCA", "BE Civil"});
        cbP.setSelectedIndex(-1); // no default selection
        gbc.gridy = 6;
        add(cbP, gbc);

        // Favourite Programming
        JLabel lblFav = new JLabel("Favourite Programming");
        gbc.gridy = 7;
        add(lblFav, gbc);

        cb1 = new JCheckBox("Java");
        cb2 = new JCheckBox("Python");
        cb3 = new JCheckBox("C");
        JPanel favPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        favPanel.add(cb1);
        favPanel.add(cb2);
        favPanel.add(cb3);
        gbc.gridy = 8;
        add(favPanel, gbc);

        // Buttons
        btnClear = new JButton("Clear");
        btnSubmit = new JButton("Submit");
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnPanel.add(btnClear);
        btnPanel.add(btnSubmit);
        gbc.gridy = 9;
        add(btnPanel, gbc);

        // Action Listeners
        btnClear.addActionListener(this::clearForm);
        btnSubmit.addActionListener(this::submitForm);
    }

    private void clearForm(ActionEvent e) {
        txtF.setText("");
        txtL.setText("");
        txtE.setText("");
        genderGroup.clearSelection();
        cbP.setSelectedIndex(-1);
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
    }
    private void submitForm(ActionEvent e) {
        String firstName = txtF.getText().trim();
        String lastName = txtL.getText().trim();
        String email = txtE.getText().trim();
        String program = (String) cbP.getSelectedItem();

        boolean genderSelected = genderGroup.getSelection() != null;
        boolean langSelected = cb1.isSelected() || cb2.isSelected() || cb3.isSelected();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || !genderSelected || program == null || !langSelected) {
            JOptionPane.showMessageDialog(this, "Please fill all the details.", "Incomplete Form", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Form has been submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentForm().setVisible(true));
    }
}
