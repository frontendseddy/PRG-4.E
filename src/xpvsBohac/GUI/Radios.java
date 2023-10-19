package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class Radios extends JFrame {
    Radios() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JRadioButton mc = new JRadioButton("McDonald's");
        JRadioButton kfc = new JRadioButton("Kentucky Fried Chicken");
        JRadioButton bk = new JRadioButton("Burger King");

        ButtonGroup group = new ButtonGroup();

        group.add(mc);
        group.add(kfc);
        group.add(bk);

        this.add(mc);
        this.add(kfc);
        this.add(bk);
        this.pack();
    }

    public static void main(String[] args) {
        new Radios().setVisible(true);
    }
}
