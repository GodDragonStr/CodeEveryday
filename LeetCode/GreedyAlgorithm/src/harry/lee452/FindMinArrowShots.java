package harry.lee452;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class FindMinArrowShots {

    public static void main(String[] args){
        int[][] inputArr = new int[][]{{10,16}, {2, 8}, {1, 6}, {7, 12}};
        // 注意这里拷贝的不是元素，而是一维数组的引用
        int[][] newArr = Arrays.copyOf(inputArr, 4);
        newArr[0][0] = 2;
        Queue<Integer> q1 = new LinkedList<>();
        System.out.println(q1.size());
        System.out.println("--------------------------------------------");

        for (int[] a : inputArr) {
            System.out.println(Arrays.toString(a));
        }
        ArrayComparator myCom = new ArrayComparator();
        Arrays.sort(inputArr, myCom);
        System.out.println("--------------------------------------------");
        for (int[] a : inputArr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("--------------------------------------------");
        for (int[] a : newArr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("--------------------------------------------");
        Integer[] test1 = new Integer[]{1, 2, 3};
        Integer[] test2 = Arrays.copyOf(test1, 3);
        test2[0] = 3;
        System.out.println(test1[0] + " " + test2[0]);
    }

    @Test
    public void test01(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";

        String s4 = s1 + "world";//s4字符串内容也helloworld，s1是变量，"world"常量，变量 + 常量的结果在堆中
        String s5 = s1 + s2;//s5字符串内容也helloworld，s1和s2都是变量，变量 + 变量的结果在堆中
        String s6 = "hello" + "world";//常量+ 常量 结果在常量池中，因为编译期间就可以确定结果
        String s7 = s5.intern();

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//true
        System.out.println(s6 == s7);//true
    }
}

class Solution{
    public int findMinArrowShots(int[][] points) {
        return 0;
    }
}

class ArrayComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a1, int[] a2) {
        return a1[0] - a2[0];
    }
}