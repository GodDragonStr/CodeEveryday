package harry.chapter1;

import java.util.Scanner;
public class Divide {
    public static void main (String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toHexString(Integer.MAX_VALUE));
        System.out.println(Integer.toHexString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(-1));
        if (Integer.MAX_VALUE + Integer.MAX_VALUE > Integer.MAX_VALUE) {
            System.out.println("OverFlow!!!");
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("请输入被除数： ");
        int dividend = scan.nextInt();
        System.out.print("请输入除数： ");
        int divisor = scan.nextInt();

        scan.close();

        Solution myS = new Solution();
        int result = myS.divide(dividend, divisor);
        System.out.println(result);
    }
}


class Solution {
    public int divide (int dividend, int divisor) {
        // 转换为负数空间运算
        // 特殊溢出-2^31 / (-1)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = 1;

        if (dividend > 0) {
            dividend = -dividend;
            sign = -sign;
        }
        if (divisor > 0) {
            divisor = -divisor;
            sign = -sign;
        }

        int result = divideCore(dividend, divisor);
        return (sign > 0) ? result : -result;
    }

    private int divideCore (int dividend, int divisor) {
        int result = 0;

        while (dividend <= divisor) {
            int num = divisor;
            int count = 1;
            while (num >= Integer.MAX_VALUE >> 2 && num + num >= dividend) {
                num += num;
                count += count;
            }
            dividend -= num;
            result += count;
        }

        return result;
    }
}