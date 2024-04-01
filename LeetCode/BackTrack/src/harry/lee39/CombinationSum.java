package harry.lee39;

import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        System.out.println(a.length);
    }
}

class Solution {
    int sum = 0;
    ArrayList<Integer> path = new ArrayList<Integer>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(0, candidates.length - 1, target, candidates);
        return this.result;
    }

    public void backTracking(int start, int end, int target, int[] candidates) {
        if (this.sum == target) {
            this.result.add(new ArrayList<>(this.path));
        } else if (this.sum < target) {
            for (int i = start; i <= end; i++) {
                this.sum += candidates[i];
                this.path.add(candidates[i]);
                backTracking(i, end, target, candidates);
                this.sum -= candidates[i];
                this.path.remove(this.path.size() - 1);
            }
        } else {
            return;
        }
    }
}