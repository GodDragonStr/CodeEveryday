package harry.string.ex1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringDemo {
//    public static void main(String[] args) {
//
//
//    }

    @BeforeAll
    public static void beforePrint() {

    }

    @Test
    public void myPrint() {
//        System.out.println("test successfully");
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace('l', 'w');


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "123";
        String s5 = "123";
        String s6 = new String("123");
        String s7 = new String("123");
        String s8 = "hello" + "world";
        String s9 = "helloworld";
        // 使用了StringBuilder的toString()方法---> new String();
        String s10 = s9 + "test";

        System.out.println(s4 == s6);
        System.out.println(s6 == s7);
    }

    @AfterAll
    public static void afterPrint() {

    }
}

