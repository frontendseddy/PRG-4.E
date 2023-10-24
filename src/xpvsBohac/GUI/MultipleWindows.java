package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleWindows extends JFrame {
    JButton button;
    public MultipleWindows() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        button = new JButton("Hit me");
        button.setBounds(60,60,200,200);
        button.setFont(new Font("Consolas", Font.BOLD, 24));
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MultipleWindows().setVisible(true);
    }
}
