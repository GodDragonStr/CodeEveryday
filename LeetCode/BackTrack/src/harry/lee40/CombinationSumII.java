package harry.lee40;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
    public static void main(String[] args) {
        Set<List<Integer>> set1 = new HashSet<List<Integer>>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l2.add(1);
        System.out.println("1" + set1);
        set1.add(l1);
        System.out.println("2" + set1);
        set1.add(l2);
        System.out.println("3" + set1);
        System.out.println("*****************************************");
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(System.identityHashCode(l1));
        System.out.println(System.identityHashCode(l2));
    }
}

class Solution {
    Set<List<Integer>> result = new HashSet<List<Integer>>();
    List<Integer> path = new ArrayList<Integer>();
    int sum = 0;


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        if (candidates.length == 0) {
//            return null;
//        }
        Arrays.sort(candidates);
        backTracking(0, candidates.length - 1, target, candidates);
        return arrayListResult(this.result);
    }

    public void backTracking(int start, int end, int target, int[] candidates) {
        if (this.sum == target) {
            result.add(this.path);
        } else if (this.sum < target) {
            for (int i = start; i <= end; i++) {
                this.sum += candidates[i];
                this.path.add(candidates[i]);
                backTracking(i + 1, end, target, candidates);
                this.sum -= candidates[i];
                this.path.remove(this.path.size() - 1);
            }
        } else {
            return;
        }
    }

    public List<List<Integer>> arrayListResult(Set<List<Integer>> setResult) {
        List<List<Integer>> arrayListResult1 = new ArrayList<List<Integer>>();
        for (List<Integer> temp : setResult) {
            arrayListResult1.add(temp);
        }
        return arrayListResult1;
    }
}


