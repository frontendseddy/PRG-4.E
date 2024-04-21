package Hell.Parsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parsing {
    public static void main(String[] args) {
        //Pole kam se ulozi vyparsovane hodnoty
        ArrayList<String> pole = new ArrayList<>();
        //Pole které drží vyparsované objekty

        //počáteční znak komentáře
        String start = "(";
        //konečný znak komentáře
        String end = ")";
        //oddelovač hodnot
        String separator = " ";
        boolean isEnd = false;
        int pocetAtrObj = 2;

        //kolikrát je vnořeno
        int inBrackets = 0;

        // pomocná pro ukládání čísel pomocí Stringu v celku
        String pomocne = "";


        //Scanner
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src\\Parsing\\Soubory\\Single\\L1.txt"));
            System.out.println("OK");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            //pokud nalezne počáteční závorku připočítá 1 k in brackets a tak určí jestli jsme v závorce
            if (line.equals(start)) {
                inBrackets++;
            }
            //pokud nalezne konečnou závorku odečte 1 k in brackets a tak určí jestli jsme v závorce
            else if (line.equals(end)) {
                inBrackets--;

            }


            //pokud jsme v závorce tak nic
            if (inBrackets > 0) {
            } else {
                if (((line).equals(separator)) && (!(pomocne.equals("")))) {
                    pole.add(pomocne);

                } else if (isEnd) {
                } else {
                    pomocne = pomocne + line;
                }

            }
        }
           /* int pocetObj = (pole.size())/pocetAtrObj;
            for (int i = 0; i < pocetObj; i=i+2) {
                //TODO: Udělat třídu čtverec s int parametrama width a height a dodělat zapsání vyparsovaných atributů a pak přidat do pole
                new Ctverec(Integer.parseInt(pole.get(i)),Integer.parseInt(pole.get(i+1)));


            }

            //file = file + sc.nextLine();
            //System.out.println(sc.nextLine());
        }*/
        //sc.useLocale(Locale.US);

        sc.close();
    }

}
