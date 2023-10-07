#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

void hanoi(int n, char a, char b, char c) {
    if (n == 1) {
        cout << a << "->" << c << endl;
        return ;
    }
    if (n == 2) {
        cout << a << "->" << b << endl;
        cout << a << "->" << c << endl;
        cout << b << "->" << c << endl;
        return ;
    }
    hanoi(n - 1, a, c, b);
    cout << a << "->" << c << endl;
    hanoi(n - 1, b, a, c);
}


int main () {

    hanoi(3, 'a', 'b', 'c');

    return (0);
}