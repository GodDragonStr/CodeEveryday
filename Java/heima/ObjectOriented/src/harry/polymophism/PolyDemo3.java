package harry.polymophism;

public class PolyDemo3 {
    public static void main(String[] args) {
        PolyDemo3 test = new PolyDemo3();
        Circle c1 = new Circle("red", 1.0, 2.3);
        GeometricObject c2 = new Circle("red", 1.0, 2.3);
        GeometricObject c3 = new Rectangle("yellow", 1.0, 1.0, 20);
        GeometricObject c4 = new Circle("red", 1.0, 2.3);
        // 虚函数调用或者动态绑定
        // 动态绑定指的是编译绑定的是一个类,而运行时使用的另一个类的方法
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEuqals = test.equalsArea(c1, c2);
        System.out.println(isEuqals);

        // 匿名对象
        test.displayGeometricObject(new Rectangle("blue", 1.0, 23, 10));

        test.showType(c1);
        test.showType(c2);
        test.showType(c3);
        test.showType(new Rectangle("yellow", 1.0, 1.0, 20));

        int[] a = new int[] {1, 3};
        int[] b = new int[] {1, 3};
        System.out.println("a b " + a.equals(b));
        System.out.println(a.getClass());

        System.out.println("c3 equals c4 ? " + c3.equals(c4));
        System.out.println("c3 == c4 ? " + (c3==c4));

        String s1 = new String("string");
        String s2 = new String("string");

        System.out.println("s1 equals s2 ? " + s1.equals(s2));
        System.out.println("s1 == s2 ? " + (s1==s2));


    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        /**
        * 比较几何面积是否想等
        * */

        // 这里不能使用equals，因为这里是double基本数据类型而不是引用数据类型，引用数据类型才会用equals
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g) {
        System.out.println("The area of geometric is: " + g.findArea());
    }

    public void showType(GeometricObject g) {
        if (g instanceof  GeometricObject) {
            System.out.println("GeometricObject");
        }

        if (g instanceof Circle) {
            Circle c = (Circle) g;
            c.show();
        } else if (g instanceof Rectangle) {
            Rectangle r = (Rectangle) g;
            r.show();
        }
    }
}
