package harry.lee222;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CompleteTree {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println( (2 << 0) - 1);
    }
}


class TreeNode {
    int val;
    TreeNode left = new TreeNode();
    TreeNode right = new TreeNode();
    TreeNode() {};
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
    public List<List<Integer>> treeLevel = new ArrayList<>();
    public int countNodes(TreeNode root) {

        return getNodeNumRecur(root);
//        return getNodeNumIter(root);
    }

    public int getNodeNumIter(TreeNode node) {
        // 使用队列层序遍历
        int nodeNum = 0;
        if (node == null) {
            return nodeNum;
        } else {
            Queue<TreeNode> nodeQueue = new LinkedList<>();
            nodeQueue.offer(node);
            while (!nodeQueue.isEmpty()) {
                int len = nodeQueue.size();
                nodeNum += len;
                for (int i = 0 ; i < len ; i++) {
                    TreeNode currNode = nodeQueue.poll();
                    if (currNode.left != null) {
                        nodeQueue.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        nodeQueue.offer(currNode.right);
                    }
                }
            }
            return nodeNum;
        }
    }

    public int getNodeNumRecur(TreeNode node) {
        treeLevelRecur(node, 0);
        int countNum = 0;
        for (int i = 0; i < treeLevel.size(); i++) {
            countNum += treeLevel.get(i).size();
        }
        return countNum;
    }

    public void treeLevelRecur(TreeNode node, int depth) {
        if (node == null) return;
        // 前序遍历
        if (depth == treeLevel.size()) {
            treeLevel.add(new ArrayList<Integer>());
        }
        treeLevel.get(depth).add(node.val);

        treeLevelRecur(node.left, depth+1);
        treeLevelRecur(node.right, depth+1);

    }
}