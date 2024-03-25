package harry.myCollection;

import org.junit.Test;

public class CollectionTest {
    public static void main(String[] args) {
        return ;
    }


    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = new String();
        s2 = "abc";
        String s3 = new String("abc");
        String[] sArray = new String[] {"111", "222", "333"};

        System.out.println(s1 == s2);
        System.out.println((s2 == s3));

        System.out.println("pre:" + "*************************");
        System.out.println(s1.hashCode() + ": " + s1);
        System.out.println(s2.hashCode() + ": " + s2);
        System.out.println(s3.hashCode() + ": " + s3);
        System.out.println("change:" + "*************************");
        changeString(s1);
        changeString(s2);
        changeString(s3);
        System.out.println("pos:" + "*************************");
        System.out.println(s1.hashCode() + ": " + s1);
        System.out.println(s2.hashCode() + ": " + s2);
        System.out.println(s3.hashCode() + ": " + s3);

        System.out.println("string array test: ");
        System.out.println(sArray.hashCode());
        changeStringArray(sArray);
        for (String s: sArray) {
            System.out.println(s);
        }
        System.out.println(sArray.hashCode());
    }

    public void changeString (String s) {
        s = "change!!!";
        System.out.println(s.hashCode() + ": " + s);
    }

    public void changeStringArray (String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.toString(i);
        }
    }
}
