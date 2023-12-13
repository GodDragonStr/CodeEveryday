package harry.polymophism;

public class PolyDemo2 {
    public static void main(String[] args) {
        A a1 = new A();
        A b1= new B();
        B b2 = new B();
        b1.show(b2);
        b2.show(b2);
        b2.show(a1);
        b2.show(b1);

        if (b1 instanceof A) {
            System.out.println("yes b1 instanceof A");
        }

        if (b1 instanceof B) {
            System.out.println("yes b1 instanceof B");
        }

        if (b1 instanceof C) {
            System.out.println("yes b1 instanceof C");
        }
    }
}
