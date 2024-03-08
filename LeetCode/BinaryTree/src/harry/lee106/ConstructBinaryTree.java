package harry.lee106;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ConstructBinaryTree {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4};
//        int[] b = Arrays.copyOfRange(a, 0, a.length);
//        System.out.println(Arrays.toString(b));

        TreeNode t0 = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);
        t0.left = t1;
        t0.right = t2;
        t1.left = null;
        t1.right = null;
        t2.left = t3;
        t2.right = t4;

        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        Solution s = new Solution();
        TreeNode root = s.buildTree(inorder, postorder);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);

    }
//    public static void changeRootChild (TreeNode root, TreeNode childRoot) {
//        root.left = childRoot;
//    }
}

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
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode rootNode = new TreeNode();
        constructTree(rootNode, inorder, postorder);
        return rootNode;
    }

    public void constructTree(TreeNode root, int[] inorder, int[] postorder) {

//        每一层的操作是对当前树的根节点找到左右子树的序列
        if (postorder.length == 0) {
            return ;
        }
        root.val = postorder[postorder.length - 1];
        System.out.println(root.val);
        int currNodeInorderIdex = findIdx(inorder,  root.val);
        System.out.println(currNodeInorderIdex);

        if (currNodeInorderIdex != 0) {
            root.left = new TreeNode();
            int[] leftTreeInorder = Arrays.copyOfRange(inorder, 0, currNodeInorderIdex);
            int[] leftTreePostorder = Arrays.copyOfRange(postorder, 0, currNodeInorderIdex);
            constructTree(root.left, leftTreeInorder, leftTreePostorder);
        }

        if (currNodeInorderIdex != postorder.length - 1) {
            root.right = new TreeNode();
            int[] rightTreeInorder = Arrays.copyOfRange(inorder, currNodeInorderIdex + 1, inorder.length);
            int[] rightTreePostorder = Arrays.copyOfRange(postorder, currNodeInorderIdex, postorder.length - 1);
            constructTree(root.right, rightTreeInorder, rightTreePostorder);
        }

    }

    public int findIdx (int[] sOrder, int val) {
        int targetIdx = 0;


        for (int i = 0; i < sOrder.length; i++) {
            if (val == sOrder[i]) {
                targetIdx = i;
            }
        }
        return targetIdx;
    }
}
