package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {
    JProgressBar bar;
    public ProgressBar() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(470, 500);
        this.setLayout(null); // mohu vkladat podle xy souradnic

        bar = new JProgressBar(0, 500);
        bar.setBounds(15,0,420,50);
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setFont(new Font("Arial", Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        this.add(bar);
    }

    public static void main(String[] args) {
        ProgressBar progressBar = new ProgressBar();
        progressBar.setVisible(true);
        progressBar.fill();
    }

    void fill() {
        int counter = 0;
        while(counter <= bar.getMaximum()) {
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 10;
            System.out.println(bar.getValue());
        }
        bar.setString("Finished!!");
    }
}
