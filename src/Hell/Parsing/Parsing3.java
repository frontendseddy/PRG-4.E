package Hell.Parsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parsing3 {



    public static void main(String[] args) throws IOException {

        String start = "(";
        String end = ")";

        int numberOfBracketsToValidate = 2;
        int lastIndex = 0;
        int length;

        BufferedReader br = new BufferedReader(new FileReader("src\\Parsing\\Soubory\\Single\\L3.txt"));

        String textToParse = "";
        String tmp;


        while ((tmp = br.readLine()) != null) {
            textToParse = textToParse + tmp + " ";
        }
        length = textToParse.length();


        System.out.println(textToParse);

            for (int i = textToParse.indexOf(start)+1; i < length; i++) {
                //System.out.println(cisteA.charAt(i));
                if(String.valueOf(textToParse.charAt(i)).equals(end)&&numberOfBracketsToValidate==1){
                   lastIndex=i+1;
                } else if (String.valueOf(textToParse.charAt(i)).equals(start)&&numberOfBracketsToValidate==1) {
                    numberOfBracketsToValidate = 2;
                    textToParse = textToParse.replace(textToParse.substring(textToParse.indexOf(start),lastIndex),"");
                    i=textToParse.indexOf(start)+1;
                    length = textToParse.length();
                } else if (String.valueOf(textToParse.charAt(i)).equals(end)){
                    numberOfBracketsToValidate--;
                    lastIndex = i+1;
                } else if (String.valueOf(textToParse.charAt(i)).equals(start)) {
                    numberOfBracketsToValidate++;
                }
            }
        textToParse = textToParse.replace(textToParse.substring(textToParse.indexOf(start),lastIndex),"");
        System.out.println(textToParse);




    }
}
