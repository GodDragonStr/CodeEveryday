public class ClassTest {
    public static void main(String[] args) {
        StaticDemo1 st1 = new StaticDemo1();
        System.out.println(st1.nextId);
//        st1.nextId = 2;
        StaticDemo1 st2 = new StaticDemo1();
        System.out.println(st2.nextId);

    }
}
