#include <set>
#include <map>
#include <vector>
#include <unordered_map>
#include <algorithm>

#include <iostream>

using namespace std;

class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        unordered_map<int, set<vector<int>>> mem;
        vector<vector<int>> tem;
        set<vector<int>> result_set;
        int n = nums.size();

        if (nums[0] > 0 || nums[nums.size() - 1] < 0) return tem;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (auto c : mem[target - (nums[i] + nums[j])]) 
                    if (c[0] != i && c[0] != j && c[1] != i && c[1] != j) {
                        vector<int> abcd = {nums[c[0]], nums[c[1]], nums[i], nums[j]};
                        sort(abcd.begin(), abcd.end());
                        result_set.insert(abcd);
                    }
      
                mem[nums[i] + nums[j]].insert({i, j});
            }
        } 
        vector<vector<int>> result(result_set.begin(), result_set.end());

        return result;
    }
};


class Solution1 {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        unordered_map<int, set<vector<int>>> mem;
        vector<vector<int>> tem;
        set<vector<int>> result_set;
        int n = nums.size();

        if (nums[0] > 0 || nums[nums.size() - 1] < 0) return tem;

        for (auto a : nums) {
            for (auto b : nums) {
                for (auto c : mem[target - (a + b)]) {
                    vector<int> abcd = {c[0], c[1], a, b};
                    sort(abcd.begin(), abcd.end());
                    result_set.insert(abcd);
                }

                mem[a + b].insert({a, b});
            }
        } 
        vector<vector<int>> result(result_set.begin(), result_set.end());

        return result;
    }
};

class Solution2 {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> result;
        sort(nums.begin(), nums.end());

        return result;
    }
};

int main () {

    return (0);
}