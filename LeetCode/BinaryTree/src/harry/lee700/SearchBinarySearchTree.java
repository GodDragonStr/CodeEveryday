package harry.lee700;

public class SearchBinarySearchTree {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left = new TreeNode();
    TreeNode right = new TreeNode();

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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        } else {
            if (root.val == val) {
                return root;
            } else {
                if (root.val > val) {
                    return searchBST(root.left, val);
                } else {
                    return searchBST(root.right, val);
                }
            }
        }
    }
}