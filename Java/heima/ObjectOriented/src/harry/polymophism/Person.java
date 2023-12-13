package harry.polymophism;

class Person {
    private int age;
    private String name;

    Person() {}

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println("this is Person");
    }

    public void eat() {
        System.out.println("Person eat.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Man extends Person {
    Man() {}

    @Override
    public int getAge() {
        return super.getAge();
    }

    public void eat() {
        System.out.println("Manx eat.");
    }
}


class Student extends Person {
    Student() {}
    Student(int age, String name) {
        super(age, name);
    }
    public void show() {
        System.out.println("this is Student");
    }
}

class Teacher extends Person {
    Teacher() {}
    Teacher(int age, String name) {
        super(age, name);
    }
    public void show() {
        System.out.println("this is Teacher");
    }
}

class Administrator extends Person {
    Administrator() {}
    Administrator(int age, String name) {
        super(age, name);
    }

    public void show() {
        System.out.println("this is Administrator");
    }
}