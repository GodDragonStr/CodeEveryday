package harry.lee501;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.*;

public class FindModeinBinarySearchTree {
    public static void main(String[] args){
        TreeNode t2 = new TreeNode(2, null, null);
        TreeNode t1 = new TreeNode(2, t2, null);
        TreeNode t0 = new TreeNode(1, null, t1);
        Solution s1 = new Solution();
        System.out.println(s1.findMode(t0).toString());
        for (int i : s1.findMode(t0)) {
            System.out.println(i);
        }
    }

    @Test
    public void test1 () {
        Map<Integer, Integer> testMap = new HashMap<Integer, Integer>();
        testMap.put(3, 4);
        testMap.put(1, 1);
        testMap.put(1, 2);
        testMap.put(2, 2);
        testMap.put(33, 2);

        System.out.println(testMap);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {};
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    HashMap<Integer, Integer> recordModes = new LinkedHashMap<>();
    TreeNode preNode = null;
    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] result = new int[this.recordModes.size()];
        Integer keyTemp = null;
        int index = 0;
//        List<Integer> keys = this.recordModes.keySet().stream().toList();
//        keys = keys.reversed();
        List<Map.Entry<Integer, Integer>> sortList = new ArrayList<>(this.recordModes.entrySet());
        Collections.sort(sortList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        List<Integer> sortKeys = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : sortList) {
            sortKeys.add(e.getKey());
        }


        for (Integer key : sortKeys) {
            if (keyTemp == null) {
                keyTemp = key;
                result[index++] = key;
            } else {
                if (this.recordModes.get(keyTemp) == this.recordModes.get(key)) {
                    result[index++] = key;
                    keyTemp = key;

                } else {
                    break;
                }
            }

        }

        return Arrays.copyOf(result, index);
    }

    public void inOrderTraversal (TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.right);
        if (this.preNode == null) {
            this.preNode = root;
            this.recordModes.put(root.val, 1);
        } else {
            if (root.val == this.preNode.val) {
                this.recordModes.put(root.val, this.recordModes.get(root.val) + 1);
            } else {
                this.recordModes.put(root.val, 1);
            }

            this.preNode = root;
        }

        inOrderTraversal(root.left);
    }
}