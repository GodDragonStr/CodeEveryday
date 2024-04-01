package harry.chapter1;

import java.util.Arrays;
public class CountBits {
    public static void main (String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.countBits2(4)));
    }
}

class Solution3 {
    int[] countBits (int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            int j = i;
            int count = 0;
            while (j != 0) {
                if ((j & 1) == 1) {
                    count++;
                }
                j >>= 1;
            }
            result[i] = count;
        }
        return result;
    }

    int[] countBits2 (int n) {
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; ++i){
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
