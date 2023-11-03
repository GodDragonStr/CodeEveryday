import java.util.Scanner;
public class HM7 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Please input a triple-number:");
        int number = getNumber.nextInt();
        // tik toc
        long startTime = System.currentTimeMillis();
        if ((number > 1000) && (number < -1000)) {
            System.out.println("Input number is not a triple-number");
            return;
        }
        else {
            number = Math.abs(number);
            int numberSum = 0;
            while (number > 0) {
                numberSum += number % 10;
                number /= 10;
            }
            System.out.println("Results of sum every digital:" + numberSum);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Program running time: " + (endTime - startTime) / 1000 + "s");
    }
}