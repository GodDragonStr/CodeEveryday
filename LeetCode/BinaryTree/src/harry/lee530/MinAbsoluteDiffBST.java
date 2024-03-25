package harry.lee530;

public class MinAbsoluteDiffBST {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode () {};
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
    int minNum = 0;
    Integer temp1 = null;
    Integer temp2 = null;

    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return minNum;
    }

    public void inOrderTraversal (TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);

        if (temp1 == null ) {
            temp1 = root.val;
        } else if (temp2 == null) {
            temp2 = root.val;
            minNum = temp2 - temp1;
        } else {
            temp1 = temp2;
            temp2 = root.val;
            if (minNum > temp2 - temp1) {
                minNum = temp2 - temp1;
            }
        }

        inOrderTraversal(root.right);

    }
}