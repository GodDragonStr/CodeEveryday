public class HM1 {
    public static void main(String[] args) {
        int newPhonePrice = 7988;
        int usedPhonePrice = 1500;
        if (newPhonePrice * 0.2 >= usedPhonePrice) {
            System.out.println("Used Phone as discount is a better choice.");
        }
        else {
            System.out.println("Sale used phone in second hand market.");
        }

        int a = 10;
        int b = 30;
        int c = 20;

        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }


    }
}