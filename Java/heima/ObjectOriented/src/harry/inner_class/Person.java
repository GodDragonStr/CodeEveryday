package harry.inner_class;

//public class OurTestClass {
//    public static void main(String[] args) {
//        otherClass.show();
//    }
//}


// 测试protected
// 同一包
// 不同包，同一类


// 测试default
// 同一包

public class Person {
    String firstName = "Harry";
    protected String lastName = "Gao";
    private String anonymousName = "God";
}

class otherClass {
    static void show() {
        // 同包同类
        Person p1 = new Person();
        System.out.println(p1.firstName);
        // 同包不同类
        System.out.println(p1.lastName);
//        System.out.println(p1.anonymousName);
    }
}

class SubClass extends Person {
    static void show() {
        Person p1 = new Person();
        System.out.println(p1.firstName);
        System.out.println(p1.lastName);

    }
}