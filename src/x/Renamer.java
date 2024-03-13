package x;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;

public class Renamer extends JFrame {
    public static String filePath = "C:\\Users\\heha3\\Downloads\\Sirka";
    Renamer(){
        this.setSize(500,400 );
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,1));
        JTextField path = new JTextField();
        JButton button = new JButton("zmáčkni mě");
        JLabel jLabel = new JLabel("cesta: ");

        path.setPreferredSize(new Dimension(400,30));
        button.setPreferredSize(new Dimension(20,20));
        jLabel.setPreferredSize(new Dimension(200,50));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filePath = path.getText();
                jLabel.setText(filePath);
            }
        });
        this.add(path);
        this.add(button);
        this.add(jLabel);
    }

    public static void main(String[] args) {
        new Renamer().setVisible(true);
        File folder = new File("C:\\Users\\heha3\\Downloads\\Sirka");
        File[] listOfFiles = folder.listFiles();

        filePath = "";
        for (int i = 0; i < listOfFiles.length; i++) {
            int j = i+1;

            if (listOfFiles[i].isFile()) {
                listOfFiles[i].renameTo(new File("C:\\Users\\heha3\\Downloads\\Sirka\\"+j+".jpg"));

//                File f = new File("C:\\Users\\heha3\\Downloads\\Cherry\\"+listOfFiles[i].getName());
//
//                f.renameTo(new File("c:\\Projects\\sample\\"+i+".txt"));
            }
        }

        System.out.println("conversion is done");
    }
}
