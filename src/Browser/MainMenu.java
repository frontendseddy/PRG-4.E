package Browser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainMenu extends JFrame implements ActionListener {

    /**
     * Staticka promenna, budeme s ni pracovat i v jinych tridach
     */
    static List<Person> personData = new ArrayList<>();

    JButton tableView, dataView, dataLoad;
    JLabel status;

    public MainMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());

        tableView = new JButton("Table");
        dataView = new JButton("Data");

        dataView.setEnabled(false); // nejsou zadna data k zobrazeni
        tableView.setEnabled(false);

        status = new JLabel("There are no data loaded!");
        status.setFont(new Font("MV Boli", Font.BOLD, 21));

        dataLoad = new JButton("Load persons");
        dataLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    List<String> data = Files.readAllLines(Paths.get("persons_x4.txt"));

                    for (String line : data) {
                        String[] att = line.split(";");
                        personData.add(new Person(att[0], att[1], Integer.parseInt(att[2]), Integer.parseInt(att[3]), att[4]));
                    }
                } catch (IOException ioException) {
                    System.err.println(":(");
                }

                // TODO: Vymyslet obsah
                status.setText(personData.size() + " records loaded! You can now view the dataset!");
                tableView.setEnabled(true);
                dataView.setEnabled(true);
                dataLoad.setEnabled(false);
                pack();
            }
        });

        tableView.addActionListener(this);
        dataView.addActionListener(this);

        this.add(dataLoad);
        this.add(status);
        this.add(tableView);
        this.add(dataView);
        this.pack();
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacDarkLaf");
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        System.out.println(UIManager.getSystemLookAndFeelClassName());
//        MainMenu.personData.add(new Person("Larry", "Hydinger", 46, 225228, "icon.png"));
        MainMenu loader = new MainMenu();
        loader.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tableView)
            new TableMenu().setVisible(true);
        if (e.getSource() == dataView)
            new CardMenu().setVisible(true);
    }
}
