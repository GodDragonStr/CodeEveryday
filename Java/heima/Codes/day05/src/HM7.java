public class HM7 {
    public static void main(String[] args) {
        int[] arr = new int[] {12,14,23,45,66,68,70,77,90,91};
        int[] newArr = new int[arr.length];
        int leftIndex = 0, rightIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 1) {
                newArr[leftIndex++] = arr[i];
            }
            else {
                newArr[rightIndex--] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

}
