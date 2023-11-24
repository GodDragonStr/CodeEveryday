package harry.tool_class;
import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil() {}
    public static String printArr(int[] arr) {
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int e: arr) {
            sj.add(Integer.toString(e));
        }
        return sj.toString();
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int e : arr) {
            sum += e;
        }
        double avg = sum / arr.length;

        return avg;
    }


}
