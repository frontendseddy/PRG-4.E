package Practice;

import xpvsBohac.GUI.Paneling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyHub extends JFrame implements ActionListener {
    JLabel hublabel;
    JPanel multiplePanel;
    JButton ex1, ex2, ex3, ex4, ex5;
    public MyHub() {
        this.setLayout(new GridLayout(2,1));
        this.setSize(700,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        design();

        hublabel = new JLabel();
        hublabel.setText("Maturita Hub");
        hublabel.setHorizontalAlignment(SwingConstants.CENTER);
        hublabel.setFont(new Font("Arial", Font.BOLD, 40));
        hublabel.setOpaque(true);
        this.add(hublabel);

        multiplePanel = new JPanel();
        multiplePanel.setLayout(new GridLayout(1,5));
//        multiplePanel.setBackground(Color.red);
        multiplePanel.setOpaque(true);
        this.add(multiplePanel);

        ex1 = new JButton("Parsing");
//        ex1.setBackground(Color.red);
        ex1.setOpaque(true);
        ex1.addActionListener(this);
        ex1.setFocusable(false);

        ex2 = new JButton("Interface");
//        ex2.setBackground(Color.magenta);
        ex2.setOpaque(true);
        ex2.addActionListener(this);

        ex3 = new JButton("Exception");
//        ex3.setBackground(Color.green);
        ex3.setOpaque(true);
        ex3.addActionListener(this);

        ex4 = new JButton("Files");
//        ex4.setBackground(Color.blue);
        ex4.setOpaque(true);
        ex4.addActionListener(this);

        ex5 = new JButton("GUI");
//        ex5.setBackground(Color.orange);
        ex5.setOpaque(true);
        ex5.addActionListener(this);

        multiplePanel.add(ex1);
        multiplePanel.add(ex2);
        multiplePanel.add(ex3);
        multiplePanel.add(ex4);
        multiplePanel.add(ex5);


    }


    public static void main(String[] args) {
        new MyHub().setVisible(true);


    }

    public void design() {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacDarkLaf");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ex1){
            System.out.println(ex1.getText() + " byl spuštěn!");
            new test().run();

        }
        if (e.getSource() == ex2){
            System.out.println(ex2.getText() + " byl spuštěn!");
            new Computers().run();

        }
        if (e.getSource() == ex3){
            System.out.println(ex3.getText() + " nema nic ke spusteni");

        }
        if (e.getSource() == ex4){
            System.out.println(ex4.getText() + " nema nic ke spusteni");


        }
        if (e.getSource() == ex5){
            System.out.println(ex5.getText() + " byl spuštěn!");
            new Paneling().setVisible(true);
        }
    }
}
