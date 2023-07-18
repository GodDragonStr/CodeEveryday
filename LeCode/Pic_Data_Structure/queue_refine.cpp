#include <iostream>
#include <stack>
#include <list>
class CQueue {
private:
    std::stack<int> stk1,stk2;
public:
    CQueue() {
        // do something for initialization
    }
    void appendTail(int value) {
        stk1.push(value);
    }
    int deleteHead() {
        if (stk2.empty()) {
            if (stk1.empty()) {
                return (-1);
            }
            else {
                while (!stk1.empty()) {
                    stk2.push(stk1.top());
                    stk1.pop();
                }
            }
        }
        int del_return = stk2.top();
        stk2.pop();
        return del_return;
    }
};


int main() {
    std::list<int> list_initial {1, 2, 3};    // 创建stack堆栈时不能通过列表初始化即 -----xxxx---stack<int> values {1,2}----xxxxxx----
    std::stack<int, std::list<int>> values (list_initial);  // 因此只能通过容器初始化，只要堆栈底层类型和这个容器类型相同，比如这里都是int类型
    std::cout << values.top() << std::endl;
    CQueue my_queue;
    my_queue.appendTail(1);
    my_queue.appendTail(2);
    my_queue.appendTail(3);
    my_queue.appendTail(4);
    int test1 = my_queue.deleteHead();

    int test2 = my_queue.deleteHead();
    std::cout << "test:" << test1 << std::endl;

    return (0);
}