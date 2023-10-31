/*初始化列表和构造函数初始化*/ 
#include <iostream>

using namespace std;

class Test1 {
    public:
    int a;
    Test1 () {
        cout << "constructor for Test1" << endl;
    }
    Test1 (Test1& t1) {
        cout << "copy constructor for Test1" << endl;
        this->a = t1.a;
    }
    Test1& operator = (const Test1& t1) {
        cout << "assignment for Test1" << endl;
        if (&t1 == this) {
            return *this;
        }
        this->a = t1.a;
        return *this;
    }
};


class Test2 {
    public:
    Test1 t;
    // construction function initialization 

    // 因为在
    // Test2 (Test1& t1) {
    //     t = t1;
    // }

    Test2 (Test1& t1) {
        t = t1;
    }

    // initialization list
    // Test2 (Test1& t1): t(t1) {};

    // Test2 (Test1& t1): t(t1) {
    //     t = t1;
    // };
};


int main () {
    Test1 t1;
    Test2 t2(t1);

    return 0;
}