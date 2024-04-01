package harry.chapter1;

public class SingleNumber {
    public static void main (String[] args) {
        Solution4 s4 = new Solution4();
        System.out.println(s4.singleNumber(new int[]{0, 0, 0, 1, 1, 1, 100}));
    }
}

class Solution4 {
    int[] bitCounts = new int[32];
    int singleNumber (int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < 32; ++j) {
                bitCounts[j] += (nums[i] >> j) & 1;
            }
        }

        for (int i = 0; i < 32; ++i) {
            result += (bitCounts[i] % 3) << i;
        }

        return result;
    }
}
