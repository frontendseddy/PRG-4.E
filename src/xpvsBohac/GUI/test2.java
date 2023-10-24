package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class test2 extends JFrame implements ActionListener {
    JLabel login, passwd, ok;
    String pass = "bflmpsvz";
    JTextField textPass, textUSR;
    JButton show, check;

    public test2() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 350);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        login = new JLabel("login");
        login.setBounds(10, 10, 80, 20);
        passwd = new JLabel("password");
        passwd.setBounds(10, 40, 80, 20);

        textUSR = new JTextField("Username");
        textUSR.setFont(new Font("Consolas", Font.PLAIN, 15));
        textUSR.setBounds(10, 60, 100, 40);

        textPass = new JTextField("Password");
        textPass.setFont(new Font("Consolas", Font.PLAIN, 15));
        textPass.setBounds(10, 110, 100, 40);
        textPass.setBackground(Color.BLACK);
        textPass.setForeground(Color.black);

        check = new JButton();
        check.setText("Check");
        check.addActionListener(this);
        check.setBounds(10, 150, 70, 40);

        show = new JButton();
        show.setText("Show");
        show.addActionListener(this);
        show.setBounds(70, 150, 70, 40);

        ok = new JLabel("OK");
        ok.setBounds(70, 200, 70, 40);
        ok.setOpaque(true);


        this.add(login);
        this.add(passwd);
        this.add(textUSR);
        this.add(textPass);
        this.add(check);
        this.add(show);
        this.add(ok);

    }

    public static void main(String[] args) {
        new test2().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == check) {
            if (textPass.getText().equals(pass)) {
                ok.setBackground(Color.green);
            } else {
                ok.setBackground(Color.red);
            }
        }
        if (e.getSource() == show) {
            if (textPass.getBackground().equals(Color.BLACK)) {
                show.setText("Unshow");
                textPass.setBackground(Color.white);
            } else {
                show.setText("Show");
                textPass.setBackground(Color.black);
            }
        }
    }
}
