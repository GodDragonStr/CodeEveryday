package harry.binaryTree;

public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }



}