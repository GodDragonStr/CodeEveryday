package harry.lee257;

import org.junit.jupiter.api.Test;

import java.util.*;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(5);
        t0.left = t1;
        t0.right = t2;
        t1.left = null;
        t1.right = t3;
        t2.left = null;
        t2.right = null;
        t3.left = null;
        t3.right = null;

        Solution s = new Solution();
        List<String> paths = new ArrayList<>();
        paths = s.binaryTreePaths(t0);
        System.out.println(paths);
    }

    @Test
    public void test() {
        String s = new String();
        List<String> listS = new ArrayList<>();
        StringBuilder sBuilder = new StringBuilder();
        testHelper(s, listS, sBuilder);
        System.out.println(s);
        System.out.println(listS);
        System.out.println(sBuilder);
        int a = 1234;
        System.out.println(s+a);
        StringBuffer sBuffer = new StringBuffer("123").append(456);
        System.out.println(sBuffer);

    }

    public void testHelper(String s, List<String> listS, StringBuilder sBuilder ) {
        s = s+"123";
        listS.add("abc");
        listS.add("123");
        sBuilder.append("efg");
        sBuilder.append("789");
    }

}

// 树节点
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}

class Solution {
    List<String> paths = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    // 最通用的应该是前序遍历
    // 前序遍历先遍历根节点，在遍历左右子树，和树的定义式一样的（树的左右子树也是树）
    // 这里如果我们采用前序遍历定义了一种递归方法，能够找到该节点下的所有路，那么我么只用考虑终止条件，返回结果，和过程就好了
    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePathsPreRecur(root, path, paths);
        return paths;
    }

    public void binaryTreePathsPreRecur(TreeNode node, List<Integer> path, List<String> paths) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        // 判断是否为根节点，如果是就找到了一条路径
        if (node.left == null && node.right == null) {
            paths.add(nodeToString(path));
        }
        if (node.left != null) {
            binaryTreePathsPreRecur(node.left, path, paths);
            // 回退路径的一个节点向上回溯
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            binaryTreePathsPreRecur(node.right, path, paths);
            // 回退路径的一个节点向上回溯
            path.remove(path.size() - 1);
        }


    }

    public String nodeToString(List<Integer> path) {
        StringJoiner sjoiner = new StringJoiner("->");
        for (Integer i: path) {
            sjoiner.add(i.toString());
        }
        return sjoiner.toString();
    }
}