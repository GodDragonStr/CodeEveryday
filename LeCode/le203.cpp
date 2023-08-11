#include <iostream>
#include <vector>

using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

struct ListNode {
    int val;
    ListNode *next;
    ListNode(): val(0), next(nullptr) {}
    ListNode(int x): val(x), next(nullptr) {}
    ListNode(int x, ListNode *next): val(x), next(next) {}
};

class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode *false_head = new ListNode(0, head);
        ListNode *move_node = false_head;

        while (move_node->next != NULL) {
            if (move_node->next->val == val) {
                ListNode *tem_node = move_node;
                while (!(tem_node->next->val != val || tem_node->next == NULL)) {
                    tem_node = tem_node->next;
                }
                move_node->next = tem_node->next;
            }
            else move_node = move_node->next;
        }

        return false_head->next;
    }
};

int main () {

    // [1,2,6,3,4,5,6]
    ListNode *a1 = new ListNode(1);
    ListNode *a2 = new ListNode(2);
    ListNode *a3 = new ListNode(3);
    ListNode *a4 = new ListNode(4);

    a1->next = a2;
    a2->next = a3;
    a3->next = a4;

    Solution my_removeElements;
    a1 = my_removeElements.removeElements(a1, 2);
    cout << a1->next->val << endl;

    return (0);
}