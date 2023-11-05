public class HM4 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 3, 5, 4};

        int weight = arr.length - 1;
        int num = 0;
        int index = 0;

        while (weight >= 0) {
            num += arr[index] * Math.pow(10, weight);
            weight--;
            index++;
        }

        System.out.println(num);
    }
}