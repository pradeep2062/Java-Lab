package unit3;

import javax.swing.*;

public class MenuCompleteExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JMenuBar Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2= new JMenu("Tools");
        JMenu submenu = new JMenu("New");

        JMenuItem item1 = new JMenuItem("Exit");
        JMenuItem item2 = new JMenuItem("About");
        JMenuItem item3 = new JMenuItem("Open File");

        // file submenu
        JMenuItem item4 = new JMenuItem("Project");
        JMenuItem item5 = new JMenuItem("File");
        item5.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "File Doesn't exist","Error",JOptionPane.ERROR_MESSAGE);
        });
        JMenuItem item6 = new JMenuItem("Java Class");
        JMenuItem item7 = new JMenuItem("Module");

        // tools
        JMenuItem item8 = new JMenuItem("Run");
        JMenuItem item9 = new JMenuItem("Debug");
        JMenuItem item10 = new JMenuItem("Debug & Run");

        submenu.add(item4);
        submenu.add(item5);
        submenu.add(item6);
        submenu.add(item7);

        menu2.add(item8);
        menu2.add(item9);
        menu2.add(item10);

        menu1.add(submenu);
        menu1.add(item3);
        menu1.add(item2);
        menu1.add(item1);

        menuBar.add(menu1);
        menuBar.add(menu2);

        frame.setSize(400, 400);
        frame.setJMenuBar(menuBar);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
