#include "iostream"
#include <vector>

// vector should be declared before using
using std::vector;


struct LinkNode1{
    int value;
    LinkNode1 *next;
    LinkNode1(int x){
        value = x;
        next = NULL;
    }
};

struct LinkNode2{
    int value;
    LinkNode2 *next;
    LinkNode2(int x): value(x), next(NULL){}
};

int main(){
    std::cout << "Hello world" << std::endl;
    vector<int> array{1, 2, 3};
    array = {1, 2, 3, 4};
    for(auto a : array){
        std::cout << a << std::endl;
    }
    LinkNode1 n1 = LinkNode1(1);
    LinkNode2 n2 = LinkNode2(1);
    std::cout << n1.value << std::endl;
    std::cout << n2.value << std::endl;

    // allocate a address by new
    LinkNode1 * a = new LinkNode1(1);
    LinkNode2 * b = new LinkNode2(2);
    std::cout << "a " << a->value << ", b " << b->value << std::endl;
    // address should use "->"
    a->next = &n1;
    // variant should use "."
    n2.next = b;

    std::cout << (n2.next)->value << std::endl;

    // 如果不对其进行赋值会出现error
    // 因此总结出常用的赋值方式: 1.使用LinkNode a(1)赋值； 2.使用LinkNode a = LinkNode(1)赋值；3.使用LinkNode *a = new LinkNode(1)
    
    LinkNode1 e(5);
    LinkNode1 f(6);

    LinkNode2 c(3);
    LinkNode2 d(4);

    return 0;
}

