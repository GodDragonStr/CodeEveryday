package harry.lee104.code;

import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        Queue<String> l1 = new LinkedList<String>();
        Queue<String> myQueque = new LinkedList<>();
        Queue<String> myDeque = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> myDarray = new ArrayList<ArrayList<Integer>>();
        myDarray.add(new ArrayList<Integer>());
//        System.out.println(myDarray.get(0));

        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        // 初始化二维ArrayList
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                innerList.add(i * 4 + j + 1);
            }
            twoDArrayList.add(innerList);
        }

        ArrayList<Integer> addElement = new ArrayList<>();
        addElement.add(1);

        twoDArrayList.set(1, addElement);
        // 获取的是第2个元素的地址
        twoDArrayList.get(2).set(0, 10);
        System.out.println(twoDArrayList);

        
    }
}
