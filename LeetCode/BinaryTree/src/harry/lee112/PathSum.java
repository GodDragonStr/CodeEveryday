package harry.lee112;

import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;

public class PathSum {
    public static void main(String[] args) {
//        int[] a = new int[10];
//        PathSum.test(a);
//        System.out.println(a[3]);
        TreeNode t0 = new TreeNode(5);
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(11);
        TreeNode t4 = new TreeNode(13);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(7);
        TreeNode t7 = new TreeNode(2);
        TreeNode t8 = new TreeNode(1);
        t0.left = t1;
        t0.right = t2;
        t1.left = t3;
        t1.right = t2;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.left = null;
        t4.right = null;
        t5.left = null;
        t5.right = t8;
        t6.left = null;
        t6.right = null;
        t7.left = null;
        t7.right = null;
        t8.left = null;
        t8.right = null;
        Solution myS = new Solution();
        boolean result = myS.hasPathSum(t0,22);
        System.out.println(result);
    }

    public static void test(int[] a) {
        a[3] = 7;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // List<Integer> path = new ArrayList<>();
        // return preTraversal1(root, path, targetSum);
        return preTraversal2(root, 0, targetSum);
    }

    // 地址传递需要每层处理完单独进行回溯处理
    public boolean preTraversal1(TreeNode node, List<Integer> path, int targetSum) {
        if (node == null) return false;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (calPath(path) == targetSum) return true;
        }
        if (node.left != null) {
            // 如果找到了目标值直接返回true不再进行判断
            if (preTraversal1(node.left, path, targetSum)) {
                return true;
            } else {
                // 进行节点回溯
                path.remove(path.size() - 1);
            }
        }
        if (node.right != null) {
            // 如果找到了目标值直接返回true不再进行判断
            if (preTraversal1(node.right, path, targetSum)) {
                return true;
            } else {
                // 进行节点回溯
                path.remove(path.size() - 1);
            }
        }
        // 如果还没有找到目标值不会提前返回true，最后返回false
        return false;
    }

    public int calPath(List<Integer> path) {
        int cal = 0;
        for (Integer i : path) {
            cal += i;
        }
        return cal;
    }

    // 值传递可以使递归的时候每一层值独立
    public boolean preTraversal2(TreeNode node, int valSum, int targetSum) {
        if (node == null) return false;
        valSum = valSum + node.val;
        if (node.left == null && node.right == null) {
            if (valSum == targetSum) return true;
        }
        if (node.left != null) {
            // 如果找到了目标值直接返回true不再进行判断
            if (preTraversal2(node.left, valSum, targetSum)) {
                return true;
            }
        }
        if (node.right != null) {
            // 如果找到了目标值直接返回true不再进行判断
            if (preTraversal2(node.right, valSum, targetSum)) {
                return true;
            }
        }
        // 如果还没有找到目标值不会提前返回true，最后返回false
        return false;
    }
}