import java.util.Scanner;
public class LearnString {

    private static int length;

    public static void main(String[] args) {
        String s1 = "test1";
        String s2 = new String("test1");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        Scanner getString = new Scanner(System.in);
        System.out.println("Please input a string:");
        String comString = getString.next();

        System.out.println(comString.equals(s1));
        System.out.println(comString == s1);


        System.out.println(s2.charAt(0));
        System.out.println(s2.length());


    }
}
