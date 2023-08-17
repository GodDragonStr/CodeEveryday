#include <map>
#include <set>
#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>

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
    // map<int, int> word_count{{1,10},{2,20},{5,50}}; // string到size_t的空map
    // cout << word_count[1] << endl;
    // word_count[1] = 30;
    // cout << word_count[1] << endl;
    // multimap<int, int> multi_word_count{{1,10},{1,20},{5,50}};
    // // multi map 的返回值
    

    // cout << multi_word_count.find(1)->first << endl;
    // cout << multi_word_count.find(1)->second << endl;

    unordered_map<int, vector<vector<int>>> mem;
    for (auto a : mem[1]) {
    cout << "print" << endl;

    }
    mem[1].push_back({11, 22});
    mem[1].push_back({11, 22});
    mem[1].push_back({33, 44});
    // for (auto a : mem[1]) {
    //     cout << "print" << endl;
    //     cout << a[0] << " " << a[1] << endl;
    // }

    set<vector<int>> result;
    vector<int> a = {1,2};
    vector<int> b = {2,1};

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    // result.insert({1,2});
    // result.insert({2,1});
    result.insert(a);
    result.insert(a);
    result.insert(b);

    cout << result.size() << endl;

    vector<vector<int>> d(result.begin(), result.end());



}


