package Practice;


import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int[] param = userInput();

    }
    static int[] userInput() {
        Scanner sc = new Scanner(System.in);
//            Scanner strSC = new Scanner(System.in);
        int size;
        System.out.println("Zadejte vysku");
        size = sc.nextInt();

        sc.close();
//            strSC.close();
        int[] integers = {size};
        return integers;
    }

    static void firstExample(int size) throws Exception {
        if (size > 10) {
            throw new MyNewException("spatna velikost");
        }
    }
}
//vytvoreni nove vyjimky
class MyNewException extends Exception {
    public MyNewException(String message) {
        super(message);
        System.out.println(message);
    }
}
class MySecondException extends Exception {
    public MySecondException(){
        System.out.println("neco je spatne pico");
    }
}
