package harry.myList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

public class ListTest {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        ArrayList arr = new ArrayList();
        arr.add("aa");
        arr.add("bb");
        System.out.println(arr.toString());
    }
}
