
/* Module -> Package -> Class
* Module: java.base
* Package: java.util
* Class Scanner:
*   java.lang.Object
*   Closeable, AutoCloseable, Iterator<String>
* public final class Scanner
* extend Object
* implements Iterator<String>, Closeable
* */

import java.io.Console;
import java.io.File;
import java.util.Scanner;

public class API {
    private static Console con;

    public static void main(String[] args) throws Exception{
        /*Scanner sc = new Scanner(new File("myNumbers"));
        while (sc.hasNextLong()) {
            long aLong = sc.nextLong();
        }*/
        Scanner getNum = new Scanner(System.in);
        float numFloat = getNum.nextFloat();
        int lengthArra = getNum.nextInt();

        int[] arrInt = new int[lengthArra];

        System.out.println("Input float:" + numFloat);
    }
}
