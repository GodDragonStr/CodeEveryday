package harry.lee98;

public class ValidateBinarySearchTree {
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode () {}

    TreeNode (int val) {
        this.val = val;
    }
    TreeNode (int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}


class Solution {
    long temp = Long.MIN_VALUE;
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {

        inOrderTraversal(root);
        return this.flag;
    }

    public void inOrderTraversal (TreeNode root) {
        if (root == null || this.flag == false) {
            return;
        }

        inOrderTraversal(root.left);
        if (this.temp < root.val) {
            this.temp = root.val;
        } else {
            this.flag = false;
            return;
        }

        inOrderTraversal(root.right);
    }
}


