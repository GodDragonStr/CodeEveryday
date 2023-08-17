#include <iostream>
#include <string>

using namespace std;

int main () {

    string s;
    string s_cat;
    cout << "Please input string:" << endl;

    while (getline(cin, s)) {
        s_cat += s + ' ';
    }

    cout << s_cat << endl;

    return (0);
} 