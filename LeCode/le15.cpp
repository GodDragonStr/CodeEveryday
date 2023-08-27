// 三数之和
#include <iostream>
#include <vector>
#include <map>
#include <unordered_map>
#include <algorithm>

using namespace std;

// 双指针
class Solution {
public:
    // 不包含重复的三元组
    vector<vector<int>> threeSum(vector<int>& nums) {
        // 首先进行排序，是为使用双指针创造条件
        sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        

        for (int i = 0; i < nums.size(); ++i) {
            
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.size() - 1;

            while (left < right) {
                if (nums[left] + nums[right] + nums[i] < 0)
                    left++;
                else if (nums[left] + nums[right] + nums[i] > 0)
                    right--;
                else if (nums[left] + nums[right] + nums[i] == 0) {
                    result.push_back({nums[i], nums[left], nums[right]});

                    while (left + 1 < right && nums[left] == nums[left+1])
                        left++;

                    left++;
                }
            }

            while (i + 1 < nums.size() && nums[i] == nums[i+1]) i++;
        }

        return result;
    }
};

// 哈希表
class Solution1 {
public:
    // 不包含重复的三元组
    vector<vector<int>> threeSum(vector<int>& nums) {

    }
};

int main () {
    vector<int> test = {-1,0,1,2,-1,-4};

    Solution my_func;
    vector<vector<int>> result = my_func.threeSum(test);

    return (0);
}