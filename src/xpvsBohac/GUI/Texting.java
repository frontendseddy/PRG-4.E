package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Texting extends JFrame {
    public Texting()  {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TextFiled");
        this.setLocationRelativeTo(null);
        this.setSize(600, 600);
        this.setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(100,100,150,40);
        textField.setBackground(Color.red);
        textField.setForeground(Color.green);
        textField.setFont(new Font("MV Boli", Font.BOLD, 18));
        textField.setText("defaultText");
//        textField.setEnabled(false);
//toto vsechno ma i lable
//        textField.setFocusable(true);
        textField.getText();
        JButton printText = new JButton();
        printText.setBounds(255, 100, 100,40);
        printText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });
        JButton disableInput = new JButton("lock");
        disableInput.setBounds(29,100,70,40);
        disableInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (textField.isEnabled()) {
//                    textField.setEnabled(false);
//                }else{
//                    textField.setEnabled(true);
//                }
                textField.setEnabled(!textField.isEnabled());
            }
        });

        this.add(disableInput);
        this.add(printText);
        this.add(textField);
    }

    public static void main(String[] args) {
        new Texting().setVisible(true);
    }
}
