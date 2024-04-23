package Practice;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Recap {

    static void tree1(File file) {
        //projeti celeho adresare
        //obsah
        if (file.isFile()){
            System.out.println("Soubor: " + file.getName());
        } else {
            File[] files = file.listFiles();
            System.out.println("Je to slozka");
            System.out.println("D: " + file.getName());
            for (File f : files){
                tree1(f);
            }

        }
    }
    //tenhle je dle meho nazoru lepsi
    static void tree2(File f) {
        File[] contents = f.listFiles();
        for (File file : contents) {
            if (file.isFile()) {
                System.out.println("Soubor: " + file.getName());
            } else {
                System.out.println("slozka: " + file.getName());
                tree2(file);
            }
        }
    }


    static void printDirectory(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File tmp : files) {
                if (tmp.isFile()) {
                    System.out.println("Soubor: " + tmp.getName());
                } else {
                    System.out.println("Adresar: " + tmp.getName());
                }
            }
        } else {
            System.out.println("Neni adresar");
        }
    }

    static void fileSize(File file) {
        System.out.println(file.length() + " + B");
        System.out.println(file.length() / 1024 + " + kB");
        System.out.println(file.length() / 1024 / 1024 + " + MB");
    }

    public static void main(String[] args) {
        File f = new File("src");
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println("je soubor: " + f.isFile());
        System.out.println("je adresar: " + f.isDirectory());
        System.out.println("Obsah slozky: " + Arrays.toString(f.listFiles()));
//        tree1(new File("Movies.txt"));
        //umet listovat,

        String[] type = f.getName().split("\\.");
        System.out.println("Typ souboru:" + type[type.length - 1]);

        if (f.isFile()) {
            System.out.println("Jedna se o soubor");
        } else {
            System.out.println("Jedna se o slozku");
        }

        fileSize(f);

        File vypis = new File("src");
        System.out.println("---output---");
        tree2(vypis);

    }
}
