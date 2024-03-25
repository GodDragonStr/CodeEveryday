import org.junit.Test;

import java.util.Map;
import java.util.HashMap;
public class MapTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        Map testMap = new HashMap();
        System.out.println(testMap.put(11, "test1"));
//        先通过key（set）的hashcode和equals方法找到相对应的元素
//        因此替换元素的过程中要注意key的hashcode是否发生了变化
//        如果key使我们自定义的类，就要重写相应的hashcode方法和equals方法
        System.out.println(testMap.put(11, "test2"));
        System.out.println(testMap);
        System.out.println(testMap.remove(11));
        System.out.println(testMap);



    }
}
