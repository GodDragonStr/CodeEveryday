package harry.lee131;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PalindromePartion {
    public static void main(String[] args) {
//        Solution myS = new Solution();
//        String test = "aab";
//        List<List<String>> result = myS.partition(test);
//
//        for (List<String> e : result) {
//            System.out.println(e);
//        }
    Integer aaaa = 0;
        System.out.println(aaaa > -1);


    String test1 = "abc";
        System.out.println(test1.charAt(0));
    System.out.println(test1.length());
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] b = new int[n];
    }
}


class Solution {
    List<Integer> path = new ArrayList<Integer>();
    List<List<String>> result = new ArrayList<List<String>>();

    public List<List<String>> partition(String s) {
        String[] sString = s.split("");
        backTracking(-1, 0, sString.length - 1, sString);
        return this.result;
    }

    public void backTracking(int preStart, int curStart, int end, String[] sString) {

        // 判断当前子串是否为回文串

        if(preStart != -1) {
            if (!checkPalindrome(preStart, curStart - 1, sString)) {
                return;
            }
            if ((curStart - 1) == end) {
                if (this.path.size() != 0) {
                    List<String> stringListTmp = pathToStringList(this.path, sString);
                    this.result.add(stringListTmp);
                }
                return;
            }
        }

        // System.out.println("this");
        // System.out.println(preStart + 1);
        // System.out.println(curStart - 1);

        // 分割完全添加路径

        // 未分割完全继续分割
        for (int i = curStart; i <= end; i++) {
            this.path.add(i);
            backTracking(curStart, i + 1, end, sString);
            this.path.remove(this.path.size() - 1);
        }

    }

    public boolean checkPalindrome(int start, int end, String[] sString) {
        if (end > sString.length - 1) {
            return true;
        }
        // 整除2会向下取整
        for (int i = 0; i <= (end - start) / 2; i++) {
//            System.out.println("___________________________");
//            System.out.println(start + i);
//            System.out.println(sString[start + i]);
//            System.out.println(sString[end - i]);
//            System.out.println("___________________________");
            if (!sString[start + i].equals(sString[end - i])) {
                return false;
            }
        }
        return true;
    }

    public List<String> pathToStringList(List<Integer> path, String[] sString) {

        int subStart = 0;
        int subEnd = path.get(0);
        int index = 0;
        List<String> stringList = new ArrayList<String>();

        while (subEnd <= sString.length-1) {
            String sTemp = "";
            for (int i = subStart; i <= subEnd; i++) {
                sTemp += sString[i];
            }
            stringList.add(sTemp);
            index++;
            subStart = subEnd + 1;
            if (index > path.size() - 1 || subStart > sString.length - 1) {
                break;
            }
            subEnd = path.get(index);

        }

        return stringList;
    }
}