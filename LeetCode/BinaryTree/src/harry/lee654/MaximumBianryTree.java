package harry.lee654;

import com.sun.source.tree.Tree;

import java.util.HashMap;

public class MaximumBianryTree {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        Solution mySol = new Solution();
        TreeNode root = mySol.constructMaximumBinaryTree(nums);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }

}

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode() {}

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
    // 做一个类变量
    HashMap<Integer, Integer> classNums = new HashMap<>();
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        initialization(nums);
        return preOrderTraversal(0, nums.length - 1);
    }

    public TreeNode preOrderTraversal (int left, int right) {
        if (left > right) {
            return null;
        } else {
            int divideIndex = getMaxIndex(left, right);
            TreeNode root = new TreeNode(this.classNums.get(divideIndex));

            root.left = (divideIndex != left) ? preOrderTraversal(left, divideIndex - 1) : null;
            root.right = (divideIndex != right) ? preOrderTraversal(divideIndex + 1, right) : null;

            return root;
        }
    }

    // 初始化类数组
    public void initialization(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.classNums.put(i, nums[i]);
        }
    }

    // 获取最大元素
    public int getMaxIndex (int left, int right) {
        int index = left;
        int temp = this.classNums.get(left);

        for (int i = left; i <= right; i++) {
            if (this.classNums.get(i) > temp) {
                temp = this.classNums.get(i);
                index = i;
            }
        }
        return index;
    }
}