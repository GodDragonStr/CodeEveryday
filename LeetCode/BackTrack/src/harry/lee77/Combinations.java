package harry.lee77;

import java.util.ArrayList;
import java.util.List;
public class Combinations {
    public static void main(String[] args) {
        Solution mys = new Solution();
        System.out.println(mys.combine(4, 2));

    }
}

class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return this.result;
    }

    public void backTracking (int n, int k, int start) {
        if (this.path.size() == k) {
            this.result.add(new ArrayList<>(this.path));
            return;
        }

        for (int i = start; i <= n - (k - this.path.size()) + 1; i++) {
            this.path.add(i);
            backTracking(n, k, i+1);
            this.path.remove(this.path.size()-1);
        }

    }
}
