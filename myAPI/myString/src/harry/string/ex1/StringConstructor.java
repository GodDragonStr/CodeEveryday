package harry.string.ex1;

import org.junit.jupiter.api.Test;

public class StringConstructor {

    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[] {'a', 'b', 'c', 'd', 'e'}, 1, 2);
        System.out.println(s3);
    }
}
