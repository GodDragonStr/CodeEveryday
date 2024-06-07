package org.example;


import org.junit.Test;

public class AppTest {
    public static void main(String[] args) {}

    @Test
    public void test1 () {
        System.out.println("test1");
        String s1 = "abc";
        String s2 = (new StringBuilder(s1)).reverse().toString();
        System.out.println(s2);
        int[] a = new int[]{0, 0};
        a[0]++;
        System.out.println(a[0]);
    }

    @Test
    public void test2 () {
        System.out.println("test2");
    }

    @Test
    public void test3 () {
        System.out.println("test3");
    }
}