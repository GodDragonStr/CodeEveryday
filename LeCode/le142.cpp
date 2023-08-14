#include <iostream>
#include <vector>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(): val(0), next(nullptr) {}
    ListNode(int val): val(val), next(nullptr) {}
    ListNode(int val, ListNode *next): val(val), next(next) {}
};


class Solution1 {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *dummyHead = new ListNode(0, head);
        vector<ListNode*> memNode = {nullptr};
        ListNode *curNode = dummyHead;
        while(curNode != nullptr) {
            for (auto node : memNode) {
                if (node == curNode) return curNode;
            }
            memNode.push_back(curNode);
            curNode = curNode->next;
        }

        return nullptr;
    }
};

// 快慢指针
class Solution2 {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *dummyHead = new ListNode(0, head);
        ListNode *fastPoint = dummyHead, *slowPoint = dummyHead;
        int fastStep, slowStep;

        while (slowPoint->next != nullptr && fastPoint->next->next != nullptr) {
            slowPoint = slowPoint->next;
            fastPoint = fastPoint->next->next;
            fastStep += 2;
            slowStep += 1;

            if (fastPoint == slowPoint) {
                // loop exist
                int loopLen = fastStep - slowStep;
                int distance = slowStep;
                ListNode *pos;
                for (int i = 0; i < loopLen; i++) {
                    ListNode *start = dummyHead;
                    int memDistance = 0;
                    while (start != slowPoint) {
                        slowPoint = slowPoint->next;
                        memDistance++;
                    }
                    if (memDistance <= distance) {
                        distance = memDistance;
                        pos = slowPoint;
                    }
                }

                return pos;
            }
        }

        return nullptr;
    }
};

// 快慢指针
class Solution3 {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *dummyHead = new ListNode(0, head);
        ListNode *fastPoint = dummyHead, *slowPoint = dummyHead;
        int fastStep, slowStep;

        while (slowPoint->next != nullptr && fastPoint->next->next != nullptr) {
            slowPoint = slowPoint->next;
            fastPoint = fastPoint->next->next;

            if (fastPoint == slowPoint) {
                // loop exist
  
                ListNode *pos = dummyHead;
                while (pos != slowPoint) {
                    pos = pos->next;
                    slowPoint = slowPoint->next;
                }

                return pos;
            }
        }

        return nullptr;
    }
};



int main() {

    return (0);
}