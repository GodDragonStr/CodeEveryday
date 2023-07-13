#include "iostream"
#include "vector"

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x): val(x), next(NULL) {}
};

// class Solution {
//     public:
//     vector<int> reversePrint(ListNode* head) {
//         // find the len of list
//         ListNode *tem_0 = head;
//         int len = 1;
//         while (tem_0 != NULL){
//             tem_0 = tem_0->next;
//             len++;
//         }
    
//         vector<int> reverseLink(len);
    
//         // the last .next = NULL
//         ListNode *tem_1 = NULL, *reverse_point = head;
//         // storage the element step by step
//         for (int i = 0; i < len; i++) {    
//             reverse_point = head;
//             while (1) {
//                 if ( reverse_point->next == tem_1) {
//                     reverseLink[i] = reverse_point->val;
//                     tem_1 = reverse_point;
//                     break;
//                 }
//                 else {
//                     reverse_point = reverse_point->next;
//                 }
//             }    
//         }

//         return (reverseLink);
//     };
// };

class Solution {
public:
    vector<int> reversePrint(ListNode* head) {
        // find the len of list
        ListNode *tem_0 = head;
        if (tem_0 == NULL){
            vector<int> empty_link;
            return empty_link;
        }

        int len = 1;
        while (tem_0->next != NULL) {
            tem_0 = tem_0->next;
            len++;
        }
        vector<int> reverseLink(len);
        ListNode *move_point = head;
        for (int i = 0; i < len; i++) {
            move_point = head;
            while (1) {
                if (move_point == tem_0) {
                    reverseLink[i] = tem_0->val;
                    break;
                }
                else {
                     if (move_point->next == tem_0) {
                        reverseLink[i] = tem_0->val;
                        tem_0 = move_point;
                        break;
                    }
                    else {
                        move_point = move_point->next;
                    }
                }
            }
        }
        return (reverseLink);
    };
};


int main(){
    ListNode a1 = ListNode(1);
    ListNode a2 = ListNode(3);
    ListNode a3 = ListNode(2);
    ListNode a4 = ListNode(2);

    // a1.next = &a2;
    // a2.next = &a3;
    // a3.next = &a4;

    vector<int> reverse_link;
    Solution reverse_method;
    reverse_link = reverse_method.reversePrint(&a1);
    for (auto a : reverse_link) {
        cout << a << endl;
    }

    return 0;
}