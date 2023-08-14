#include <iostream>
#include <set>
#include <vector>

int main () {
    std::set<int> s;
    s.insert(5);
    s.insert(1);
    s.insert(2);
    s.insert(0);
    s.insert(3);

    std::set<int> t;
    t.insert(5);
    t.insert(5);
    t.insert(2);
 
    // std::cout << s.size() << std::endl;
    std::vector<int> return_array;
    
    for (auto i : s) {
        if (t.find(i) != t.end()) {
            return_array.push_back(i);
        }
    }

    for (auto j : return_array) {
        std::cout << j << std::endl;
    }

    return (0);
}