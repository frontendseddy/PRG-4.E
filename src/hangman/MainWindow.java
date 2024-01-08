package hangman;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    JSlider difficultySlider;
    JLabel difficultyLabel;
    JPanel sliderPanel;


    public MainWindow() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(480, 240);
        JButton startButton = new JButton("Start");
        this.setLayout(new GridLayout(1,2));
        sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridLayout(2,1));


        JSlider difficultySlider = new JSlider(1, 5, 3);
        this.add(sliderPanel);
        this.add(startButton);

        difficultyLabel = new JLabel("TMP");
        sliderPanel.add(difficultySlider);
        sliderPanel.add(difficultyLabel);

        difficultyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        difficultyLabel.setVerticalAlignment(SwingConstants.CENTER);
        difficultyLabel.setFont(new Font("Arial", Font.BOLD, 30));
        sliderPanel.add(difficultySlider);

        difficultySlider.setPaintTicks(true);
        difficultySlider.setMinorTickSpacing(1);
        difficultySlider.setPaintTrack(true);
        difficultySlider.setMajorTickSpacing(2);
        difficultySlider.setPaintLabels(true);

        difficultySlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("moved");
                difficultyLabel.setText("difficulty: " + difficultySlider.getValue());

            }
        });

        difficultyLabel.setText("difficulty: " + difficultySlider.getValue());


        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameWindow(42).setVisible(true);
            }
        });

        this.add(startButton);
    }

    public static void main(String[] args) {
        new MainWindow().setVisible(true);
    }
}
