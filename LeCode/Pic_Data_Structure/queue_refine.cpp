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

typedef struct node {
    int value = 0;
    node *next = NULL;
    node(int x): value(x), next(NULL) {}
}Node, *Link;

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

    node h(1);
    Node h1(1);

    node *b;
    Link b1;
    node *b2 = (Node *)malloc(sizeof(Node)); // malloc返回一个空间给Node *
    node *b3 = (Node *)malloc(sizeof(Link));

    node a = node(1);
    node a1 = Node(1);
    node *a2 = Link(1);
    node *a3 = new Node(1); // new本来就是返回的一个指针
    node a4(a1);

    Node c = Node(1);
    Node *d = new Node(1);  // 初始化了
    Node *e = (Link)malloc(sizeof(Node));   // 没有初始化
    // Link == Node *
    Link g = new Node(1);   // 初始化了
    Link f = (Link)malloc(sizeof(Node));    // 没有初始化

    std::cout << a.value << std::endl;

    return (0);
}