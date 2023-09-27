package xpvsBohac.vyjimky.testy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Odkomentovat vse v metode main().
 * Pravidla jednoducha:
 * 1. Do metody main() nesmi byt vlozen zadny try-catch blok
 * 2. zadna metoda nesmi mit v halvicce throws,
 * 3. kod nesmite mazat/modifikovat, pouze pridavat try-catch bloky (s vhodnym kodem v catch)
 *  AD 3: Ne, neni povolena catch(Exception ...), don't you even try it
 *  AD 3#2: Ne, ani v adresari si nemuzete vytvaret nove soubory
 */
public class Exceptional {

    static int saharaSandCounter(int countdown){
        if (countdown  > Integer.MAX_VALUE - 42)
            return 42; //yeey, you counted them all, sadly, this answer is one above all
        System.out.println("Speck of sand #" + countdown);
        return saharaSandCounter(countdown + 1);
    }
    static void subSaharaCounter(){
        System.out.println("Amount of sand in sahara counted as specks starting from 0:");
        try {
            System.out.println(saharaSandCounter(0));
        }catch (StackOverflowError stackOverflowError){
            System.out.println("nope StakOverflow\n");
        }

    }

    /**
     * zde nutne odkomentovat
     */
    static void readMeIfYouCan(String path) {
        System.out.println("Reading file " + path + "...");
        try {
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }
            }catch (FileNotFoundException fileNotFoundException) {
                System.out.println("nope FileNotFound");
            }
        }catch (IOException ioException){
            System.out.println("IOEXCEPTION UPS\n");
        }


    }

    static void twoAtOnceWinkWink(String name, int index){
        String[] names = {"Karel", "Karel1", "Karel2", "Karel3", "Karel4"};
        System.out.println("Controlling whether or not our very original name database contains you... ");
        try {
            try {
                if (name.matches(names[index])){
                    System.out.println("Found ya!");
                }
            }catch (NullPointerException nullPointerException){
                System.out.println("nemuze byt null");
            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("index zde neni");
        }
        System.out.println("happy twoAtOnceWinkWink \n");


    }

    static void mathGenius(String number){
        System.out.println("Hopefully you gave a good number or this is going tits up");
        try {
            try {
                int mathematikMachtFrei = 42 / Integer.parseInt(number);
                System.out.println(mathematikMachtFrei);
            }catch (ArithmeticException arithmeticException ){
                System.out.println("nesmis delit nulou");
            }
        }catch (NumberFormatException numberFormatException){
            System.out.println("NONO");
        }
        System.out.println("Yep...it did\n");
    }

    static void mathGenius(int number){
        System.out.println("Hopefully you gave a good number or this is going tits up");
        try {
            int mathematikMachtFrei = 42 / number;
            System.out.println(mathematikMachtFrei);
        }catch (ArithmeticException arithmeticException){
            System.out.println("nesmis delit nulou");
        }
        System.out.println("Yep...it did\n");
    }

    static void wellWhyNot(){
        System.out.println("Parry this you filthy casual");
        try {
            throw new RuntimeException();
        }catch (RuntimeException runtimeException){
            System.out.println("nope RunTimeE\n");
        }

    }

    static void poopingTheStack(){
        try {
            Stack<Integer> stack = new Stack<>();
            System.out.println(stack.pop());
        }catch (EmptyStackException emptyStackException){
            System.out.println("stack is empty");
        }
        System.out.println("And the stack to be popped from empty stack is...\n");

    }

    public static void main(String[] args) {
          mathGenius(0);
          mathGenius("0");
        mathGenius("cTyRiceTDva, to urcite vyjde Jedna");

        readMeIfYouCan("neverGonnaGiveYouUp.RickRoll");

        wellWhyNot();

        poopingTheStack();

        twoAtOnceWinkWink(null, 2);
        twoAtOnceWinkWink("Karel3", 42);
//
        System.out.println("Counting down...");
        subSaharaCounter();

        System.out.println("Nothing works, everything is fucked, therefore...");
        System.out.println("Happy ending!");
    }
}