package lesson3;

public class PingPong {
    static final Object o = new Object();

    public static void main(String[] args) {
        new Thread(PingPong::ping).start();
        new Thread(PingPong::pong).start();
    }

    public static void ping() {
        synchronized (o) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Ping");
                o.notify();
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    o.notify();
                }
            }
        }
    }

    public static void pong() {
        synchronized (o) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Pong");
                o.notify();
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
