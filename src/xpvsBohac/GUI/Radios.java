package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Radios extends JFrame {
    public Radios() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JRadioButton mc = new JRadioButton("McDonald's");
        JRadioButton kfc = new JRadioButton("Kentucky Fried Chicken");
        JRadioButton bk = new JRadioButton("Burger King");

        ButtonGroup group = new ButtonGroup();
        ArrayList<JRadioButton> buttons = new ArrayList<>(); //musime kdzy chceme rict jaky z buttonu je selected (musime to pridat do listu)

        group.add(mc);
        group.add(kfc);
        group.add(bk);

        buttons.add(mc);
        buttons.add(kfc);
        buttons.add(bk);

        this.add(mc);
        this.add(kfc);
//        kfc.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Selected: " + kfc.getText());
//            }
//        });
        this.add(bk);
        JButton button = new JButton("Print choice");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JRadioButton tempButtno : buttons){
                    if (tempButtno.isSelected()) {
                        System.out.println("Selected " + tempButtno.getText());
                    }
                }
            }
        });
        this.add(button);
        this.pack();
    }

    public static void main(String[] args) {
        new Radios().setVisible(true);
    }
}
