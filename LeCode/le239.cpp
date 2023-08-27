// 滑动窗口最大值

#include <iostream>
#include <string>
#include <queue>
#include <algorithm>
#include <deque>

using namespace std;

class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        queue<int> q1;
        
        vector<int> maxVec;

        for (int i = 0; i < k; ++i) 
            this->addElement(q1, nums[i]);

        // cout << q1 << endl;
        maxVec.push_back(q1.back());

        for (int j = k; j < nums.size(); ++j) {
            this->removeLeft(q1, nums[j-k]);
            this->addElement(q1, nums[j]);
            maxVec.push_back(q1.back());
        }

        return maxVec;
    }

    bool addElement (queue<int>& q1, int num) {
        queue<int> q2;
        if (q1.empty()) {
            q1.push(num);
            return true;
        }
        else {
            bool addNum = false;
            if (addNum == false && num <= q1.front()) {
                q2.push(num);
                addNum = true;
                while (!q1.empty()) {
                    q2.push(q1.front());
                    q1.pop();
                }
                q1 = q2;
                return addNum;
            }
            else if (addNum == false && num > q1.back()) {
                q1.push(num);
                addNum = true;
                return addNum;
            }
            else {
                
                q2.push(q1.front());
                q1.pop();
                
                while (!q1.empty()) {
                    if (addNum == false && num >= q2.back() && num <= q1.front()) {
                        q2.push(num);
                        addNum = true;
                    }
                    q2.push(q1.front());
                    q1.pop();
                }

                q1 = q2;
                return addNum;
            }
        }
    }

    void removeLeft (queue<int>& q1, int num) {
        queue<int> q2;
        bool deleteNum = false;
        while (!q1.empty()) {
            if (deleteNum == false && q1.front() == num) {
                q1.pop();
                deleteNum = true;
            }
            else {
                q2.push(q1.front());
                q1.pop();
            }
        }

        q1 = q2;
    }

};

class Solution2 {
private:
    class MyQueue {
    private:
        // 用于记录峰顶下降的区间
        deque<int> myQue;
    public:
        // 加入元素
        void addElement (int value) {
            while (!myQue.empty() && value > myQue.back()) {    // 小于等于的时候才push，如果等于不push后面在排出元素的时候会出现问题
                myQue.pop_back();
            }
            myQue.push_back(value);
        }
        // 排除元素
        void delElement (int value) {
            if (!myQue.empty() && value == myQue.front()) {
                myQue.pop_front();
            }
        }
        // 最大元素
        int getMax () {
            return myQue.front();
        }
    };


public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> result;
        MyQueue myQue;

        for (int i = 0; i < k; ++i) {
            myQue.addElement(nums[i]);
        }

        result.push_back(myQue.getMax());

        for (int i = k; i < nums.size(); ++i) {
            myQue.delElement(nums[i-k]);
            myQue.addElement(nums[i]);
            result.push_back(myQue.getMax());
        }

        return result;
    }
};


class Solution3 {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int> myQue;
        vector<int> result;

        for (int i = 0; i < k; ++i) {
            addElement(myQue, nums[i]);
        }

        result.push_back(getMax(myQue));

        for (int i = k; i < nums.size(); ++i) {
            delElement(myQue, nums[i-k]);
            addElement(myQue, nums[i]);
            result.push_back(getMax(myQue));
        }

        return result;
    }

    // 最大元素
    int getMax (deque<int>& myQue) {
        return myQue.front();
    }
    // 排除元素
    void delElement (deque<int>& myQue, int value) {
        if (!myQue.empty() && value == myQue.front()) {
            myQue.pop_front();
        }
    }
    // 加入元素
    void addElement (deque<int>& myQue, int value) {
        while (!myQue.empty() && value > myQue.back()) {    // 小于等于的时候才push，如果等于不push后面在排出元素的时候会出现问题
            myQue.pop_back();
        }
        myQue.push_back(value);
    }
};


int main () {

    vector<int> nums = {-7,-8,7,5,7,1,6,0};

    Solution mySolution;
    vector<int> result = mySolution.maxSlidingWindow(nums, 4);
    
    // cout << result << endl;

    return (0);
}