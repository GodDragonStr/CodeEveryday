package myset1;

import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
//        TreeSet按照顺序存储的，也就是要比较元素的类型，因此需要存储相同类型的元素
//        不同于HashSet只存储（可以存储不同类型的元素）
        TreeSet<String> set = new TreeSet();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");
        set.add("ee");
//        set.add(33);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        HashSet testSet = new HashSet();
        testSet.add("1111");
        testSet.add(1111);
        Iterator iter2 = testSet.iterator();

        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

        System.out.println(Objects.hash(1, 3));

    }
}

class Product implements Comparable<Object> {
    int price;
    String band;


    public Product(int price, String band) {
        this.price = price;
        this.band = band;
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }

        if (o instanceof Product) {
//            强制转换
            Product p = (Product) o;
            Integer.compare(this.price, p.price);

        }

        throw new RuntimeException("类型比较不匹配");
    }

    Comparator com = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };

}
