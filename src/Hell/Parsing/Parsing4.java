package Hell.Parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parsing4 {
    public void init() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Point> point = new ArrayList<>();
        //TODO: info k přepsání: Počáteční znak, ukončovací znak, oddělovač, počet atributů které má třída (výška, šířka = 2), cesta k souboru
        String start = "Z";
        String end = "K";
        String separator = " ";
        int numberOfAttributesInClass = 3;
        String file = "src\\Parsing\\Soubory\\Point\\L3.txt";


        int startLength = start.length();
        int endLength = end.length();
        boolean isStartBracket = false;
        boolean isEndBracket = false;
        String pom = "";

        int numberOfBracketsToValidate = 2;
        int lastIndex = 0;
        int length;

        BufferedReader br = new BufferedReader(new FileReader(file));

        String textToParse = "";
        String tmp;

        //Vezme všechny řádky souboru a uloží je do proměnné textToParse
        while ((tmp = br.readLine()) != null) {
            textToParse = textToParse + tmp + " ";
        }
        length = textToParse.length();


        System.out.println(textToParse);

        //Odstranění závorek
        for (int i = textToParse.indexOf(String.valueOf(start.charAt(0))); i < length - 1; i++) {
            isStartBracket = false;
            isEndBracket = false;
            if (String.valueOf(textToParse.charAt(i)).equals(String.valueOf(start.charAt(0)))) {
                for (int j = i; j < i + startLength; j++) {
                    pom = pom + textToParse.charAt(j);

                }
                if (pom.equals(start) && (textToParse.indexOf(start)) != i) {
                    isStartBracket = true;
                }
                pom = "";
            } else if (String.valueOf(textToParse.charAt(i)).equals(String.valueOf(end.charAt(0)))) {
                for (int j = i - 1; j < i - 1 + startLength; j++) {
                    pom = pom + textToParse.charAt(j + 1);
                }
                if (pom.equals(end)) {
                    isEndBracket = true;
                }
                pom = "";
            }
            if (isEndBracket && numberOfBracketsToValidate == 1) {
                lastIndex = i + endLength;
            } else if (isStartBracket && numberOfBracketsToValidate == 1) {
                numberOfBracketsToValidate = 2;
                textToParse = textToParse.replace(textToParse.substring(textToParse.indexOf(start), lastIndex), "");
                i = textToParse.indexOf(start) + 2;
                length = textToParse.length();
            } else if (isEndBracket) {
                numberOfBracketsToValidate--;
                lastIndex = i + endLength;
            } else if (isStartBracket) {
                numberOfBracketsToValidate++;
            }
        }
        textToParse = textToParse.replace(textToParse.substring(textToParse.indexOf(start), lastIndex), "");
        System.out.println(textToParse);

        //Pokud obsahuje tabulátor tak se vypustí
        while (textToParse.contains("\t")) {
            textToParse = textToParse.replace("\t", " ");
        }

        String save = "";
        for (int i = 0; i < textToParse.length(); i++) {

            if (String.valueOf(textToParse.charAt(i)).equals(separator) && !(save.equals(""))) {
                arrayList.add(save);
                save = "";
            } else if (!String.valueOf(textToParse.charAt(i)).equals(separator)) {
                save = save + textToParse.charAt(i);
            }
        }
        //jenom výpis arrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Ukládání objektů do arrayList
        for (int i = 0; i < (arrayList.size()); i = i + numberOfAttributesInClass) {
            //TODO: přepsat podle toho kolik a jaký jsou atributy u třídy do které parsujeme
            point.add(new Point(Integer.parseInt(arrayList.get(i)), Integer.parseInt(arrayList.get(i + 1)), Integer.parseInt(arrayList.get(i + 2))));
        }
        System.out.println("Velikost: " + point.size());
        for (int i = 0; i < point.size(); i++) {
            System.out.println("Point " + (i + 1) + ": " + point.get(i).x + " " + point.get(i).y + " " + point.get(i).z);
        }
    }
}

class Point {
    int x;
    int y;
    int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
