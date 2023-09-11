package xpvsBohac.vyjimky;

import java.io.*;
import java.nio.Buffer;

public class ExceptionPractice {

    static void method() throws Exception {
        throw new Exception();
    }

    static void readFile(String filePath) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("soubor.txt")));
        method();
    }
    public static void main(String[] args) throws IOException {
        String sh = "nenicislo";
        readFile(":(");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("soubor")));
            int num = Integer.parseInt(sh);
            throw new ArrayIndexOutOfBoundsException();
        }catch (NumberFormatException n) {
            System.out.println("neni cislo...a");
        }catch (IOException e) {
            System.out.println("IO");
        }catch (FileNotFoundException fe) {
            System.out.println("nenajde soubor");
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println("happy ending");
    }
}
