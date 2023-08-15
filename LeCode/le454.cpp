// 使用map解题
#include <iostream>
#include <vector>
#include <map>
#include <set>

using namespace std;


class Solution {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        int n = nums1.size();
        int cnt = 0;
        for ( int i = 0 ; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    for (int l = 0; l < n; ++l) {
                        if (nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0)
                            cnt++;
                    }
                }
            }
        }

        return cnt;
    }
};

class Solution {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        set<int> set1(nums1.begin(), nums1.end());
        set<int> set2(nums2.begin(), nums2.end());
        set<int> set3(nums3.begin(), nums3.end());
        set<int> set4(nums4.begin(), nums4.end());
    }
};


int main () {


    return (0);
}