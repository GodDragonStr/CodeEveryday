package harry.myList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        List myList1 = new ArrayList();
        myList1.add("1");
        myList1.add("2");
        myList1.add("3");
        myList1.add("4");

        System.out.println(myList1);

        List myList2 = myList1;
        myList2.set(0, "10");
        System.out.println(myList1);
        System.out.println(myList2);

    }

    @Test
    public void test() {
        ArrayList arr = new ArrayList();
        arr.add("aa");
        arr.add("bb");
        arr.remove("aa");
        System.out.println(arr.toString());
        Character c1 = 'f';
        Integer a = Integer.valueOf(123123);
        System.out.println(a);


        List<Character> myChar = new ArrayList<>();
        Random myRandom = new Random();
        System.out.println(myRandom.nextInt(1, 27));
        for (int i = 0; i < 30; i++) {
            myChar.add((char)(myRandom.nextInt(1, 27) + 96));
        }

        System.out.println(myChar.toString());

        System.out.println(myChar.contains('a'));



    }


}
