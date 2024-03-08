package harry.lee110;

import java.util.Stack;

import static java.lang.Math.abs;
import static java.lang.Math.max;


public class AVLTree {
    public static void main(String args[]) {
//        测试用例
       TreeNode t0 = new TreeNode(1);
       TreeNode t1 = new TreeNode(2);
       TreeNode t2 = new TreeNode(2);
       TreeNode t3 = new TreeNode(3);
       TreeNode t4 = new TreeNode(3);
       TreeNode t5 = new TreeNode(4);
       TreeNode t6 = new TreeNode(4);
        t0.left = t1;
        t0.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.right = null;
        t2.left = null;
        t3.left = t5;
        t3.right = t6;
        t4.left = null;
        t4.right = null;
        t5.left = null;
        t5.right = null;
        t6.right = null;
        t6.left = null;

       TreeNode f0 = new TreeNode(3);
       TreeNode f1 = new TreeNode(9);
       TreeNode f2 = new TreeNode(20);
       TreeNode f3 = new TreeNode(15);
       TreeNode f4 = new TreeNode(7);
        f0.left = f1;
        f0.right = f2;
        f1.left = null;
        f1.right = null;
        f2.left = f3;
        f2.right = f4;
        f3.left = null;
        f4.left = null;
        f4.right = null;


        System.out.println(Solution.isBalanced(t0));
        System.out.println(Solution.isBalanced(f0));

    }


}

// Definition for a binary tree node.
class TreeNode {
    int val;
   TreeNode left;
   TreeNode right;

    TreeNode() {
    }

    ;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public static boolean isBalanced(TreeNode root) {
        // 平衡二叉树使用层次遍历
        // 如果遍历到本层不满足2^(n-1)，下一层也存在node必然是非平衡二叉树
//        List<List<TreeNode>> listNode = new ArrayList<List<TreeNode>>();
//        ArrayList<TreeNode> t1  = new ArrayList<TreeNode>();
//        ArrayList<TreeNode> t2  = new ArrayList<TreeNode>();
//        ArrayList<TreeNode> t3  = new ArrayList<TreeNode>();
//
//        t1.add(new TreeNode(1));
//        t1.add(new TreeNode(1));
//        t1.add(new TreeNode(1));
//        t2.add(new TreeNode(2));
//        t2.add(new TreeNode(2));
//        t3.add(new TreeNode(3));
//
//        listNode.add(t1);
//        listNode.add(t2);
//        listNode.add(t3);
//
//        System.out.println(listNode.get(0));
//        System.out.println(listNode.size());
//        System.out.println(listNode.get(1).size());

        if (Solution.posTraversal(root) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static int posTraversal(TreeNode currNode) {
        if (currNode == null) {
            return 0;
        }

        int leftTreeHight = 0;
        int rightTreeHeight = 0;

        if (currNode.left != null) {
            leftTreeHight = posTraversal(currNode.left);
            if (leftTreeHight == -1) {
                return -1;
            }
        }

        if (currNode.right != null) {
            rightTreeHeight = posTraversal(currNode.right);
            if (rightTreeHeight == -1) {
                return -1;
            }
        }

        return abs(leftTreeHight - rightTreeHeight) > 1 ? -1 : max(leftTreeHight, rightTreeHeight) + 1;
    }

    public static int getHeightIter(TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        int result = 1;
        int deep = 1;
        // 用栈模拟递归
        // 用后续遍历：左右中---栈的方式--->中右左
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(curr);
        // 遍历完成后栈变空，每一层使用null作为标记


        while (!nodeStack.isEmpty()) {
            // 左
            if (curr.left != null) {
                nodeStack.push(curr.left);
                curr = curr.left;
                deep++;
                // 右
            } else if (curr.right != null) {
                nodeStack.push(curr.right);

            }


            // 中
        }




        return result;
    }
}