// 用栈实现队列
// 栈是先进后出：top, push_back, pop_back
// 队列是先进先出：push, pop, peek, empty

#include <iostream>
#include <stack>

using namespace std;


class MyQueue {
public:

    stack<int> s1;
    stack<int> s2;

    MyQueue() {
        
    }
    
    void push(int x) {
        s1.push(x);
    }
    
    int pop() {
        int popX;
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.top());
                s1.pop();
            }
        }
        popX = s2.top();
        s2.pop();

        return popX;
    }
    
    int peek() {
        // 这里可以改为复用
        int peekX;

        // peekX = this->pop();
        // s2.push(peekX);
        // return peekX;

        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.top());
                s1.pop();
            }
        }

        peekX = s2.top();

        return peekX;
    }
    
    bool empty() {
        if (s1.empty() && s2.empty()) 
            return true;
        else 
            return false;
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */


int main () {
    MyQueue* obj = new MyQueue();

    return (0);
}