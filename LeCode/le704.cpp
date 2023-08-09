#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int target_idx = -1;
        int mid_idx;
        int up_bound = nums.size() - 1, down_bound = 0;
        int sample_len = (up_bound - down_bound) / 2;
        
        while (true) {
            if (up_bound != down_bound) {
                mid_idx = down_bound + sample_len;
                if (nums[mid_idx] == target) {
                    target_idx = mid_idx;

                    return (target_idx);
                }
                else if (nums[mid_idx] < target) {
                    down_bound = mid_idx;
                    // 考虑越界问题使用相减
                    sample_len = (up_bound - down_bound) / 2;
                }
                else {
                    up_bound = mid_idx;
                    sample_len = (up_bound - down_bound) / 2 ;
                }
            }
            else {
                // 如果最后范围限定到了最后两个数或者一个数
                if (nums[down_bound] == target) {
                    target_idx = down_bound;

                    return target_idx;
                }

                else return target_idx;
            }
        }

        return (target_idx);
    }
};

class Solution2 {
public:
    int search(vector<int>& nums, int target) {
        int target_idx = -1;
        int mid_idx;
        int up_bound = nums.size() - 1, down_bound = 0;
        int sample_len = (up_bound - down_bound) / 2;
        
        while (up_bound > down_bound) {
            mid_idx = (up_bound + down_bound) / 2;
            if (nums[mid_idx] == target) return (mid_idx);
            else if (nums[mid_idx] < target) down_bound = mid_idx + 1;
            else up_bound = mid_idx;
        }

        // 如果最后范围限定到了最后两个数或者一个数
        if (nums[down_bound] == target) return down_bound;
        else return target_idx;
    }
};


int main () {
    vector<int> nums = {-1, 0, 3, 5, 9, 12};
    cout << nums[-1] << endl;
    Solution search_target;
    cout << search_target.search(nums, -3) << endl;
    return (0);
}