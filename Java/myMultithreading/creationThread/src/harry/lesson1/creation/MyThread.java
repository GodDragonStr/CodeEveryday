package harry.lesson1.creation;

public class MyThread extends Thread{
    // 定义指定线程名称用于构造方法
    public MyThread(String name) {
        // 调用父类的构造方法：指定线程名称
        super(name);
    }

    // 重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

}

class MyRunnable1 implements Runnable {
    String mode;
    MyRunnable1 (String mode) {
        this.mode = mode;
    }
    @Override
    public void run() {
        int start;
        if (this.mode == "odd")
            start = 1;
        else
            start = 2;
        for (int i = start; i <= 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
