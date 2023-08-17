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

class Solution2 {
public:
    string reverseWords(string s) {
        // 去除多余空格
        int slow = 0, fast = 0;
        while(fast < s.size()) {
            if (s[fast] == ' ' && fast + 1 < s.size() && s[fast + 1] == ' ') {
                fast++;
                continue;
            }

            s[slow++] = s[fast++];
        }

        if (s[slow - 1] == ' ') s.erase(s.begin() + - 1 + slow-- );
        if (s[0] == ' ') {
            s.erase(s.begin());
            slow--;
        }

        // 反转整个字符串
        s.resize(slow);
        reverse(s.begin(), s.end());

        cout << s << endl;

        slow = 0;
        fast = 0;
        // 反转字符串里面的单词
        while (fast < s.size()) {
            if (s[fast] == ' ') {
                reverse(s.begin() + slow, s.begin() + fast);
                slow = ++fast;
            }

            fast++;
        }

        reverse(s.begin() + slow, s.begin() + fast);


        return s;
    }
};

int main () {
    Solution2 myfunc;
    string a = "  my am  you  ";
    string b = myfunc.reverseWords(a);
    
    // swap(*a.begin(), *(a.begin()+1));
    cout << b << endl;

    return (0);
}