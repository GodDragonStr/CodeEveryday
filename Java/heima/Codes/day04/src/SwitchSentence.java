import java.util.Scanner;
public class SwitchSentence {
    public static void main(String[] args) {
        // switch (expression) {case 1: expression1; case 2: expression2, ... ...}
        Scanner getNumber = new Scanner(System.in);
        String number = getNumber.nextLine();
        switch (number) {
            case "3":
                System.out.println("number is: " + number);
//                break;
            case "1":
                System.out.println("number is: " + number);
            case "4":
                System.out.println("number is: " + number);
            case "5":
                System.out.println("number is: " + number);
            default:
                System.out.println("number is not exist");
        }
        System.out.println("Over!");

        int numberChar = switch (number) {
            case "1" -> 1;
            case "2" -> 2;
            default -> 0;
        };

        System.out.println("numberChar:" + numberChar);

    }
}