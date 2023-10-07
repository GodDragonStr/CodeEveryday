#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode(int val): val(val), left(nullptr), right(nullptr) {};
};

// 中序遍历：左中右
class Solution {
    vector<int> recursive(TreeNode *root) {
        vector<int> result;
        stack<TreeNode*> stk;
        TreeNode *node = root;

        while(node != NULL || !stk.empty()) {
            while(node != NULL) {
                // 添加左节点
                stk.push(node);
                node = node->left;
            }

            node = stk.top();
            result.push_back(node->val);
            stk.pop();

            // 添加中间节点
            if (!stk.empty()) {
                node = stk.top();
                stk.pop();
                result.push_back(node->val);
            }

            // 添加右节点
            node = node->right;

         }
        
        return result;
    }

};

int main () {


    return (0);
}