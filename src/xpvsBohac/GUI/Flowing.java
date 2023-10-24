package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class Flowing extends JFrame {
    JPanel panel;
    public Flowing() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setOpaque(true);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 11, 2));
        panel.setPreferredSize(new Dimension(250,250));
        this.add(panel);
        for (int i = 0; i < 9; i++) {
            panel.add(new JButton(String.valueOf(i + 1)));
        }

    }

    public static void main(String[] args) {
        new Flowing().setVisible(true);
    }
}
