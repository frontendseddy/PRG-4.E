package Animations;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawingPanel extends JPanel {
    private long startTime = System.currentTimeMillis();

    public DrawingPanel() {
        this.setPreferredSize(new Dimension(1280, 720));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //panel se prida do okna

        Graphics2D g2D = (Graphics2D) g;
        final int GRASS_SIZE = 30;
        g2D.setColor(new Color(50, 38, 30));
        g2D.fillRect(0, this.getHeight() - GRASS_SIZE, this.getWidth(), GRASS_SIZE);
        g2D.translate(0, getHeight() - GRASS_SIZE);
        drawTractor(g2D);

    }

    private void drawTractor(Graphics2D g2D) {
        //kola
        final double R1 = 150;
        final double R2 = 100;
        final double D = 350;

        //kabina
        final double L = 20;
        final double W = 300;
        final double H = 400;

        //motor
        final double MW = 400;
        final double MH = 200;

        //zacatek
        double U = R2 / 2;

        long currTime = System.currentTimeMillis();
        long elapsed = currTime - startTime;
        g2D.translate(elapsed/10.0, 0);

        g2D.setColor(new Color(119, 179, 221));
        g2D.fill(new Rectangle2D.Double(L, -U - H, W, H));
        g2D.fill(new Rectangle2D.Double(L + W, -U - MH, MW, MH));
        drawWheels(R1, R2, D, g2D);

    }

    private void drawWheels(double R1, double R2, double D, Graphics2D g2D) {
        g2D.translate(R1, -R1);
        drawWheel(R1, g2D);

        g2D.translate(D, R1 - R2);
        drawWheel(R2, g2D);

    }

    private void drawWheel(double R, Graphics2D g2D) {
        double rDisk = 0.8 * R; //polomer disku
        final double rLev = 20; //polomer ouuuujeeee
        final double rWh = 5;
        final double dil = 45;

        g2D.setColor(Color.black);
        g2D.fill(new Ellipse2D.Double(-R, -R, 2 * R, 2 * R));

        g2D.setColor(new Color(138, 48, 37));
        g2D.fill(new Ellipse2D.Double(-rDisk, -rDisk, 2 * rDisk, 2 * rDisk));

        g2D.setColor(Color.orange);
        g2D.fill(new Ellipse2D.Double(-rLev, -rLev, 2 * rLev, 2 * rLev));

        AffineTransform oldTr = g2D.getTransform();
        long currTime = System.currentTimeMillis();
        long elapsed = currTime - startTime;

        //otacky za sekundu
        final double RotateSec = Math.PI;

        g2D.rotate(Math.toRadians(45) + RotateSec * elapsed / 1000.0);

        for (int i = 0; i < 4; i++) {
            g2D.translate(dil, 0);
            g2D.fill(new Ellipse2D.Double(-rWh, -rWh, 2 * rWh, 2 * rWh));
            g2D.translate(-dil, 0);
            g2D.rotate(Math.toRadians(90));
        }
        g2D.setTransform(oldTr);
    }
}
