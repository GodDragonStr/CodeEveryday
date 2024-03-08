package com.atguigu01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileInputStream;


public class ExceptionTest {
    // ********************************************运行异常********************************************
    // 1.ArrayIndexOutOfBoundsException
    public static void main1(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[3]);
    }
    // 2.NullPointerException
    public static void main2(String[] args) {
        // 第一个是字符串的空指针
        String str = null;
        str = "hello";
        System.out.println(str.toString());
        // 第二个是数组的空指针
        int[][] arra = new int[3][];
        System.out.println(arra[0]);
        System.out.println(arra[0][0]);
        // 第三个是对象（如果没有实体就是空指针）
    }
    // 3.ClassCastException
    public static void main3(String[] args) {
        Object obj = new String();
        int date = (int) obj;
        System.out.println(obj);
    }
    // 4.NumberFormatException
    public static void main4(String[] args) {
        String  str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        str = "abc";
        int j = Integer.parseInt(str);
        System.out.println(j);
    }
    // 5.InputMismatchException
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
        scanner.close();
    }
    // 6.AlgorithException
    public static void main6(String[] args) {
        int num = 10;
        System.out.println(num / 0);
    }

    // ********************************************编译异常********************************************

    // 1.ClassNotFoundException
    public static void main7(String[] args) {
        String clz = new String("java.lang.String");
//        Class clz2 = Class.forName("java.lang.String");
    }
    // 2.FileNotFoundException+IOException
    public static void main8(String[] args) throws FileNotFoundException, IOException {
        // FileNotFoundException
        File file = new File("D:\\Repositery\\CodeEveryday\\Java\\heima\\Throwable_Error_Exception\\src\\com\\atguigu01\\throwable\\hello.txt");
        FileInputStream fis = new FileInputStream(file);
        // IOException
        int data = fis.read();
        while (data != -1) {
            System.out.println((char)data);
            data = fis.read();
        }

        fis.close();
    }

    @Test
    public void main9() {
        System.out.println("test");

         try {
             Scanner scanner = new Scanner(System.in);
             int i = scanner.nextInt();
             System.out.println(i);
             scanner.close();
         } catch (InputMismatchException e) {
             System.out.println("This Error: InputMismatchError!!!");
         }

        System.out.println("test");
    }

    @Test
    public void test1() {
        String str = "1234";
        str = "abc";

        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception!!!");
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        Scanner scanner = new Scanner(System.in);

        try {
            int i = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Error: InputMismatchException!!!");
            e.printStackTrace();
        } finally {
            System.out.println("Something wrong?");
        }
    }

    @Test
    public void test3() {
        int num = 3;
    }

}
