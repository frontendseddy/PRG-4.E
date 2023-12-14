package Animations;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class BasicDrawing extends JFrame {
    public BasicDrawing() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Animations");
        DrawingPanel dp = new DrawingPanel();
        dp.setBackground(Color.green);


        this.add(dp);
        this.pack();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                dp.repaint();
            }
        }, 0, 20);
    }

    public static void main(String[] args) {
        new BasicDrawing().setVisible(true);
    }
}
