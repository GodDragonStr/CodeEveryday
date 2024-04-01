package myscanner;

import org.junit.Test;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InputTest1 {
    @Test
    public void test1() {
        Scanner s1 = new Scanner(System.in);
        int a = 0;
        int b = 0;
//        while(s1.hasNextInt()) {
//            a = s1.nextInt();
//            b = s1.nextInt();
//        }

        System.out.println(a);
        System.out.println(b);

        s1.close();

        Set<Integer> set1 = new HashSet<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Integer[] int1 = ((Integer[]) list1.toArray());
        int[] int2 = new int[]{1, 2 ,3};
        System.out.println(list2.contains(3));
        String sss = "aaaa";
        System.out.println(sss.length());
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        float f1 = 1.22F;
        long l1 = 1111L;
        System.out.println(f1 + "" + l1);
    }
}
