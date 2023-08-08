#include <iostream>
#include <cmath>
#include <ctime>

using namespace std;

clock_t t_start,t_end;

class Solution {
public:
    int countPrimes(int n) {
        int prime_num_count = 0;
        if (n > 2) prime_num_count++;
        
        for (int i = 3; i <= n-1; i += 2) {
            int temp = 1;
            for (int j = 3; j <= (int)sqrt(i); j++) {
                
                if (i % j == 0) {
                    temp = 0;
                    break;
                }
            }
            if (temp) prime_num_count++;
        }
        return prime_num_count;
    }
};

int main () {
    Solution solution;
    t_start = clock();
    int result = solution.countPrimes(400000);
    t_end = clock();
    cout << result << endl;
    cout << "Running time:" << (double)(t_end-t_start) << endl;
    return (0);
}