package Tests;

import javax.swing.*;
import java.util.Scanner;

public class Threads {
    static String PSWD = "heslo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i > 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread1 = new Thread(thread);
        thread1.setDaemon(true);
        thread1.start();

        String input = JOptionPane.showInputDialog("Zadej heslo: ");
        while (!input.equals(PSWD)){
            input = sc.nextLine();
        }
        System.out.println("Sikula");
//        thread1.interrupt();
        System.exit(0);



    }
}
