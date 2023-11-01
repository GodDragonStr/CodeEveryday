import java.util.Scanner;
public class HM6 {
    public static void main(String[] args) {
        int num;
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Please input a double-digit:");
        num = getNumber.nextInt();
        if (num >= 100 || num <= -100) {
            System.out.println(false);
        } else {
            if (num % 6 == 0) {
                System.out.println(true);
                return;
            }
            else {
                num /= 10;
            }
        }
    }
}
