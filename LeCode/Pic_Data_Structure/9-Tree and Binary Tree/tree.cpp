#include <iostream>
#include <array>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left_node;
    TreeNode *right_node;
    TreeNode(int val): val(val), left_node(nullptr), right_node(nullptr) {}
    TreeNode(int val, TreeNode *left, TreeNode *right): val(val), left_node(left), right_node(right) {}
};


int main () {
    

    return (0);
}