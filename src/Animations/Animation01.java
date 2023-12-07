package Animations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Animation01 extends JFrame {
    public Animation01() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Canvas());
        this.pack(); // nastavi sirku a vyzku dle komponent
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Animation01().setVisible(true);
    }

}

class Canvas extends JPanel implements ActionListener {
    final int WIDTH = 500;
    final int HEIGHT = 500;
    Image bouncingImage, backgroundImage;
    Timer timer;
    int x = 0;
    int y = 0;
    int xVelocity = 2;
    int yVelocity = 1;

    Canvas() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.red);
        bouncingImage = new ImageIcon("sadEmoji.png").getImage();
        backgroundImage = new ImageIcon("img.png").getImage();
        timer = new Timer(1, this);
        timer.start();

    }

    public void paint(Graphics g) {
        super.paint(g); //nakresli pozadi a vlozi ho tam
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(backgroundImage, 0,0, null);
        g2d.drawImage(bouncingImage, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= this.getWidth() - bouncingImage.getWidth(null) || x < 0) {
            xVelocity *= -1;
        }
        x += xVelocity;

        if (y >= this.getHeight() - bouncingImage.getHeight(null) || y < 0) {
            yVelocity *= -1;
        }
        y += yVelocity;
        repaint();
    }
}

