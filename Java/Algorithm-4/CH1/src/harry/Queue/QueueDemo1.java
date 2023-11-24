package harry.Queue;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<Integer> testQueue1 = new LinkedList<Integer>();
        testQueue1.add(1);
        System.out.println(testQueue1.peek());
        testQueue1.add(2);
        System.out.println(testQueue1.size());
        System.out.println(testQueue1.offer(3));
        System.out.println(testQueue1.add(3));
        System.out.println(testQueue1.remove());
        System.out.println(testQueue1.poll());

        System.out.println(testQueue1.offer(3));
        System.out.println(testQueue1.add(3));

        System.out.println("Print element in for loop:");
        for (Integer e: testQueue1) {
            System.out.println(e);
        }
    }
}
