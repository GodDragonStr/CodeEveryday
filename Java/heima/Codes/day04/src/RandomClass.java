import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random();

        int randomNumber = r.nextInt(100);

        System.out.println(randomNumber);

        System.out.println((new Random()).nextInt(100));
    }
}