package lesson3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    static int a;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> counter(lock)).start();
        }
    }

    public static void counter(Lock lock) {
        lock.lock();
        try {
            a++;
            System.out.println("b: " + a);
        } finally {
            lock.unlock();
        }
    }
}
