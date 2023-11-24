package harry.binaryTree;

import java.util.List;
import java.util.ArrayList;
public class TreeTraversalDemo3 {
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

        InvertBinaryTree.invertBinaryTree(treeTest1);
        System.out.println("Invert Binary Successfully!!!");


        List<Integer> testList1 = new ArrayList<Integer>();
        testList1.add(null);

        List<Integer> testList2 = new ArrayList<Integer>();
        testList2.add(null);

        if (testList1.equals(testList2)) {
            System.out.println("Equals!!!");
        }
    }






}
