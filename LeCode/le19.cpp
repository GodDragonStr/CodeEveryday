class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *_dummyHead = new ListNode(0, head);
        ListNode *slowNode = _dummyHead, *fastNode = _dummyHead;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode->next;
        }

        while (fastNode->next != nullptr){
            fastNode = fastNode->next;
            slowNode = slowNode->next;
        }
        
        slowNode->next = slowNode->next->next;

        return _dummyHead->next;
    }
};