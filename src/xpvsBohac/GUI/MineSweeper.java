package xpvsBohac.GUI;

import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MineSweeper extends JFrame {
    final int DIM = 10;

    public MineSweeper() {
        this.setSize(720,720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel infoPanel = new JPanel();
        JPanel playingArea = new JPanel();

        infoPanel.setBackground(Color.red);
        playingArea.setBackground(Color.blue);

        //--Info Panel--//
        JLabel scoreLabel = new JLabel("SCORE: TBD");
        infoPanel.setBackground(new Color(0xf47756));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setVerticalAlignment(SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Consolas", Font.PLAIN, 18));

        JButton revealButton = new JButton("FINISH");
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setVerticalAlignment(SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
        infoPanel.setLayout(new GridLayout(1,2));

        this.setLayout(new BorderLayout());
        infoPanel.add(scoreLabel);
        infoPanel.add(revealButton);

        //--SWEEP AREA--//
        playingArea.setLayout(new GridLayout(DIM, DIM, 1, 1));
        for (int i = 0; i < DIM*DIM; i++) {
            // TODO: 16.11.2023 doplnit hezka tlacitka
            PossibleBOMB button = new PossibleBOMB("?");
            playingArea.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setEnabled(false);
                }
            });
        }

        this.add(infoPanel, BorderLayout.NORTH);
        this.add(playingArea, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new MineSweeper().setVisible(true);
    }
}

class PossibleBOMB extends JButton {
    int scoreValue;
    PossibleBOMB(String text){
        this.setText(text);
        this.setOpaque(true);
        this.setBackground(new Color(0xdffe00));
        this.setHorizontalAlignment(CENTER);
        this.setFont(new Font("Consolas", Font.BOLD, 22));
        this.setFocusable(false);
        Random random = new Random();
        scoreValue = random.nextInt(-110, 110);
    }
}
