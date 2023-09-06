// 二叉树的前向遍历
// Binary Tree Preorder Traversal
// Given the root of a binary tree, return the preorder traversal of its nodes'values.
#include <iostream>
#include <vector>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int val): val(val), left(nullptr), right(nullptr) {}
};

// recursive
class Solution {
public:
    void traversal (TreeNode *cur, vector<int>& result) {
        // mid left right
        if (cur == NULL) return ;
        traversal(cur->left, result);
        traversal(cur->right, result);
    }

    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        traversal(root, result);

        return result;
    }
};

// iteration
class Solution1 {
public:


    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        return result;
    }
};

int main () {
    Solution mysolution;


    return (0);
}