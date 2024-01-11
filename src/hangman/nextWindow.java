package hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class nextWindow extends JFrame{
    TextField textField;
    JRadioButton one, two, three, four, five;
    JButton correctBTN;
    PrintWriter pw;
    public nextWindow() throws IOException{

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 100);
        this.setLayout(new GridLayout(1,3));

        textField = new TextField("tmp");
        textField.setFont(new Font("Consolas", Font.PLAIN, 20));
//        textField.setPreferredSize(new Dimension(1000,100));
        textField.setForeground(Color.black);


        one = new JRadioButton();
        two = new JRadioButton();
        three = new JRadioButton();
        four = new JRadioButton();
        five = new JRadioButton();

        ButtonGroup group = new ButtonGroup();
        ArrayList<JRadioButton> buttons = new ArrayList<>();

        group.add(one);
        group.add(two);
        group.add(three);
        group.add(four);
        group.add(five);

        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);

        correctBTN = new JButton("OK");

        correctBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("secrets.txt"), true)));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                for (JRadioButton button:buttons) {
                    // TODO: 11.01.2024 predelat to na klasicky for aby to fungovalo 
                    if (button.isSelected()) {
                        switch (button.getName()) {
                            case "one":
                                pw.append("1;").append(textField.getText()).toString();
                                break;
                            case "two":
                                pw.append("2;").append(textField.getText()).toString();
                                break;
                            case "three":
                                pw.append("3;").append(textField.getText()).toString();
                                break;
                            case "four":
                                pw.append("4;").append(textField.getText()).toString();
                                break;
                            case "five":
                                pw.append("5;").append(textField.getText()).toString();
                                break;
                        }
                    }
                    pw.close();
                }
            }
        });


        this.add(textField);
        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(correctBTN);

    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacDarkLaf");
        try {
            new nextWindow().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
