#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> Matrix(n, vector<int>(n));
        int direction[4][2] = {{0, 1},
                                {1, 0},
                                {0, -1},
                                {-1, 0}};
        int i = 1;
        int direction_run = 0;
        int row = 0, col = -1;
        while (i <= n * n) {
            if (row + direction[direction_run % 4][0] >= n \
                || col + direction[direction_run % 4][1] >= n \
                || col + direction[direction_run % 4][1] < 0) {
                direction_run++;
            }
            else {
                if (Matrix[row + direction[direction_run % 4][0]][col + direction[direction_run % 4][1]] != 0) direction_run++;
                row += direction[direction_run % 4][0];
                col += direction[direction_run % 4][1];
                Matrix[row][col] = i++;
            }
        
        }

        return Matrix;
    }
};


int main () {

    Solution my_generateMatrix;
    vector<vector<int>> matrix = my_generateMatrix.generateMatrix(5);
    
    cout << 1 << endl;


    return (0);
}