// 使用map解题
#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <unordered_map>

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

class Solution1 {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        set<int> set1(nums1.begin(), nums1.end());
        set<int> set2(nums2.begin(), nums2.end());
        set<int> set3(nums3.begin(), nums3.end());
        set<int> set4(nums4.begin(), nums4.end());
        vector<vector<int>> mem;
        int n = nums1.size();
        int cnt = 0;

        for (auto t1 : set1) {
            for (auto t2 : set2) {
                for (auto t3 : set3) {
                    if (set4.find(-(t1 + t2 + t3)) != set4.end()) {
                        mem.push_back({t1, t2, t3, -(t1 + t2 + t3)});
                    }
                }
            }
        }

        for (auto vec : mem) {
            int times1 = 0;
            int times2 = 0;
            int times3 = 0;
            int times4 = 0;
            for (auto t1 : nums1)
                if (vec[0] == t1) times1++;
            for (auto t2 : nums2)
                if (vec[1] == t2) times2++;
            for (auto t3 : nums3)
                if (vec[2] == t3) times3++;
            for (auto t4 : nums4)
                if (vec[3] == t4) times4++;

            cnt += times1 * times2 * times3 * times4;
        }

        return cnt;
    }
};


class Solution2 {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        unordered_map<int, int> mem;
        int n = nums1.size();
        int cnt = 0;

        for (int i = 0; i < n; ++i) 
            for (int j = 0; j < n; ++j) 
                ++mem[nums1[i]+nums2[j]];
        
        for (int i = 0; i < n; ++i) 
            for (int j = 0; j < n; ++j) 
                if (mem.find(-(nums3[i]+nums4[j])) != mem.end()) cnt += mem[-(nums3[i]+nums4[j])];
            
        return cnt;
    }
};


class Solution3 {
public:
    int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
        unordered_map<int, int> mem;
        int n = nums1.size();
        int cnt = 0;

        // for (int i = 0; i < n; ++i) 
        //     for (int j = 0; j < n; ++j) 
        //         ++mem[nums1[i]+nums2[j]];
        
        // for (int k = 0; k < n; ++k) 
        //     for (int l = 0; l < n; ++l) 
        //         if (mem.find(-(nums3[k]+nums4[l])) != mem.end()) cnt += mem[-(nums3[k]+nums4[l])];

        for (int a : nums1) 
            for (int b : nums2) 
                ++mem[a + b];
        
        for (int c : nums3) 
            for (int d : nums4) 
                cnt += mem[-(c + d)];
                // if (mem.find(-(c + d)) != mem.end()) cnt += mem[-(c + d)];

        return cnt;
    }
};


int main () {


    return (0);
}