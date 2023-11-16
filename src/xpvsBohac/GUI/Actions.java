package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions extends JFrame implements ActionListener{
    JButton button, anotherButton, showButton;
    JLabel label;
    public Actions() {
        this.setTitle("Akce");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        button = new JButton();
        anotherButton = new JButton();
        button.addActionListener(this);
        anotherButton.addActionListener(this);
        anotherButton.setText("another button");
        anotherButton.setBounds(350, 100, 100, 50);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource() == button){
//                    System.out.println("button pressed");
//
//                }
//            }
//        });

        this.setLayout(null); // ted uz pouzivame x,y souradnice
        button.setText("Press me!");
        button.setBounds(200, 100, 100, 60); // musi byt layout na null
        button.setFocusable(true);
        button.setEnabled(true);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //cursor hover, normal to hand
        button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        button.setBackground(Color.green);
        showButton = new JButton("Show");
        label = new JLabel("Shown text");
        showButton.setBounds(200,200, 100, 60);
        label.setBounds(350, 200, 100, 50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setForeground(Color.black);
        showButton.addActionListener(this);

        this.add(label);
        this.add(showButton);
        this.add(button);
        this.add(anotherButton);
    }


    public static void main(String[] args) {
        new Actions().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("button");
            anotherButton.setEnabled(true);
            button.setEnabled(false);

        }
        if (e.getSource()== anotherButton){
            System.out.println("another");
            button.setEnabled(true);
            anotherButton.setEnabled(false);

        }
        if (e.getSource() == showButton){
            System.out.println("show");
            if (label.getForeground().equals(Color.BLACK)) {
                label.setForeground(Color.white);
                showButton.setText("hide");
            }else {
                label.setForeground(Color.black);
                showButton.setText("show");
            }
        }
    }
}


