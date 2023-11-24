package harry.binaryTree;

import java.util.List;
import java.util.ArrayList;

public class TreeTraversalDemo2 {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> v1 = new ArrayList<>();
        v1.add(1);
        v1.add(2);

        result.add(v1);
        result.add(v1);

        System.out.println(v1);
        System.out.println(result.get(0));
        System.out.println(result.get(1));

    }
}
