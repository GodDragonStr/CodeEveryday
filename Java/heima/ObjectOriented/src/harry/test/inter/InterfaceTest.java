package harry.test.inter;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
//        Flyable.MIN_SPEED = 1;
//        Flyable.MAX_SPEED = 2;
    }
}


interface Flyable {
    public final static int MIN_SPEED = 0;

    int MAX_SPEED = 1000;

}