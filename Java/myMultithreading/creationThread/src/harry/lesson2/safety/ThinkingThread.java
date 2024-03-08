package harry.lesson2.safety;

public class ThinkingThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Counting c1 = new Counting("c1");
        c1.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main over");
    }
}

class Counting extends Thread {
    Counting (String s) {
        super(s);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }


    }
}