package harry.lesson3.safemore;

public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        // main测试
        for (String i: args) {
            System.out.println("main arguments: " + i);
        }


        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Bank b3 = Bank.getInstance();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Bank b4 = Bank.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b3 == b4);
    }
}

class Bank{
    private Bank() {}

    private static Bank instance = null;
    public static Bank getInstance(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }
}