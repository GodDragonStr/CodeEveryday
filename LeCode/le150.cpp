// 逆波兰表达式求值
#include <vector>
#include <string>
#include <array>
#include <iostream>
#include <stack>
#include <unordered_map>
#include <cmath>

using namespace std;

class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> calculate;
        unordered_map<string, char> search = {{"+", '+'},{"-", '-'},{"*", '*'},{"/", '/'}};
        // unordered_map<string, int> num = {{"0", 0},{"1", 1},{"2", 2},{"3", 3},{"4", 4},{"5", 5},{"6", 6},{"7", 7},{"8", 8},{"9", 9}};

        for (auto a : tokens) {
            if (search.find(a) != search.end()) {
                int x1 = calculate.top();
                calculate.pop();
                int x2 = calculate.top();
                calculate.pop();

                if (search[a] == '+') calculate.push(x2 + x1);
                if (search[a] == '-') calculate.push(x2 - x1);
                if (search[a] == '*') calculate.push(x2 * x1);
                if (search[a] == '/') calculate.push(x2 / x1);
            }
            else {
                int n = 0;
                int weight = a.size() - 1;
                bool sign = true;

                for (auto c : a) {
                    if (c == '-') {
                        sign = false;
                        weight--;
                        continue;
                    }
                    n += (c - '0') * pow(10, weight--);
                }
                
                if (!sign) n = -n;

                calculate.push(n);
            }
        }

        return calculate.top();
    }
};

class Solution2 {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> calculate;
        for (auto a : tokens) {
            if (a == "+" || a == "-" || a == "*" || a == "/") {
                int x1 = calculate.top();
                calculate.pop();
                int x2 = calculate.top();
                calculate.pop();

                if (a == "+") calculate.push(x2 + x1);
                else if (a == "-") calculate.push(x2 - x1);
                else if (a == "*") calculate.push(x2 * x1);
                else if (a == "/") calculate.push(x2 / x1);
            }
            else {
                int n = 0;
                for (auto c : a) {
                    if (c == '-') 
                        continue;
    
                    n = n * 10 + (c - '0');
                }
                if (a[0] == '-') n = -n;
                // atoi(token.c_str())
                calculate.push(n);
            }
        }

        return calculate.top();
    }
};


int main () {
    char a = 'a';
    string b = "1fasdfasdfasf";



    cout << a - 'a' << endl;

    return (0);
}