// 反转字符串

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

class Solution {
public:
    void reverseString(vector<char>& s) {
        int i = 0, j = s.size() - 1;
        while(i <= j) {
            char tem = s[i];
            s[i++] = s[j];
            s[j--] = tem;
        }
    }
};


class Solution1 {
public:
    void reverseString(vector<char>& s) {
        for(int i = 0; i < s.size() / 2; ++i)
            swap(s[i], s[s.size() - 1 - i]);
    }
};

class Solution2 {
public:
    void reverseString(vector<char>& s) {
        reverse(s.begin(), s.end());
    }
};

class Solution3 {
public:
    void reverseString(vector<char>& s) {
        for (int i = 0, j = s.size()-1; i < s.size() / 2; ++i, --j) {
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];

        }
    }
};

int main () {

    string s = "iamai";
    cout << s << endl;
    for (int i = 0, j = s.size() - 1; i < s.size() / 2; ++i, --j) {
        s[i] ^= s[j];
        s[j] ^= s[i];
        s[i] ^= s[j];
    }
    cout << s << endl;

    return (0);
}