#include <iostream>

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
    ListNode(int val): val(val), next(nullptr) {}
    ListNode(int val, ListNode *next): val(val), next(next) {}
};

class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode *_dummyHead = new ListNode(0, head);
        ListNode *moveNode = _dummyHead;

        while ((moveNode->next != NULL) && (moveNode->next->next != NULL)) {
            ListNode *tempNode = moveNode->next->next;
            moveNode->next->next = tempNode->next;
            tempNode->next = moveNode->next;
            moveNode->next = tempNode;
            moveNode = moveNode->next->next;

            delete tempNode;
        }

        return _dummyHead->next;
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

    Solution my_func;
    ListNode *new_head = my_func.swapPairs(a1);

    return (0);
}