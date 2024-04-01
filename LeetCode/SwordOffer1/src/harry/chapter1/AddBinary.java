package harry.chapter1;

import java.util.Scanner;

public class AddBinary {
    public static void main (String[] args) {
        // 输入一两个二进制字符串输出结果
        // 当两个二进制字符串过大直接转换为int类型会产生溢出
        // 直接在字符串上进行二进制操作
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String s1 = scan.nextLine();
        System.out.println("请输入第二个字符串：");
        String s2 = scan.nextLine();
        scan.close();
        System.out.println("Checking ... ...");
        try {
            System.out.println(Integer.parseInt(s1, 2));
        } catch (NumberFormatException e) {
            System.out.println("not a binary string");
        }
        System.out.println("Checking Over !!!");

        Solution2 mys2 = new Solution2();
        String result = mys2.addBinary(s1, s2);
        System.out.println(result);

    }
}

class Solution2 {
    public String addBinary (String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int index1 = s1.length() - 1;
        int index2 = s2.length() - 1;
        int carry = 0;
        String temp = "0";
        while (index1 >= 0 || index2 >= 0) {

            int c1 = index1 >= 0 ? s1.charAt(index1) : 0;
            int c2 = index2 >= 0 ? s2.charAt(index2) : 0;
            temp = String.valueOf((c1 + c2 + carry) & 1);
            carry = ((c1 + c2) & 2) >> 1;
            result.append(temp);
            index1--;
            index2--;
        }
        if (carry != 0) {
            result.append(String.valueOf(carry));
        }

        return result.reverse().toString();
    }
}