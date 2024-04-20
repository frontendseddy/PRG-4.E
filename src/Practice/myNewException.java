//package Practice;
//
//import java.util.Scanner;
//
//public class myNewException {
//    public static void main(String[] args) {
//        String[] param = userInput();
//        try {
//            Clovek c = new Clovek(Integer.parseInt(param[0]), Integer.parseInt(param[1]), Integer.parseInt(param[2]), param[3]);
//            System.out.println("Clovek uspesne vytvoren");
//            System.out.println(c.toString());
//            System.out.println("Ukoncuji program");
////zde zachycujeme a vypisujeme vyjimku
//            //zde se vypise chyba, kterou jsme nastavili v kontruktoru
//            //a nasledne se vypise Nastala chyba, ukoncuji program
//        } catch (HumanException e) {
//            System.out.println("Nasatala chyba, ukoncuji program");
//        } catch (Exception e) {
//            e.getMessage();
//        }
//    }
////    public void run() throws Exception {
////
////    }
//    static String[] userInput() {
//        Scanner sc = new Scanner(System.in);
//        String vyska, vaha, vek;
//        String jmeno;
//        System.out.println("Zadejte vysku");
//        vyska = sc.nextLine();
//        System.out.println("Zadejte vahu");
//        vaha = sc.nextLine();
//        System.out.println("Zadejte vek");
//        vek = sc.nextLine();
//        System.out.println("Zadejte jmeno a prijmeni");
//        jmeno = sc.nextLine();
//        sc.close();
//        String[] strings = {vyska, vaha, vek, jmeno};
//        return strings;
//    }
//}
//
//class Clovek {
//    private int vyska, vaha, vek;
//    private String jmeno;
//
//    public Clovek(int vyska, int vaha, int vek, String jmeno) throws Exception {
////pomoci throw new HumanException volame nasi novou vyjimku a do zavorky zapisujeme co ma vypsat
//        this.vyska = vyska;
//        if (vyska > 210) {
//            throw new HumanException("spatna vyska");
//        }
//        this.vaha = vaha;
//        if (vaha > 190) {
//            throw new HumanException("spatna vaha");
//        }
//        this.vek = vek;
//        if (vek > 111) {
//            throw new HumanException("spatny vek");
//        }
////format jmeno a prijimeni
//        this.jmeno = jmeno;
//        if (!(jmeno.indexOf(" ") == jmeno.lastIndexOf(" "))) {
//            throw new HumanException("spatne jmeno");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Clovek se jmenuje " + jmeno + " je vysoky " + vyska + " cm, vazi " + vaha + " kg a je mu " + vek + " let";
//    }
//}
//
////vytvoreni me nove vyjimky
//class HumanException extends Exception {
//    public HumanException(String message) {
//        super(message);
//        System.out.println(message);
//    }
//}
//
//
//
//
