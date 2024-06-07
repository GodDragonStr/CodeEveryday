package harry.chapter2;
import java.util.*;

public class C2S6_SortedArraySum {
    public static void main(String[] args) {
        int k = 8;
        int[] arr1 = new int[]{1, 2, 4, 6, 10};
        int leftPointer = 0;
        int rightPointer = arr1.length - 1;
//        while (leftPointer < rightPointer) {
//            int currSum = arr1[leftPointer] + arr1[rightPointer];
//            if (currSum == k) {
//                System.out.println("lower index: " + leftPointer + " and " + rightPointer);
//                return;
//            } else if (currSum < k) {
//                leftPointer++;
//            } else {
//                rightPointer--;
//            }
//        }

        System.out.println("does not match:" + k);

        List<String> test = new ArrayList<String>();
        test.add("a");
        test.add("b");
        test.add("c");
        test.add(0, "z");
        System.out.println(test);
        System.out.println(test.remove(0));
        System.out.println(test);

        String[] test2 = new String[]{"abc", "efd"};
        List<String> test3 = new ArrayList<String>(Arrays.asList(test2));
        System.out.println(test3);

        Map<int[], String> hashMap = new HashMap<int[], String>();
        int[] arr2 = new int[26];
        int[] arr3 = new int[26];
        arr3[0] = 1;
        int [] arr4 = new int[26];

        hashMap.put(arr2, "2abc");
        hashMap.put(arr3, "3abc");
        hashMap.put(arr4, "4abc");

        for (Map.Entry<int[], String> e : hashMap.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(hashMap);
        
        return ;
    }
}
