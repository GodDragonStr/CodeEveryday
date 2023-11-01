import javax.print.DocFlavor;

public class StringAdd {
    public static void main(String[] args) {
        String stringA = "hello world!";
        System.out.println(1 + stringA + 2);
        // the order of operation of addition is from left to right
        stringA = 1 + 2 + stringA + 3;
        System.out.println(stringA);
        stringA = stringA + 1 + 2;
        System.out.println(stringA);
    }
}