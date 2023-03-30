package Threads;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TASK 1 AND 2
        for (int i = 1; i <= 10; i++) {
            Thread thread = new MyThread();
            thread.setName("Thread " + i);
            System.out.println("State before start - " + thread.getName() + " : " + thread.getState());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("State after start - " + thread.getName() + " : " + thread.getState());
        }

        // TASK 3
        Counter counter = new Counter();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            }));
            threads.get(i).start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(counter.getCount());

        // TASK 4
        Object lock = new Object();
        Thread name1 = new NameThread(lock);
        Thread name2 = new NameThread(lock);
        //name1.start();
        //name2.start();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("State during running - " + getName() + " : " + getState());
            for (int i = 0; i <= 100; i++) {
                //System.out.println(i);
            }
        }
    }

    public static class NameThread extends Thread {
        private Object lock;

        public NameThread(Object lock) {
            this.lock = lock;
        }

        public void run() {
            synchronized (lock) {
                while (true) {
                    lock.notify();
                    System.out.println(getName());
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}