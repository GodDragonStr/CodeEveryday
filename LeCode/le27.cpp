#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int len = 0;
        int cnt = 0;
        int idx = 0;
        int nums_size = nums.size();

        for (int i = 0; i < nums_size; i++) {
            if( nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        for (int j = 0; j < nums_size - idx ; j++) {
            nums.pop_back();
        }

        return idx;
    }
};

int main () {
    vector<int> nums = {3,2,2,3};
    int val = 3;
    Solution remove_element;
    cout << remove_element.removeElement(nums, val) << endl;

    return (0);
}