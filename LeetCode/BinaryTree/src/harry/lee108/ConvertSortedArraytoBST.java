package harry.lee108;

public class ConvertSortedArraytoBST {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println((a + b) / 2);
    }
}

class TreeNode{
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
    public TreeNode sortedArrayToBST(int[] nums) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;
        return inOrderConstructor(nums, left_pointer, right_pointer);
    }

    public TreeNode inOrderConstructor(int[] nums, int left, int right) {
        if (left == right) {
            return new TreeNode(nums[left]);
        } else if (left > right) {
            return null;
        } else {
            int middle = (left + right) / 2;
            TreeNode cur_node = new TreeNode(nums[middle]);
            cur_node.left = inOrderConstructor(nums, left, middle - 1);
            cur_node.right = inOrderConstructor(nums, middle + 1, right);
            return cur_node;
        }
    }
}