package harry.binaryTree;

import java.util.*;

class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);

        return result;
    }

    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

}

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);

        return result;
    }

    public void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}

class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        postorder(root, result);

        return result;
    }

    public void postorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}

// 中左右
// 先用指针指向栈中最顶层的节点
//
class PreorderInterationTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode currNode = root;
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            currNode = treeNodes.peek();
            if (currNode != null) {
                result.add(currNode.val);
                treeNodes.pop();
                if (currNode.right != null) {
                    treeNodes.push(currNode.right);
                }
                if (currNode.left != null) {
                    treeNodes.push(currNode.left);
                }
            }
        }
        return result;
    }
}


class InorderIterationTraversal {
    public List<Integer> iorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        TreeNode currNode = root;

        while (currNode!= null || !treeNodes.isEmpty()) {
            if (currNode != null) {
                treeNodes.push(currNode);
                if (currNode.left != null) {
                    currNode = currNode.left;
                } else {
                    currNode = treeNodes.peek();
                    result.add(currNode.val);
                    treeNodes.pop();
                    currNode = currNode.right;
                }

            } else {
                currNode = treeNodes.peek();
                result.add(currNode.val);
                treeNodes.pop();
                currNode = currNode.right;
            }
        }
        return result;
    }
}


// 左右中 = 中右左的反向输出


class PostorderIterationTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode currNode = root;
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        treeNodes.push(root);

        while (!treeNodes.isEmpty()) {
            currNode = treeNodes.peek();
            if (currNode != null) {
                result.add(currNode.val);
                treeNodes.pop();
            }
            if (currNode.left != null) {
                treeNodes.push(currNode.left);
            }
            if (currNode.right != null) {
                treeNodes.push(currNode.right);
            }
        }

        return result.reversed();
    }
}

class SequenceTraversal {
    public static List<Integer> sequenceTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> treeNodes = new LinkedList<TreeNode>();
        treeNodes.add(root);
        TreeNode currNode = new TreeNode();

        while (!treeNodes.isEmpty()) {
            currNode = treeNodes.peek();
            result.add(currNode.val);
            treeNodes.poll();

            if (currNode.left != null) {
                treeNodes.add(currNode.left);
            }

            if (currNode.right != null) {
                treeNodes.add(currNode.right);
            }
        }

        return result;
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // 每次循环存储下一层树的根节点
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        Queue<TreeNode> currTreeNodes = new LinkedList<TreeNode>();
        currTreeNodes.add(root);
        TreeNode currNode = new TreeNode();

        while (!currTreeNodes.isEmpty()) {
            Queue<TreeNode> newCurrTreeNodes = new LinkedList<TreeNode>();
            List<Integer> result = new ArrayList<Integer>();
            while (!currTreeNodes.isEmpty()) {
                currNode = currTreeNodes.remove();
                System.out.println("currTreeNodes " + currTreeNodes.size());
                System.out.println("currNode.val " + currNode.val);
                result.add(currNode.val);
                if (currNode.left != null) {
                    newCurrTreeNodes.add(currNode.left);
                }
                if (currNode.right != null) {
                    newCurrTreeNodes.add(currNode.right);
                }
            }
            System.out.println("newCurrTreeNodes " + newCurrTreeNodes.size());
            currTreeNodes = newCurrTreeNodes;
            System.out.println("currTreeNodes " + currTreeNodes.isEmpty());
            if (currTreeNodes.isEmpty()) {
                System.out.println("该结束了");
            }

            results.add(result);
        }

        return results;
    }

    public static void DFS(TreeNode curNode, int depth, List<List<Integer>> results) {
        if (curNode == null) {
            return;
        }
        depth++;
        if (results.size() < depth) {
            List<Integer> line = new ArrayList<Integer>();
            results.add(line);
        }
        results.get(depth - 1).add(curNode.val);

        DFS(curNode.left, depth, results);
        DFS(curNode.right, depth, results);
    }

}

class InvertBinaryTree {
    public static void invertBinaryTree(TreeNode currNode) {
        if (currNode == null) return;
        swapChildren(currNode);
        invertBinaryTree(currNode.left);
        invertBinaryTree(currNode.right);
    }

    public static void swapChildren(TreeNode currNode) {
        TreeNode temp = currNode.left;
        currNode.left = currNode.right;
        currNode.right = temp;
    }
}