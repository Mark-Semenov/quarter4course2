package lesson3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private int a;
    private final Lock lock;

    {
        lock = new ReentrantLock();
    }

    public void minus() {
        calculate("-");
    }

    public void plus() {
        calculate("+");

    }

    private void calculate(String operation) {
        lock.lock();
        try {
            if (operation.equals("+")) {
                a++;
            } else if (operation.equals("-")) {
                a--;
            }
            System.out.println("a: " + a);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
