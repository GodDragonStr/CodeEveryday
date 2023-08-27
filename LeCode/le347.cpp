// 前k个高频元素

#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>
#include <map>

using namespace std;


int main () {
    unordered_map<string, int> um = {{"2", 1},
                                        {"1", 2},
                                        {"9", 3}};
    multimap<string, int> um1 = {{"2", 1},
                                        {"1", 2},
                                        {"3", 3}};

    
    // vector<int> sort{um.begin().second, um.end().second};

    // for (auto a : sort) {
    //     cout << a << endl;
    // }

    cout << um1.begin()->second << endl;
    return (0);
}