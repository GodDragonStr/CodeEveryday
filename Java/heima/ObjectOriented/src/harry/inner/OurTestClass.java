package harry.inner;
import harry.inner_class.Person;

public class OurTestClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        SubClass s1 = new SubClass();
//        SubClass.show();
        s1.showLastName();

    }




}


class SubClass extends Person {

    String tmpName = this.lastName;
    public void showLastName() {
        System.out.println(this.lastName);
    }

//    public void show() {
////        System.out.println(p1.firstName);
//        Person p1 = new Person();
//        System.out.println(p1.lastName);
//    }
}
