#include "iostream"
#include "string"
#include "typeinfo"

using namespace std;

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
            cout << typeid(character).name() << endl;
            cout << character << endl;
        }
        return s_new;
    }
    string copyString(string s){
        return s;
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