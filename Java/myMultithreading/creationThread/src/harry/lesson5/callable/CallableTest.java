package harry.lesson5.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args){
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        // 创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        // 将Callable接口实现类的对象作为传递到FutureTask构造器中
        FutureTask futureTask = new FutureTask(numThread);
        // 将FutureTask对象作为Thread的构造器参数并start()
        Thread t1 = new Thread(futureTask);
        t1.start();

        try {
            // get()获取Callable方法中的返回值
            Object sum = futureTask.get();
            // sum = futureTask只有执行完Callable的方法后才会继续main线程中的打印
            // 即自动为主线程添加了阻塞
            // 优点：Callabe相比于Runnable有返回值; 可以使用throws的方法; Callable使用了泛型
            // 缺点：在调用call()方法会有阻塞,因此main()线程需要在futureTask方法完成后才能调用
            System.out.println("总和为：" + sum);
            Thread.sleep(100);
//            System.out.println("anything");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class NumThread implements Callable{
    @Override
    // 返回值并throws进行处理
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
            Thread.sleep(100);
        }
        return sum;
    }
}
