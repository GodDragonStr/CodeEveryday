package harry.lee17;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterComofPhoneNum {
    public static void main(String[] args){

    }

    @Test
    public void test1() {
        String s1 = "abc";
//        Byte[] b = new byte[]{Byte.parseByte(s1)};



        Map<Integer, String[]> chart = new HashMap<>();
        List<String[]> mem = new ArrayList<>();

        chart.put(2, new String[]{"a", "b", "c"});
        chart.put(3, new String[]{"d", "e", "f"});
        chart.put(4, new String[]{"g", "h", "i"});
        chart.put(5, new String[]{"j", "k", "l"});
        chart.put(6, new String[]{"m", "n", "o"});
        chart.put(7, new String[]{"p", "q", "r", "s"});
        chart.put(8, new String[]{"t", "u", "v"});
        chart.put(9, new String[]{"w", "x", "y", "z"});

        String inputNums = "034";
        System.out.println(inputNums.length());
        byte[] b1 = inputNums.getBytes();
        System.out.println(b1[0]);
//        for (Byte b : b1) {
//            System.out.println(b);
//            mem.add(chart.get(b - 48));
//        }
//
//        System.out.println(mem.get(0)[0]);

        ArrayList<String[]> testString = new ArrayList<String[]>();
        System.out.println(testString);
    }

    @Test
    public void test2() {
//        String-> Character | Byte | Integer
        String stringString = "abc";
        char[] stringCharacter = new char[stringString.length()];
//        左闭右开
        stringString.getChars(0, stringString.length(), stringCharacter, 0);
        System.out.println(stringCharacter);

        byte a1 = (byte)(97);
        byte a2 = 'a';
        char a3 = 'b';
        System.out.println((char)a1);
        System.out.println(a2);
        System.out.println(a3);


    }
}

class Solution {
    Map<Integer, String[]> chart = new HashMap<>();
    ArrayList<String> result = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();
//  代码块初始化
    {
        chart.put(2, new String[]{"a", "b", "c"});
        chart.put(3, new String[]{"d", "e", "f"});
        chart.put(4, new String[]{"g", "h", "i"});
        chart.put(5, new String[]{"j", "k", "l"});
        chart.put(6, new String[]{"m", "n", "o"});
        chart.put(7, new String[]{"p", "q", "r", "s"});
        chart.put(8, new String[]{"t", "u", "v"});
        chart.put(9, new String[]{"w", "x", "y", "z"});
    }

    public List<String> letterCombinations(String digits) {
        byte[] digitsBytes = digits.getBytes();
        ArrayList<String[]> combineStrings = getDigitsBytes(digitsBytes);
        backTracking(0, combineStrings.size() - 1, combineStrings);
        return this.result;
    }

    public ArrayList<String[]> getDigitsBytes (byte[] digitsBytes) {
        ArrayList<String[]> getString =  new ArrayList<String[]>();
        for (byte b : digitsBytes) {
            getString.add(this.chart.get(b - 48));
        }
        return getString;
    }

    public void backTracking (int start, int end, ArrayList<String[]> comStrings) {
        if (temp.size() != 0) {
            String comStringTmp = "";
            for (String s : temp) {
                comStringTmp += s;
            }
            this.result.add(comStringTmp);
        }
        for (int i = start; i <= end; i ++){
            String[] currStrings = comStrings.get(i);
            for (String s : currStrings) {
                temp.add(s);
                backTracking(start + 1, end, comStrings);
                temp.remove(temp.size() - 1);
            }
        }
    }
}