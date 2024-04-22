package Practice;

import java.io.File;
import java.util.Arrays;

public class Recap {

    static void tree(File file) {
        //projeti celeho adresare
        //obsah
        if (file.isFile()){
            System.out.println("Soubor: " + file.getName());
        } else {
            File[] files = file.listFiles();
            System.out.println("Je to adresar");
            System.out.println("D: " + file.getName());
            for (File f : files){
                tree(f);
            }

        }
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
        tree(new File("Movies.txt"));
        //umet listovat,
    }
}
