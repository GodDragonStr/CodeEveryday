package harry.lesson2.safety;


class SaleTicket implements Runnable{
    int ticket = 10;
    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "sale tickets:" + ticket);
                ticket--;
                try {
                    Thread.sleep(0);
                } catch (Exception e) {
                    System.out.println("Something goes wrong");
                    e.printStackTrace();
                }

            } else {
                break;
            }
        }
    }
}

class Window extends Thread{
//    int ticket = 100;
    static int ticket = 10;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "tickets: " + ticket);
                ticket--;
                try {
                    Thread.sleep(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }
}


public class WindowTest {
    public static void main(String[] args) {
        WindowTest.test3();
    }

    public static void test1() {
        // 两个对象不共享
        SaleTicket s1 = new SaleTicket();
        SaleTicket s2 = new SaleTicket();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.setName("t1 sale ticket");
        t2.setName("t2 sale ticket");

        t1.start();
        t2.start();
    }

    public static void test2() {
        // 两个线程共用一个static堆的票
        SaleTicket s1 = new SaleTicket();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        t1.setName("share s1-t2");
        t2.setName("share s1-t2");

        t1.start();
        t2.start();
    }

    public static void test3() {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("w1");
        w2.setName("w2");
        w3.setName("w3");

        w1.start();
        w2.start();
        w3.start();
    }

}
