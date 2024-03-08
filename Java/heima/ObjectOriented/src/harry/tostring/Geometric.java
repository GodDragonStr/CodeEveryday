package harry.tostring;

public class Geometric {
    public static void main(String[] args) {
        Geometric.test();
    }

    public static void test() {
        String s1 = null;
        String s2 = "test";
        System.out.println(s2.equals(s1));
//        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s2));
    }
}


class GeometricObject {
    protected String color;
    protected double weight;

    GeometricObject() {
        color = "white";
        weight = 2.0;
    }

}

class Circle extends GeometricObject {

}
