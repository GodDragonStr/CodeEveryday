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
        chart.put(4, new String[]{"d", "e", "f"});
        chart.put(5, new String[]{"d", "e", "f"});
        chart.put(6, new String[]{"d", "e", "f"});

        String inputNums = "34";
        byte[] b1 = inputNums.getBytes();
        for (Byte b : b1) {
            System.out.println(b);
            mem.add(chart.get(b - 48));
        }

        System.out.println(mem.get(0)[0]);


    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
//        装换
        return null;
    }
}