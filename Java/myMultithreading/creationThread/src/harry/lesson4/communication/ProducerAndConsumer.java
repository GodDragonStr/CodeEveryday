package harry.lesson4.communication;

import javax.swing.*;

public class ProducerAndConsumer {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        Producer producer = new Producer(c, "producer");
        Consumer consumer = new Consumer(c, "consumer");
        producer.start();
        consumer.start();

    }
}

class Clerk {
    private int products = 0;

    public void inPro() {
        if (products < 20) {
            products++;
            notify();
            System.out.println(Thread.currentThread().getName() + ": products" + products);
        } else {
            System.out.println(Thread.currentThread().getName() + ": full of products");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }

    public void outPro() {
        if (products > 0) {
            products--;
            notify();
            System.out.println(Thread.currentThread().getName() + ": products" + products);
        } else {
            System.out.println(Thread.currentThread().getName() + ": products sold out");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class Producer extends Thread {
    final Clerk c;
    // 线程锁
    private Producer() {
        this.c = null;
    }
    public Producer(Clerk c, String name) {
        super(name);
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this.c) {
                c.inPro();
            }
        }
    }
}

class Consumer extends Thread {
    final Clerk c;
    // 线程锁
    private Consumer() {
        this.c = null;
    }
    public Consumer(Clerk inc, String name) {
        super(name);
        this.c = inc;
    }

    // 线程操作
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this.c) {
                c.outPro();
            }
        }
    }

}
