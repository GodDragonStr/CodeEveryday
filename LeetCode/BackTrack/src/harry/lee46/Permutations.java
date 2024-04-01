package harry.lee46;

import org.junit.Test;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(2);
        list1.add(3);
        list1.add(4);
//        List<Integer> list2 = new ArrayList<Integer>(list1);
//        list2.remove(0);
//        System.out.println(list1);
//        System.out.println(list2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        int[] test1 = new int[]{1, 2, 3, 4};
//        Arrays.sort(test1);
        int index = 0;
        System.out.println(test1[++index]);
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int i = o1 - o2;
        return -i;
    }
}