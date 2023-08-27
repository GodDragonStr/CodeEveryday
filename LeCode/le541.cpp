// 反转字符串||

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main () {
    int i[] = {1, 10};
    int j[] = {1, 10};
    // i++ ^= j++ ^= i ^= j;
    // i ^= j;
    int a = 0;
    int b = 1;

    // i[a++] ^= i[b--] ^= i[a] ^= i[b];
    i[a] ^= i[b] ^= i[a++] ^= i[b--];

    cout << i[0] << " " << i[1] << endl;
    cout << a << " " << b << endl;
    return 0;
}