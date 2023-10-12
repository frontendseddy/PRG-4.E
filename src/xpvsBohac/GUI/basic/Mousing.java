package xpvsBohac.GUI.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mousing extends JFrame implements MouseListener {
    JLabel label;
    public Mousing() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.ORANGE);
        label.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        label.setOpaque(true);
        label.setBounds(0,this.getHeight()/2,this.getWidth(), this.getHeight()/2);
        this.add(label);
        label.addMouseListener(this);
    }

    public static void main(String[] args) {
        new Mousing().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        label.setBackground(Color.blue);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.PINK);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.pink);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.ORANGE);
    }
}
