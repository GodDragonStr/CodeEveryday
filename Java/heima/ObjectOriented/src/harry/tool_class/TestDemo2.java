package harry.tool_class;

public class TestDemo2 {
    public static void main(String[] args) {
        Son son1 = new Son();
        son1.getFatherAge();
        Father father1 = new Father();
        System.out.println(father1.age);
    }
}

class Father {
//    public
    int age = 35;

    Father() {}
    Father(int age) {
        this.age = age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}

class Son extends Father {
    void getFatherAge(){
        System.out.println(age);
    }
}

