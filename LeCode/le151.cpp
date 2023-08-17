#include <iostream>
#include <string>
#include <algorithm>
#include <vector>


using namespace std;

class Solution {
public:
    string reverseWords(string s) {
        vector<string> mem;
        string tem;

        for (int i = 0; i < s.size(); ++i) {
            if (s[i] == ' ' && i + 1 < s.size() && s[i+1] == ' ') {
                continue;
            }
            else if(s[i] == ' ') {
                if (!tem.empty()) mem.push_back(tem);
                tem = "";
            }
            else tem += s[i];
        }


        mem.push_back(tem);
        tem = "";

        // for (auto word : mem) {
        //     cout << word << endl;
        // }

        for (int i = mem.size() - 1; i >= 0; --i) {
            if (tem.empty()) tem += mem[i];
            else tem += ' ' + mem[i];
        }

        return tem;
    }
};


int main () {
    string a = "my am you";
    swap(*a.begin(), *(a.begin()+1));
    cout << a << endl;

    return (0);
}