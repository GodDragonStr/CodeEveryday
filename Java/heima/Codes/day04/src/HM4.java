import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int memberId = getNumber.nextInt();
        double amountMoney = getNumber.nextDouble();

        double payAmount = switch (memberId) {
            case 0 -> amountMoney >= 100 ? amountMoney * 0.8 : amountMoney;
            case 1 -> amountMoney >= 200 ? amountMoney * 0.75 : amountMoney * 0.8;
            default -> 0;
        };

        System.out.println("discount price:" + payAmount);


    }
}