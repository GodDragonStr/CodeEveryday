package harry.lee617;

import com.sun.source.tree.Tree;

public class MergeTwoBT {
    public static void main(String[] args) {

    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode () {}
    public TreeNode (int val) {
        this.val = val;
    }
    public TreeNode (int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        TreeNode mergeTree = new TreeNode();
//        mergeTree = inorderTraversal(root1, root2);
//        return mergeTree;
        return inorderTraversal(root1, root2);
    }

    public TreeNode inorderTraversal (TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        } else {
//            int mergeVal = 0;
//            mergeVal = (root1 != null) ? mergeVal + root1.val : mergeVal;
//            mergeVal = (root2 != null) ? mergeVal + root2.val : mergeVal;
            TreeNode mergeRoot = new TreeNode(((root1 != null) ? root1.val : 0) + ((root2 != null) ? root2.val : 0));

            if (root1 == null) {
                mergeRoot.left = inorderTraversal(null, root2.left);
                mergeRoot.right = inorderTraversal(null, root2.right);
            } else if (root2 == null) {
                mergeRoot.left = inorderTraversal(root1.left, null);
                mergeRoot.right = inorderTraversal(root1.right, null);
            } else {
                mergeRoot.left = inorderTraversal(root1.left, root2.left);
                mergeRoot.right = inorderTraversal(root1.right, root2.right);
            }

            return mergeRoot;
        }
    }
}