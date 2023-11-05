import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int[] arr = new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91, 92};

        System.out.println("Please input a number:");
        int number = getNumber.nextInt();

        // binary search: [,)
//        int minIndex = 0;
//        int maxIndex = arr.length;
//        int midIndex = (minIndex + maxIndex) / 2; // round down
//
//
//        while (minIndex < maxIndex) {
//            if (number == arr[midIndex])
//                break;
//            else if (number > arr[midIndex]) {
//                minIndex = midIndex + 1;
//            } else if (number < arr[midIndex]) {
//                maxIndex = midIndex;
//            }
//
//            midIndex = (minIndex + maxIndex) / 2;
//        }
//
//        System.out.println(midIndex);

        // sandglass
        int[] newArr = new int[arr.length + 1];
//        int slowIndex = 0;
//        int fastIndex = 0;
//        for (; fastIndex < newArr.length; fastIndex++) {
//            if (arr[slowIndex] <= number && slowIndex < arr.length - 1) {
//                newArr[fastIndex] = arr[slowIndex];
//                slowIndex++;
//            }
//            else {
//                newArr[fastIndex] = number;
//                fastIndex++;
//                for (;fastIndex < newArr.length; fastIndex++) {
//                    newArr[fastIndex] = arr[slowIndex];
//                    slowIndex++;
//                }
//            }
//        }
        newArr[0] = number;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }

        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] > newArr[i+1]) {
                int temp = newArr[i];
                newArr[i] = newArr[i+1];
                newArr[i+1] = temp;
            }
        }

        for (int num : newArr) {
            System.out.print(num + " ");
        }

    }
}