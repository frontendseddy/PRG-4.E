package Hell.GUI;

import javax.lang.model.util.SimpleTypeVisitor14;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIComponents extends JFrame {
    public GUIComponents(){

        //Nastylování hlavního okna
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500,500));
        this.setLayout(new GridLayout(2,1));

        //Panely
        JPanel panelTop = new JPanel();
        JPanel panelBottom = new JPanel();
        JPanel radioPanel = new JPanel();
        JPanel jPanel = new JPanel();
        panelTop.setLayout(new GridLayout(3,2));
        panelBottom.setLayout(new BorderLayout());
        jPanel.setBackground(Color.ORANGE);
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 15));
        this.add(panelTop);
        this.add(panelBottom);

        //JButton
        JButton jButton = new JButton("JButton");
        jButton.setVisible(false);
        panelTop.add(jButton);

        //JRadioButtons
        JRadioButton man = new JRadioButton("man");
        JRadioButton woman = new JRadioButton("woman");
        JRadioButton other = new JRadioButton("other");
        ButtonGroup buttonGroup = new ButtonGroup();
        radioPanel.setLayout(new FlowLayout());
        man.setSelected(true);
        man.setActionCommand("man");
        woman.setActionCommand("woman");
        other.setActionCommand("other");
        buttonGroup.add(man);
        buttonGroup.add(woman);
        buttonGroup.add(other);
        panelTop.add(radioPanel);
        radioPanel.add(man);
        radioPanel.add(woman);
        radioPanel.add(other);

        //JTextField
        JTextField jTextField = new JTextField("Nemám názor!");
        panelTop.add(jTextField);

        //Přidání JPanelu na 4 místo
        panelTop.add(jPanel);

        //JLabel
        JLabel jLabel = new JLabel("JLabel");
        Font currentFont = new Font("Helvetica",Font.BOLD,30);
        Color currentColor = Color.BLUE;
        jLabel.setFont(currentFont);
        jLabel.setForeground(currentColor);
        panelTop.add(jLabel);

        //JCheckBox
        JCheckBox jCheckBox = new JCheckBox("Are you OK");
        panelTop.add(jCheckBox);
        jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox.isSelected()){
                    jButton.setVisible(true);
                }else {
                    jButton.setVisible(false);
                }
            }
        });

        //JSlider
        JSlider jSlider = new JSlider(1,10);
        jSlider.setMajorTickSpacing(1);
        jSlider.setPaintTicks(true);
        jSlider.setPaintLabels(true);
        panelBottom.add(jSlider,BorderLayout.CENTER);

        //JFrame na Alert
        JFrame jFrame = new JFrame();



        // Akce ProButton group
        man.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setEnabled(true);
                jTextField.setBackground(Color.cyan);
            }
        });
        woman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setEnabled(true);
                jTextField.setBackground(Color.pink);
            }
        });
        other.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setEnabled(false);
                jTextField.setBackground(Color.green);
            }
        });


        //Bordery https://docs.oracle.com/javase/8/docs/api/javax/swing/BorderFactory.html

        //Akce při kliknutí na tlačitko
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox.isSelected()){
                    System.out.println("check box zaškrtnutej. Jsi happy na "+ jSlider.getValue()+" /10.");
                }else {
                }
                if (jLabel.getFont().equals(currentFont)){
                    jLabel.setFont(new Font("Consolas",Font.BOLD,50));
                    jLabel.setForeground(Color.GREEN);

                }else{
                    jLabel.setFont(currentFont);
                    jLabel.setForeground(currentColor);
                }
                jLabel.setText(jTextField.getText());

                //RadioButtons select vyskakovací okno
                String selectedOption = buttonGroup.getSelection().getActionCommand();
                System.out.println(selectedOption);
                switch (selectedOption){
                    case "man":
                        JOptionPane.showMessageDialog(jFrame,"vybráno: "+buttonGroup.getSelection().getActionCommand());
                        break;
                    case "woman":
                        JOptionPane.showMessageDialog(jFrame,"vybráno: "+buttonGroup.getSelection().getActionCommand());
                        break;
                    case "other":
                        JOptionPane.showMessageDialog(jFrame,"vybráno: "+buttonGroup.getSelection().getActionCommand());
                        break;

                }
            }
        });



    }
}
