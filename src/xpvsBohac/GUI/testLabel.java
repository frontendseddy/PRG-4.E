package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class testLabel extends JFrame {
    public testLabel() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("testLabel");
        this.setLocationRelativeTo(null);
        this.setSize(700, 700);
        this.setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new GridLayout());
        mainPanel.setBounds(50, 50, 600, 600);

        JLabel upLabel = new JLabel("GridBelow");
        upLabel.setBounds(55, 55, 590, 100);
        upLabel.setBackground(Color.red);
        upLabel.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        upLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel gridPa = new JPanel();
        gridPa.setBackground(Color.blue);
        gridPa.setOpaque(true);


        gridPa.setLayout(new GridLayout(3, 3, 2, 2));
        for (int i = 0; i < 9; i++) {
            gridPa.add(new JButton(String.valueOf(i + 1)));
        }


        this.add(gridPa, BorderLayout.CENTER);
        this.add(upLabel, BorderLayout.NORTH);
        this.add(mainPanel);

    }

    public static void main(String[] args) {
        new testLabel().setVisible(true);
    }
}
