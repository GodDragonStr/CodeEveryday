#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size() - i - 1; j++) {
                if (nums[j] > nums[j+1]) swap(nums[j], nums[j+1]);
            }
        }

        return nums;
    }

    void swap(int& a, int& b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
};


class Solution1 {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int cnt = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] < 0) cnt++;
            nums[i] = nums[i] * nums[i]; 
        }

        int left_point = cnt - 1, right_point = cnt;
        vector<int> new_nums(nums.size());  // 数组用[]初始化，容器用()初始化
        if(left_point >= 0 && right_point < nums.size())
            for (int i = 0; i < nums.size(); i++) {
                if (left_point >= 0) {}
                    if (nums[left_point] <= nums[right_point]) new_nums[i] = nums[left_point--];
                    else if(right_point < nums.size()) new_nums[i] = nums[right_point++];
            }

        return new_nums;
    }

};

class Solution2 {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> new_nums(nums.size());  // 数组用[]初始化，容器用()初始化
        int left_point = 0, right_point = nums.size() - 1;
        int idx = nums.size() - 1;
        while (left_point <= right_point) {
            if (nums[left_point] * nums[left_point] >= nums[right_point] * nums[right_point]) new_nums[idx--] = nums[left_point] * nums[left_point++];
            else new_nums[idx--] = nums[right_point] * nums[right_point--];
        }
       
        return new_nums;
    }

};


int main () {
    vector<int> nums = {-7,-3,2,3,11};
    int a = 0;
    cout << nums[a] * nums[a++] << endl;
    cout << nums[a] << endl;

    Solution2 my_sortedSquares;
    nums = my_sortedSquares.sortedSquares(nums);

    // for (int i = 0; i < nums.size(); i++) {
    //     cout << nums[i] << endl;
    // }


    return (0);
}