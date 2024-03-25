package harry.lee538;

public class ConvertBSTtoGreaterTree {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

}

class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        reverseInorderTraversal(root);
        return root;
    }

    public void reverseInorderTraversal(TreeNode root) {
        if (root == null ) {
            return ;
        }
        convertBST(root.right);
        this.sum += root.val;
        root.val = this.sum;
        convertBST(root.left);
    }
}
