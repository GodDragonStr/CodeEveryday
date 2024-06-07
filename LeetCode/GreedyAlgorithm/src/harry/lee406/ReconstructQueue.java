package harry.lee406;

import org.junit.Test;

import java.util.*;

public class ReconstructQueue {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        int[][] arr = new int[4][];
        int[] arr2 = new int[3];
        List<int[]> list = new LinkedList<>();
        list.add(new int[] {1, 3});
        list.add(new int[] {2, 4});
        list.add(new int[] {3, 5});
        System.out.println(  list.toArray().getClass());
//        System.out.println(Arrays.toString(list.get(0)));
        arr[0] = new int[]{3, 2, 1};
        arr[1] = new int[]{1, 2, 1};
        arr[2] = new int[]{5, 2, 1};
        arr[3] = new int[]{5, 3, 1};

        Integer[] integerArr = new Integer[]{1, 2, 3, 4};
        class IntegerComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer a, Integer b) {
                return (int)(a - b);
            }
        }
        class IntComparator implements Comparator<int[]> {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        }

        Arrays.sort(arr, new IntComparator());

        for (int[] e : arr) {
            System.out.println(Arrays.toString(e));
        }

        Integer[] integer1 = new Integer[]{1, 2, 3};
        Integer i1 = integer1[0];
        integer1[0] = 10;
        System.out.println(i1 + " " + integer1[0]);
        Integer i2 = 1;
        Integer i3 = i2;
        i2 = 10;
        System.out.println(i2 + " " + i3);
    }
}
