#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int compareString (string mainS, string subS) {
    for (int i = 0; i < mainS.size(); ++i) {
        for (int j = 0; j < subS.size(); ++j) {
            if (i + j >= mainS.size() || mainS[i + j] != subS[j])   // 如果越界或者有一个不匹配跳出本次查找
                break;
            if (j == subS.size() - 1)                               // 如果每个都能匹配则找到了
                return i;
        }
    }

    return -1;
}

int main () {

    string mainS = "today and yesterday";
    string subS = "yes";

    cout << compareString(mainS, subS) << endl;

    int i = 0;
    // while (mainS[i] != '\0') {
    //     i++;
    //     cout << mainS[i];
    // }
    if (compareString(mainS, subS) != -1) {
        cout << mainS << endl;
        while (i++ != compareString(mainS, subS)) cout << ' ';
        cout << subS << endl;
    }
        
    return (0);
}