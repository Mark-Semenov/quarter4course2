package lesson3;

public class Main {

    public static Counter counter;

    public static void main(String[] args) {
        counter = new Counter();

        new Thread(Main::m1).start();
        new Thread(Main::m2).start();
    }

    public static void m1() {
        for (int i = 0; i < 10; i++) {
            counter.plus();
        }
    }

    public static void m2() {
        for (int i = 0; i < 5; i++) {
            counter.minus();
        }
    }


}
