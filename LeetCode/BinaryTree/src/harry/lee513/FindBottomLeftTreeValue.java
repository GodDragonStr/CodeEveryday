package harry.lee513;

public class FindBottomLeftTreeValue {
    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(7);

        t0.left = t1;
        t0.right = t2;
        t1.left = t3;
        t1.right = null;
        t2.left = t4;
        t2.right = t5;
        t3.left = null;
        t3.right = null;
        t4.left = t6;
        t4.right = null;
        t5.left  = null;
        t5.right = null;
        t6.left = null;
        t6.right = null;

        Solution myS = new Solution();
        int val = myS.findBottomLeftValue(t0);
        System.out.println(val);
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
    // 本题思路：遍历左节点的优先级要高于遍历右节点的优先级
    // 无论是前中后序遍历都满足这个条件
    // 同意个深度的叶子节点只记录第一次出现的就保证了是最左的叶子节点
    int depthMax = 0;
    int leftBottomVal = 0;

    public int findBottomLeftValue(TreeNode root) {
        preTraversal(root, 1);
        return leftBottomVal;
    }

    public void preTraversal(TreeNode node, int deep) {
        if (node == null) return;
        // mid
        if (node.left == null && node.right == null) {
            if (deep > depthMax) {
                depthMax = deep;
                leftBottomVal = node.val;
            }
        }
        // left
        if (node.left != null) {
            preTraversal(node.left, deep + 1);
        }
        // right
        if (node.right != null) {
            preTraversal(node.right, deep + 1);
        }

    }
}