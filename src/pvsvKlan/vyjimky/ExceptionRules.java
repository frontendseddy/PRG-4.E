//package pvsvKlan.vyjimky;
//
//import java.util.Scanner;
//
//public class ExceptionRules {
//    public static void main(String[] args) throws Exception {
//        Clovek c = null; //zatim prazdna reference
//
//        //zajistit odchyceni a osetreni vyjimky na urovni metody main
//        c = userInput();
//        try {
//            Clovek c = new Clovek(vyska, vaha, vek, jmeno);
//        } catch () {
//
//        } finally {
//
//        }
//        System.out.println("Clovek uspesne vytvoren");//vypsat, kdyz vse probehne bez chyb
//        System.out.println("Nasatala chyba, ukoncuji program");//vypsat, kdyz chyba nastane
//        System.out.println("Ukoncuji program");//vypsat v obou pripadech (musi byt ale vypsano jednou)
//    }
//
//    static Clovek userInput() throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int vyska, vaha, vek;
//        String jmeno;
//        System.out.println("Zadejte vysku");
//        vyska = sc.nextInt();
//        System.out.println("Zadejte vahu");
//        vaha = sc.nextInt();
//        System.out.println("Zadejte vek");
//        vek = sc.nextInt();
//        System.out.println("Zadejte jmeno a prijmeni");
//        jmeno = sc.nextLine();
//        sc.close();
//        Clovek c = new Clovek(vyska, vaha, vek, jmeno);
//        return c;
//    }
//
//}
//
//class Clovek {
//
//    private int vyska, vaha, vek;
//
//    /**
//     * format JMENO PRIJMENI (jedno prijmeni)
//     */
//    private String jmeno;
//
//    /**
//     * Ukol: zajistit, aby konstruktor vyhazoval vyjimku v pripade nesplneni pozadavku atributu
//     * Nutno vytvorit vlastni vyjimku a nahradit obecnou
//     *
//     * @param vyska clovek muze byt vysoky az 210
//     * @param vaha  muze vazit az 190
//     * @param vek   musi byt mladsi 111 let
//     * @param jmeno musi mit jasne jmeno a prijmeni (jedno prijmeneni, jedno krestni jmeno)
//     * @throws Exception zahazuje vlasnti vyjimku, pokud neni splnena jedna ci vice podminek vyse
//     */
//
//    public Clovek(int vyska, int vaha, int vek, String jmeno) throws Exception { //contructor
//
//        this.vyska = vyska;
//        if (vyska > 210) {
//            throw new HumanException();
//        }
//        /*//Priklad nesplneni:
//        if (vyska == 1234)
//            throw new Exception();*/
//        this.vaha = vaha;
//        if (vaha > 190) {
//            throw new HumanException();
//        }
//        this.vek = vek;
//        if (vek > 111) {
//            throw new HumanException();
//        }
//        this.jmeno = jmeno;
//    }
//
//}
//
//class HumanException extends Exception {
//
//}



