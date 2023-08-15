#include <iostream>

using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        int record[26] = {};

        for (int i = 0; i < s.size(); i++) {
            record[s[i] - 'a']++;
        }
        for (int j = 0; j < t.size(); j++) {
            record[t[j] - 'a']++;
        }

        for (auto character : record) {
            if (character != 0) return false;
        }

        return true;
    }
};

int main () {
    int a = 0;
    int& b = a;
    cout << b << endl;

    return (0);
}