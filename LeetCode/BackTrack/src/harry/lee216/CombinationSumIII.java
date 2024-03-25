package harry.lee216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        Solution myS = new Solution();
        List<List<Integer>> result = myS.combinationSum3(3, 7);
        System.out.println(result.toString());
    }
}

class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1);
        return this.result;
    }

    public void backTracking(int k, int n, int start) {
        if (this.path.size() == k && this.sum == n) {
            this.result.add(new ArrayList<>(path));
            return ;
        }

        for (int i = start; i <= 9; i++) {
            if (this.sum + i > n || this.path.size() > k) {
                continue;
            }
            this.sum += i;
            this.path.add(i);
            backTracking(k, n, i + 1);
            this.sum -= i;
            this.path.remove(this.path.size() - 1);
        }
    }
}
