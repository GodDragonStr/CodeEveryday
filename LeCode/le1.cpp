#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> idx;
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i + 1; j < nums.size(); ++j) {
                if (nums[i] + nums[j] == target) {
                    idx.push_back(i);
                    idx.push_back(j);
                    return idx;
                }
            }
        }

        return idx;
    }
};

class Solution2 {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> maps;

        for (int i = 0; i < nums.size(); ++i) {
            auto iter = maps.find(target - nums[i]);
            if (iter != maps.end()) {
                return {i, iter->second};
            }
            maps.insert(pair<int, int>(nums[i], i));
        }

        return {};
    }
};

int main () {

    vector<int> nums{2,7,11,15};
    int target = 9;

    return (0);
}