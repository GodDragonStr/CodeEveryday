#include "iostream"
#include "string"
#include "typeinfo"

using namespace std;

// 思路一： 创建一个新的string，进行一次遍历返回新的字符串，即牺牲空间换取时间
class Solution{
    public:
    string replacePlace(string s){
        string s_new;
        for( auto character:s){
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
        // int len = s.size();
        for( auto character : s ){
            if(character == ' '){
                count++;
            }
        }
        s.resize(len + 2*count);
        cout << s.size() << endl;
        
    }
};



int main(){
    
    string s_tem;
    string s_new;
    Solution replace;

    // this >> will stop reading when it encounters a space or newlinw character
    // cin >> s_tem;
 
    cout << "please enter a string" << endl;
    cin;

    getline(cin, s_tem);
    cout << "s_tem: " << s_tem << endl;
    s_new = replace.replacePlace(s_tem);
    cout << "s_new: " << s_new << endl;



 
    return 0;
}