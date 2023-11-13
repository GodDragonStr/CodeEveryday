public class CatString {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        byte[] arr1 = new byte[] {1, 2, 3};
        String catS = catString(arr);
        System.out.printf(catS);
    }

    public static String catString(int[] arr) {
        StringBuilder newString = new StringBuilder();
        if (arr == null)
            return null;
        else if (arr.length == 0)
            return "";
        else
            for (int j : arr) {
                // improve the e of concatenate
                newString.append(j);
            }

        return newString.toString();
    }
}
