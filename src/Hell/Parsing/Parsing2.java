package Hell.Parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parsing2 {
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

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Parsing\\Soubory\\Single\\L3.txt"));
            String line;
            String a = "";
            String text;

            while ((text = br.readLine()) != null){
                a = a+text+" ";
            }
            System.out.println(a);
            


            while ((line = br.readLine()) != null){
                line = line+separator;

                for (int i = 0; i < line.length(); i++) {
                    String current = String.valueOf(line.charAt(i));
                    //System.out.println(current);
                    if (current.equals(start)){
                        inBrackets++;
                    }else if (current.equals(end)){
                        inBrackets--;
                    }

                    if (inBrackets<0){
                        inBrackets=0;
                    }
                    //System.out.println(inBrackets);
                    if (inBrackets>0){
                        //System.out.println("3");
                    } else {

                        if (current.equals(" ")&&!((pomocne.equals(" "))||pomocne.equals(""))){
                            pole.add(pomocne);
                            pomocne = "";
                            //System.out.println("1");
                        } else if (!(current.equals(start)||current.equals(end)||current.equals(" "))) {
                            pomocne = pomocne+current;
                            //System.out.println("2");
                        }

                    }

                }

            }
            br.close();
            //System.out.println(pole.size());
            for (int i = 0; i < pole.size(); i++) {
                System.out.println(pole.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
