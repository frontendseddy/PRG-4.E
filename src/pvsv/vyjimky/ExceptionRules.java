package pvsv.vyjimky;

import java.util.Scanner;

public class ExceptionRules {

    public static void main(String[] args) throws Exception {
        String[] param = userInput();
        try {
            Clovek c = new Clovek(Integer.parseInt(param[0]), Integer.parseInt(param[1]), Integer.parseInt(param[2]), param[3]);
            System.out.println("Clovek uspesne vytvoren");//vypsat, kdyz vse probehne bez chyb
            System.out.println(c.toString());
            System.out.println("Ukoncuji program");//vypsat v obou pripadech (musi byt ale vypsano jednou)
        } catch (HumanException e) {
            System.out.println("Nasatala chyba, ukoncuji program");//vypsat, kdyz chyba nastane
        }
    }

    static String[] userInput() {
        Scanner sc = new Scanner(System.in);
//            Scanner strSC = new Scanner(System.in);
        String vyska, vaha, vek;
        String jmeno;
        System.out.println("Zadejte vysku");
        vyska = sc.nextLine();
        System.out.println("Zadejte vahu");
        vaha = sc.nextLine();
        System.out.println("Zadejte vek");
        vek = sc.nextLine();
        System.out.println("Zadejte jmeno a prijmeni");
        jmeno = sc.nextLine();
        sc.close();
//            strSC.close();
        String[] strings = {vyska, vaha, vek, jmeno};
        return strings;
    }
}

class Clovek {
    private int vyska, vaha, vek;
    /**
     * format JMENO PRIJMENI (jedno prijmeni)
     */
    private String jmeno;

    /**
     * Ukol: zajistit, aby konstruktor vyhazoval vyjimku v pripade nesplneni pozadavku atributu
     * Nutno vytvorit vlastni vyjimku a nahradit obecnou
     *
     * @param vyska clovek muze byt vysoky az 210
     * @param vaha  muze vazit az 190
     * @param vek   musi byt mladsi 111 let
     * @param jmeno musi mit jasne jmeno a prijmeni (jedno prijmeneni, jedno krestni jmeno)
     * @throws Exception zahazuje vlasnti vyjimku, pokud neni splnena jedna ci vice podminek vyse
     */

    public Clovek(int vyska, int vaha, int vek, String jmeno) throws Exception { //contructor

        this.vyska = vyska;
        if (vyska > 210) {
            throw new HumanException("spatna vyska");
        }
        this.vaha = vaha;
        if (vaha > 190) {
            throw new HumanException("spatna vaha");
        }
        this.vek = vek;
        if (vek > 111) {
            throw new HumanException("spatny vek");
        }
        this.jmeno = jmeno;
        if (!(jmeno.indexOf(" ") == jmeno.lastIndexOf(" "))) {
            throw new HumanException("spatne jmeno");
        }

    }

    @Override
    public String toString() {
        return "Clovek se jmenuje " + jmeno + " je vysoky " + vyska + " cm, vazi " + vaha + " kg a je mu " + vek + " let";
    }
}

class HumanException extends Exception {
    public HumanException(String message) {
        super(message);
        System.out.println(message);
    }
}




