package xpvsBohac.GUI.basic;

import javax.swing.*;

public class Basic extends JFrame {

    public Basic(String name) {
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//        this.setName(name);
        this.setTitle(name);
//        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Basic("Nazev okna").setVisible(true);
    }
}
