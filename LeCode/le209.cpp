#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int len = nums.size()+1;
        for (int i = 0; i < nums.size(); i++) {
            int sum_tem = 0;
            int idx = i;
            while (idx < nums.size()) {
                sum_tem += nums[idx++];
                if (sum_tem >= target) {
                    if(idx - i - 1 < len) {
                        len = idx - i;
                        break;
                    }
                }
            }
        }

        if (len == nums.size()+1) return (0);
        else return (len);
    }
};

// 滑动窗口
class Solution1 {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
       int idx = 0, len_tem = 1, len = nums.size() + 1;
       int sum = nums[idx];
       while (idx + len_tem - 1 < nums.size()) {
            if (sum >= target) {
                if (len_tem < len) len = len_tem;
                sum -= nums[idx++];
                len_tem--;
            }
            else {
                sum += nums[idx + (++len_tem) - 1];
            }
       }
    //    if (len < nums.size() + 1) return len;
    //    else return 0; 

       return (len < nums.size() + 1) ? len : 0;
    }
    
};


int main () {
    vector<int> nums = {2,3,1,2,4,3};
    int target = 7;

    Solution1 my_minSubArrayLen;
    cout << my_minSubArrayLen.minSubArrayLen(target, nums) << endl;
    return (0);
}