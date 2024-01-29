package pvsv.Threads;
//        seznam procesů po sobě jdoucí
//        sada intrukcí, které můžou být spuštěný
public class Basics{
    public static void main(String[] args) {
//        FirstThread thread = new FirstThread();
//        thread.start();
//        thread.nic();
        IThread myThread = new IThread();
        Thread basicThread = new Thread(myThread);
//        basicThread.start();
        System.out.println("vypis mimo vlakno");
    }



}

class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("vypis v novem vlakne...");
    }

    void nic() {
        System.out.println("nic...");
    }
}

class IThread implements Runnable{
    @Override
    public void run() {
        System.out.println("vypis v novem vlakne (rozhrani)");
    }
}
