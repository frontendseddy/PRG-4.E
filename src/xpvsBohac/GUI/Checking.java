package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checking extends JFrame {
    Checking() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Print out in red color");
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setFocusable(false);

        JTextField textField = new JTextField("Text to be printed out");
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));

        JButton button = new JButton();
        button.setText("SUMBIT");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()){
                    System.err.println(textField.getText());
                }else {
                    System.out.println(textField.getText());
                }
            }
        });


        this.add(checkBox);
        this.add(textField);
        this.add(button);
        this.pack();
    }

    public static void main(String[] args) {
        new Checking().setVisible(true);
    }
}
