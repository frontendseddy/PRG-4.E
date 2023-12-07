package hangman;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    JLabel label;
    JPanel panel1, panel2, panel3;
    JProgressBar progressBar;
    JButton submitButton;
    JTextField inputField;

    public GameWindow() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 700);
        init();
    }

    public static void main(String[] args) {
        new GameWindow().setVisible(true);
    }

    void init() {
        this.setLayout(new BorderLayout());
        /*panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel3 = new JPanel();
        panel3.setBackground(Color.green);
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.EAST);*/
        progressBar = new JProgressBar(0, 10);
        progressBar.setValue(10);
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);
        progressBar.setPreferredSize(new Dimension(500, 100));
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Arial", Font.BOLD, 36));
//        progressBar.setValue(5);
        JPanel tmpPanel = new JPanel();
        tmpPanel.setBackground(Color.pink);

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(Color.MAGENTA);
        inputPanel.setPreferredSize(new Dimension(500, 250));

        //input text
        inputField = new JTextField("TMP");
        inputField.setFont(new Font("Arial", Font.BOLD, 32));

        //button setting
        submitButton = new JButton("Guess");
        submitButton.setFont(new Font("Arial", Font.BOLD, 32));

        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(inputField);
        inputPanel.add(submitButton);


        this.add(inputPanel, BorderLayout.SOUTH);
        this.add(tmpPanel, BorderLayout.CENTER);
        this.add(progressBar, BorderLayout.NORTH);

    }
}
