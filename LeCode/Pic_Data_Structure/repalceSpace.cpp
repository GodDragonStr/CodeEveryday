#include "iostream"
#include "string"
#include "typeinfo"

using namespace std;

// 思路一： 创建一个新的string，进行一次遍历返回新的字符串，即牺牲空间换取时间
class Solution{
    public:
    string replacePlace(string s){
        string s_new;
        for ( auto character:s) {
            if(character == ' '){
                s_new += "%20";
            }
            else{
                s_new += character;
            }
            // cout << typeid(character).name() << endl;
            // cout << character << endl;
        }
        return s_new;
    }
    string copyString(string s){
        return s;
    }
};

// 思路二： 将其看做原地题
class Solution1{
    public:
    string replaceSpace(string s){
        int count = 0, len = s.size();

        // cout << s.size() << endl;

        for ( auto character : s ) {
            if(character == ' '){
                count++;
            }
        }
        s.resize(len + 2*count);

        // cout << s.size() << endl;

        // if s[i] == ' ', then s[i] = %, s[i+1] = 2, s[i+2] = 0
        for (int i = len - 1, j = s.size() - 1; i < j; i--, j--) {
            if (s[i] != ' ') {
                s[j] = s[i];
            }
            else{
                s[j] = '0';
                s[j-1] = '2';
                s[j-2] = '%';
                j -= 2;
            }
        }
        return s;
    }
};

int main(){
    
    string s_tem;
    string s_new;
    Solution replace;

    string s1_tem;
    string s1_new;
    Solution1 replace1;

    // this >> will stop reading when it encounters a space or newlinw character
    // cin >> s_tem;
 
    cout << "method1: please enter a string" << endl;
    cin;
    getline(cin, s_tem);

    cout << "s_tem: " << s_tem << endl;
    s_new = replace.replacePlace(s_tem);
    cout << "s_new: " << s_new << endl;

    cout << "methode2: please enter a string" << endl;
    cin;
    getline(cin, s1_tem);
    s1_new = replace1.replaceSpace(s1_tem);

    cout << s1_new << endl;

    return 0;
}