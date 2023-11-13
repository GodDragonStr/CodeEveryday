import java.util.StringJoiner;

public class StringDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        String str = sjJoiner(arr);
        System.out.printf(str);
    }

    public static String sjJoiner(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        if (arr == null || arr.length == 0)
            return "";

        for (int element : arr)
            sj.add(String.valueOf(element) + Integer.toString(element));

        return sj.toString();
    }
}
