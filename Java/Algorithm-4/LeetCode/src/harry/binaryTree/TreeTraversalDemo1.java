package harry.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversalDemo1 {
    public static void main(String[] args) {

        TreeNode treeTest1 = new TreeNode(1);
        TreeNode treeTest2 = new TreeNode(2);
        TreeNode treeTest3 = new TreeNode(3);
        TreeNode treeTest4 = new TreeNode(4);
        TreeNode treeTest5 = new TreeNode(5);
        TreeNode treeTest6 = new TreeNode(6);
        treeTest1.left = treeTest2;
        treeTest1.right = treeTest3;
        treeTest2.left = treeTest4;
        treeTest2.right = treeTest5;
        treeTest5.right = treeTest6;

        PreorderInterationTraversal solution1 = new PreorderInterationTraversal();
        List<Integer> result1 = solution1.preorderTraversal(treeTest1);

        InorderIterationTraversal solution2 = new InorderIterationTraversal();
        List<Integer> result2 = solution2.iorderTraversal(treeTest1);

        PostorderIterationTraversal solution3 = new PostorderIterationTraversal();
        List<Integer> result3 = solution3.postorderTraversal(treeTest1);

        List<Integer> result4 = SequenceTraversal.sequenceTraversal(treeTest1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        List<List<Integer>> results1 = SequenceTraversal.levelOrder(treeTest1);
        List<List<Integer>> results2 = new ArrayList<>();
        SequenceTraversal.DFS(treeTest1, 0, results2);
        System.out.println(results2);
    }
}
