package harry.lee93;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class RestoreIPAddresses {
    @Test
    public void test1 () {
        int a = 10;
        int b = a % 3;
        System.out.println(b);

//        switch(a) {
//            case 1: {
//                System.out.println(1);
//                break;
//            }
//            case 10: {
//                System.out.println(10);
//                break;
//            }
//            default: break;
//        }

        String c = "1   10";
        String[] cs = c.split("");
        System.out.println(cs.length);
        for (String sTmp : cs) {
            System.out.println(sTmp);
        }

    }

}

class Solution {
    List<String> path = new ArrayList<String>();
    List<String> result = new ArrayList<String>();


    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        backTracking(0, n - 1, s);
        return this.result;
    }

    public void backTracking(int start, int end, String s) {
        if ((this.path.size() == 4) && (start <= end)) {
            return;
        }

        if (this.path.size() == 4 && start == (end + 1)) {
            String jointString = "";
            int flag = 0;
            for (String sTmp : this.path) {
                if (flag == 0) {
                    jointString += sTmp;
                    flag = 1;
                } else {
                    jointString += ".";
                    jointString += sTmp;
                }
            }
            this.result.add(jointString);
        }


        for (int i = start; i <= end; ++i) {
            String subString = s.substring(start, i + 1);
            if ((subString.charAt(0) != '0' || subString.length() == 1) && subString.length() <= 3 && Integer.valueOf(subString) <= 255) {
                this.path.add(subString);
                backTracking(i + 1, end, s);
                this.path.remove(this.path.size() - 1);
            }
        }
    }
}
