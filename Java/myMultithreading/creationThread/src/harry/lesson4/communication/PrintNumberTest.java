package harry.lesson4.communication;

public class PrintNumberTest {
    // 两个线程交替打印100
    // 共享数据 sharing data
    public static void main(String[] args) {
        // 创建当前类的实例
        PrintNumber p1 = new PrintNumber();


//        Thread t1 = new Thread(p1);
        // wait(), notify(), notifyAll()只能在同步代码块和同步方法中使用
        // 不能在lock中使用(lock 需要配合Condition实现线程间的通信)
        // wait(), notify(), notifyAll()的调用者是this
        // 调用者必须是同步代码块或同步方法的监视器
        // 因此synchronized的监视器和方法wait()等的调用者相同
        // 如果是this全部应该是this
        // 如果是Object obj应当是obj.wait(); synchronized(obj);
        new Thread(p1, "thread2").start();
        new Thread(p1, "thread1").start();

    }
}

class PrintNumber implements Runnable {
    private int number = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (number <= 100) {
                    // notify只能唤醒一个优先级最高的线程
                    // 如果被wait()的线程的优先级相同责备随机唤醒
                    // 被唤醒的线程从当初被wait()的地方继续执行
                    // notifyAll()一旦执行所有线程都会被唤醒
                    notify();
                    // notify()不是静态方法那么是this.notify()

                    // 线程睡眠反应多线程的问题
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;

                    try {
                        wait(); // 线程一旦执行此方法就进入等待状态
                                // 进入等待后会释放同步监视器
                                // 与sleep不同：sleep不会释放同步监视器的调用
                        // wait()不是静态方法即this.wait()
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    notify();
                    break;

                }
            }
        }
    }
}



