// 有效括号
#include <iostream>
#include <stack>
#include <string>
#include <cmath>
#include <unordered_map>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        // int size = s.size();
        // int roundBracket[2];
        // int suqareBracket[2];
        // int curlyBracket[2];
        unordered_map<char, int> mem;

        deleteS(s);

        for (int i = 0; i < s.size(); ++i) {
            if (i + 1 < s.size()) 
                if (!this->checkNext(s[i], s[i+1])) 
                    return false;

            mem[s[i]]++;

            if (!this->checkNum(mem))
                return false;
        }
    
        if (mem['['] == mem[']'] && mem['('] == mem[')'] && mem['{'] == mem['}'])
            return true;
        else 
            return false;
    }

    bool checkNext (char c, char cNext) {
        if (c=='(') 
            if (cNext == ']' || cNext == '}')
                return false;
        
        if (c=='[')
            if (cNext == ')' || cNext == '}')
                return false;

        if (c=='{')
            if (cNext == ']' || cNext == ')')
                return false;

        return true;
    }

    bool checkNum (unordered_map<char, int> mem) {
        if (mem['['] < mem[']'] || mem['{'] < mem['}'] || mem['('] < mem[')'])
            return false;

        return true;
    }

    void deleteS (string& s) {
        int times = s.size() / 2;
        string sNew;
        for (int t = 0; t < times; ++ t){

            for (int i = 0; i < s.size(); ++i) {
                if (i + 1 < s.size() && (s[i+1] - s[i] <= 2) ) {
                    ++i;
                    continue;
                }
                sNew + s[i];
            }
            if (s.size() == sNew.size())
                break;
            s = sNew;
        }
    }
};


class Solution2 {
public:
    bool isValid(string s) {
        stack<char> com;
        for (auto c : s) {
            if (c == '(' || c == '[' || c == '{') {
                if (c == '(') com.push(')');
                if (c == '[') com.push(']');
                if (c == '{') com.push('}');
            }
            else {
                if (com.empty()) 
                    return false;
                else {
                    if (c == com.top()) 
                        com.pop();
                    else 
                        return false;
                }
            }
        }

        if (com.empty()) return true;
        else return false;
    }
};


class Solution3 {
public:
    bool isValid(string s) {
        if(s.size() & 1) return false;

        stack<char> com;
        for (auto c : s) {
            if (c == '(' || c == '[' || c == '{') {
                com.push(c);
            }
            else {
                if (com.empty()) 
                    return false;
                else {
                    if (abs(c - com.top()) < 3) 
                        com.pop();
                    else 
                        return false;
                }
            }
        }

        // if (com.empty()) return true;
        // else return false;

        return com.empty() ? true : false;
    }
};





int main () {

    char a = '[';
    char b = a + 2;

    unordered_map<char, int> mem;

    mem[a]++;
    mem[a]++;

    cout << b << endl;

    cout << (int)b << endl;

    cout << mem['['] << endl;

    for (int i = 0; i < 10; ++i) {
        if ( i == 3) {
            i++;
            continue;
        }
        cout << i << endl;
    }

    stack<char> myStack;
    // cout << myStack.top() << endl;
    myStack.pop();
    int num = 0;

    1 ? num++ : num--;
    cout << num << endl;


    return (0);
}