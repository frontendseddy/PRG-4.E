package xpvsBohac.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labeling extends JFrame {
    public Labeling() {
//        this.setSize(640, 620);
        this.setTitle("Labels");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JLabel label = new JLabel();
        label.setText("Nas super Martinek");
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
        label.setForeground(Color.GREEN);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBackground(Color.black);
        label.setOpaque(true);
        ImageIcon img = new ImageIcon("novotnz.jpg");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        label.setBorder(border);
//        label.setBounds(0,0,500,700);
//        this.setLayout(null);
        this.add(label);
        this.pack();
    }

    public static void main(String[] args) {
        new Labeling().setVisible(true);
    }

}
