package harry.lee404;

public class SumofLeftLeaves {
    public static void main(String[] args) {
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
        t4.left = null;
        t4.right = null;
        Solution s = new Solution();
        int sum = s.sumOfLeftLeaves(t0);
        System.out.println(sum);
    }
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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumPosTraversal(root);
        return sum;
    }

    public void sumPosTraversal(TreeNode node) {
        if (node == null) return;
        if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            } else {
                sumPosTraversal(node.left);
            }
        }
        if (node.right != null) {
            // 是非左叶子结点
            if(node.right.left == null && node.right.right == null) {
                return;
            } else {
                sumPosTraversal(node.right);
            }
        }
    }
}