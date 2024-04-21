package Hell.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILogin extends JFrame {
    JLabel userLabel, psswdLabel;
    JTextField userField, psswdField;
    JButton login;
    JPanel uPanel,dPanel;
    JFrame f = new JFrame();

    GUILogin() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 300);
        this.setTitle("Login");
        this.setLayout(new GridLayout(2,1));

        uPanel = new JPanel();
        dPanel = new JPanel();
        login = new JButton("Login");
        userLabel = new JLabel("USER: ");
        psswdLabel = new JLabel("PASSWORD: ");
        userField = new JTextField();
        psswdField = new JTextField();

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((userField.getText()).equals("pvs"))&&((psswdField.getText()).equals("prg"))){
                    //new DBrowser().setVisible(true);
                    //TODO: semka napsat to okno který chci aby se otvíralo
                }else {
                    JOptionPane.showMessageDialog(f,"blbě","Alert",JOptionPane.WARNING_MESSAGE);
                }

            }
        });





        uPanel.setBackground(Color.blue);
        dPanel.setBackground(Color.red);
        uPanel.setLayout(new GridLayout(2,2));
        uPanel.add(userLabel);
        uPanel.add(userField);
        uPanel.add(psswdLabel);
        uPanel.add(psswdField);



        this.add(uPanel);
        this.add(dPanel);
        dPanel.add(login);

    }

    public static void main(String[] args) {
        new GUILogin().setVisible(true);
    }
}
