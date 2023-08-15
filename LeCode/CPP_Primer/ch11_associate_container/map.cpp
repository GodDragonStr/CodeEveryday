#include <map>
#include <set>
#include <iostream>
using namespace std;

void myMap() {
    map<string, size_t> word_count; // string到size_t的空map
    string word;
    while (cin >> word)
	    ++word_count[word];
    for (const auto &w : word_count) 
	    // 打印结果
	    cout << w.first << " occurs " << w.second << ((w.second > 1) ? " times." : "time") << endl;
}

void mySet () {
    map<string, size_t> word_count;
    set<string> exclude{"Although, But, and"};
    string word;

    while (cin >> word) {
        if (exclude.find(word) == exclude.end()) {
            ++word_count[word];
        }
    }



}

int main () {
    map<int, int> word_count{{1,10},{2,20},{5,50}}; // string到size_t的空map
    multimap<int, int> multi_word_count{{1,10},{1,20},{5,50}};
    cout << multi_word_count.find(1)->first << endl;
}
