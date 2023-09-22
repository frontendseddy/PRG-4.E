package xpvsBohac.vyjimky.exceptionBohac;

import xpvsBohac.vyjimky.FactorialExce;

public class Main {
    static int factorial(int a) throws FactorialExce {
        if (a < 0) throw new FactorialExce();
        if (a < 2){
            return 1;
        }
        return a * factorial(a-1);
    }
    public static void main(String[] args) {
        try {
            System.out.println(factorial(-3));
        } catch (FactorialExce factorialExce) {
            factorialExce.printStackTrace();
        }
    }
}
