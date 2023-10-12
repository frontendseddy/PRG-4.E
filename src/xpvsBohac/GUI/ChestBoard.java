package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class ChestBoard extends JFrame {
    final static int CHESS_DIMENSION = 3;
    public ChestBoard() {
        this.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3));
        this.setLocationRelativeTo(null);

        JLabel[][] labels = new JLabel[CHESS_DIMENSION][CHESS_DIMENSION];
        for (int i = 0; i < labels.length; i++) {
            for (int j = 0; j < labels[i].length; j++) {
                labels[i][j] = new JLabel(" ");
                labels[i][j].setOpaque(true);
                labels[i][j].setBackground(Color.GREEN);
                labels[i][j].setVerticalTextPosition(SwingConstants.CENTER);
                labels[i][j].setHorizontalTextPosition(SwingConstants.CENTER);
                labels[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 2));
                this.add(labels[i][j]);
                if ((i+j) % 2 == 1 ){
                    labels[i][j].setBackground(Color.black);
                }else {
                    labels[i][j].setBackground(Color.WHITE);
                }

            }
        }
    }

    public static void main(String[] args) {
        new ChestBoard().setVisible(true);
    }
}
