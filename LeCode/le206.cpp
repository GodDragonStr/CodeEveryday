#include <iostream>

  struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
 };
 
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *move_node = head;
        ListNode *reverse_node = new ListNode(0, nullptr);
        bool first_node = true;
        if (head == nullptr) return head;

        while (move_node->next != nullptr) {
            ListNode *tem_node = new ListNode(0, nullptr);
            tem_node = move_node;
            move_node = move_node->next;
            // reverse_node->next == nullptr
            if (first_node) {
                tem_node->next = reverse_node->next;
                first_node = false;
            }
            else tem_node->next = reverse_node;
            reverse_node = tem_node;
        }

        move_node->next = reverse_node;

        return move_node;
    }
};

int main () {
    ListNode *a1 = new ListNode(1);
    ListNode *a2 = new ListNode(2);
    ListNode *a3 = new ListNode(3);
    ListNode *a4 = new ListNode(4);

    a1->next = a2;
    a2->next = a3;
    a3->next = a4;

    Solution my_reverseList;

    ListNode *reverse_head = my_reverseList.reverseList(a1);
}