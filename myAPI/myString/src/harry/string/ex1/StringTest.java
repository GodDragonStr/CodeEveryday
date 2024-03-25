package harry.string.ex1;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringTest {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";
        System.out.println(System.identityHashCode(str));
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(System.identityHashCode(ex.str));
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }

    @Test
    public void test1 () {
        String s0 = "a" + "b" + "c";
        String s1 = "abc";
        String s2 = "123";
        String s3 = "abc" + "123";
        String s4 = s1 + "123";
        String s5 = s1 + s2;
        String s6 = s5.intern();

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);


        System.out.println(s0 == s1);
        System.out.println("-------------------------------------------------");
        String s7 = "aaaa";
        String s8 = s7;
        System.out.println(s7 == s8);
        System.out.println(s7.hashCode());
        System.out.println(s8.hashCode());



        System.out.println("-------------------------------------------------");
        StringTest2 ex = new StringTest2();
        System.out.println(ex.str.hashCode());
        System.out.println(ex.ch.hashCode());
        System.out.println(ex.sList.hashCode());


        ex.change(ex.str, ex.ch, ex.sList);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
        System.out.println(ex.sList);
    }
}


class StringTest2 {

//    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    String str = new String("good");
    List<String> sList = new ArrayList<>();


    public void change(String str, char ch[], List<String> sList) {
        str = "test ok";
        System.out.println(str.hashCode());
        ch[0] = 'b';
    }

}
