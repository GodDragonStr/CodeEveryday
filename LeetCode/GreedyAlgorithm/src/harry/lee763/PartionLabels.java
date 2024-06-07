package harry.lee763;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class PartionLabels {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1.substring(0).contains(String.valueOf(s1.charAt(1))));
        System.out.println(s1.substring(0));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        System.out.println(map.get(1));
        map.put(1, 2);
        System.out.println(map.get(1));

        int[][] arr1 = new int[3][];
        System.out.println(arr1);
        List<Integer> test1 = new LinkedList<>();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        System.out.println(test1.size());
        Iterator<Integer> iter = test1.iterator();
        System.out.println(test1.get(1));

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(1);
        arr2.add(1);
        arr2.set(0, 2);
        System.out.println(arr2);

    }
}

class Solution {
    public List<Integer> partitionLabels(String s) {
        int len = s.length();

        int cur_start = 0;
        int cur_end = 0;

        return null;
    }
}