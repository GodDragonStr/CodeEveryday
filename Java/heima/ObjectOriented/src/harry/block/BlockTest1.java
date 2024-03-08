package harry.block;

public class BlockTest1 {

    public static void main(String[] args) {
        BlockTest1.test();
    }

    public static void test() {
        Person p1 = new Person("l", 11);

    }
}


class Person {
    public String name;
    public int age;

    Person() {}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块");
    }

    // 静态代码块
    static{
        System.out.println("静态代码块");
    }

}