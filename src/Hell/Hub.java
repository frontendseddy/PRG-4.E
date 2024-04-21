package Hell;

import GUI.GUIComponents;
import Interface.Computers;
import Parsing.Parsing4;
import Exception.myNewException;
import PraceSeSoubory.filePractice2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Hub extends JFrame {
    public Hub() {
        //TODO: Přepsat na to co je potřeba
        //Proměnné
        String ukol1 = "PARSING";
        String ukol2 = "INTERFACE";
        String ukol3 = "EXCEPTION";
        String ukol4 = "SOUBORY";
        String ukol5 = "GUI";
        ImageIcon icon = new ImageIcon("resources\\icon.jpg");

        //Komponenty
        JButton btn1 = new JButton(ukol1);
        JButton btn2 = new JButton(ukol2);
        JButton btn3 = new JButton(ukol3);
        JButton btn4 = new JButton(ukol4);
        JButton btn5 = new JButton(ukol5);

        JPanel panelTop = new JPanel();
        JPanel panelBottom = new JPanel();

        JLabel label = new JLabel("HUB");

        //Stylování hlavního okna
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1));
        this.setSize(new Dimension(800,400));
        this.setTitle("Praktická PRG 2024");
        this.setIconImage(icon.getImage());
        this.setLocationRelativeTo(null);

        //Stylování komponent
        panelTop.setLayout(new BorderLayout());
        panelTop.setPreferredSize(new Dimension(800,200));
        panelTop.setBackground(new Color(0xf7f7f7));

        panelBottom.setLayout(new FlowLayout());
        panelBottom.setPreferredSize(new Dimension(800,200));
        panelBottom.setBackground(Color.ORANGE);
        panelBottom.setBackground(new Color(0xf7f7f7));

        label.setFont(new Font("Helvetica",Font.BOLD,30));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        btn1.setFocusable(false);
        btn1.setPreferredSize(new Dimension(150,100));
        btn1.setBackground(new Color(0x738500));
        btn1.setForeground(new Color(0xffffff));

        btn2.setFocusable(false);
        btn2.setPreferredSize(new Dimension(150,100));
        btn2.setBackground(new Color(0xD19700));
        btn2.setForeground(new Color(0xffffff));

        btn3.setFocusable(false);
        btn3.setPreferredSize(new Dimension(150,100));
        btn3.setBackground(new Color(0xC16B00));
        btn3.setForeground(new Color(0xffffff));


        btn4.setFocusable(false);
        btn4.setPreferredSize(new Dimension(150,100));
        btn4.setBackground(new Color(0x8C0303));
        btn4.setForeground(new Color(0xffffff));

        btn5.setFocusable(false);
        btn5.setPreferredSize(new Dimension(150,100));
        btn5.setBackground(new Color(0x81002D));
        btn5.setForeground(new Color(0xffffff));

        //Akce na tlačítkách
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Parsing4().init();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Computers();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new myNewException().run();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new filePractice2();
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUIComponents().setVisible(true);
            }
        });


        //Přidávání komponent
        this.add(panelTop);
        this.add(panelBottom);

        panelTop.add(label, BorderLayout.CENTER);
        panelBottom.add(btn1);
        panelBottom.add(btn2);
        panelBottom.add(btn3);
        panelBottom.add(btn4);
        panelBottom.add(btn5);

    }

    public static void main(String[] args) {
        new Hub().setVisible(true);
    }

}
