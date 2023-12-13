package harry.polymophism;

public class PolyDemo1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();
        Person p3 = new Administrator();

        registor(p1);
        registor(p2);
        registor(p3);

        Person p4 = new Person();
        Person p5 = new Man();
        // 在编译的时候方法是先找到父类，在运行的时候方法是先找到子类
        // 多态性的应用：虚拟方法调用
        /* 在多态场景下调用方法时：
            编译时,认为方法是左边声明的父类类型的方法
            运行时,实际执行的是子类重写父类的方法
            */

        p4.eat();
        p5.eat();




    }

    public static void registor(Person p) {
        p.show();
    }
}





