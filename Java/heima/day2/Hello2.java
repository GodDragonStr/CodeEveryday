public class Hello2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {10, 20, 30, 40};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
