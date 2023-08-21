// 删除字符串中的所有相邻重复项

#include <iostream>
#include <string>
#include <stack>
#include <queue>

using namespace std;


class Solution {
public:
    string removeDuplicates(string s) {
        string mem;
        for (auto c : s) {
            if (mem.empty()) {
                mem.push_back(c);
            }
            else {
                if (mem[mem.size() - 1] == c)
                    mem.pop_back();
                else 
                    mem.push_back(c);
            }
        }

        return mem;
    }
};


class Solution1 {
public:
    string removeDuplicates(string s) {
        string mem;
        
        for (auto c : s) {
            if (mem.empty()) {
                mem += c;   // string使用+号比push更快
            }
            else {
                if (mem[mem.size() - 1] == c)
                    mem.pop_back();
                else 
                    mem += c;
            }
        }

        return mem;
    }
};



int main () {
    string test = "abbacacb";
    Solution mySoltion;
    string newTest = mySoltion.removeDuplicates(test);
    queue<char, string> a{"aaaa"}; 
  

    cout << newTest << endl;

    return (0);
}