// 用队列实现栈操作

#include <iostream>
#include <queue>

using namespace std;

//  Last In Fisrst Out
class MyStack {
public:

    queue<int> q;

    MyStack() {

    }
    
    void push(int x) {
        q.push(x);
    }
    
    int pop() {
        int result;

        for (int i = 0; i < q.size() - 1; ++i) {
            q.push(q.front());
            q.pop();
        }

        result = q.front();
        q.pop();

        return result;
    }
    
    int top() {
        int result = q.back();

        return result;
    }
    
    bool empty() {
        // if (q.empty()) 
        //     return true;
        // else 
        //     return false;
        
        return q.empty();
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */

int main () {


    return (0);
}