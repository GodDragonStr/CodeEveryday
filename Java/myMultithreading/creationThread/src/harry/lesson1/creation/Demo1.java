package harry.lesson1.creation;

/*
* Java 中 JVM 允许程序运行多个线程，
* 使用java.lang.Thread类代表线程，
* 所有的线程对象都必须是Thread类或其子类的实例*/
public class Demo1 {
    public static void main(String[] args) {
        /*
        * run() 方法代表线程要进行的任务
        * start() 是调用线程对象的方法：用于启动线程*/
        Demo1.test3();

//        Thread.sleep(1000);


    }

    public static void test() {
        // 创建自定义线程1
        MyThread mt1 = new MyThread("thread1");
        mt1.start();
        // 创建自定义线程2
        MyThread mt2 = new MyThread("thread2");
        mt2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread: " + i);
        }
    }

    public static void test2() {
        MyRunnable1 mr1 = new MyRunnable1("odd");
        MyRunnable1 mr2 = new MyRunnable1("even");

        Thread tr1 = new Thread(mr1, "Thread1");
        Thread tr2 = new Thread(mr2, "Thread2");

        // 查看修改线程名称
//        System.out.println(tr1.getName());
//        tr1.setName("Thread1_1");
//        System.out.println(tr1.getName());
        // 查看修改线程优先级
        System.out.println(tr1.getPriority());
        tr1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(tr1.getPriority());

        tr1.start();
        tr2.start();

    }

    public static void test3() {
        Thread tEven = new Thread("tEven") {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i += 2) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        tEven.start();

        Thread tOdd = new Thread("tOdd") {
            @Override
            public void run() {
                for (int i = 1; i < 10; i += 2) {
                    if (i == 5) {
                        Thread.yield();
                        try {
                            tEven.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": "+ i);
                }
            }
        };
        tOdd.start();
    }

    public static void test4() {
        Thread tEven;
        Thread tOdd;

        tOdd = new Thread("tOdd") {
            @Override
            public void run() {
                for (int i = 1 ; i < 10; i += 2) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    Thread.yield();

                }
            }
        };

        tEven = new Thread("tEven") {
          @Override
            public void run() {
              for (int i = 0; i <= 10; i += 2) {
                  System.out.println(Thread.currentThread().getName() + ": " + i);
                  this.yield();
                  tOdd.suspend();
              }
          }
        };
    }
}
