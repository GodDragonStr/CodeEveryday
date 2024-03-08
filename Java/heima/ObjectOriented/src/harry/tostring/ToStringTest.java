package harry.tostring;

import java.util.ArrayList;

public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("l");
        u1.setAge(1);
        System.out.println(u1.name);
        // 因为继承object了，所以有toString这个方法
        System.out.println(u1.toString());
        System.out.println(u1);
        // 打印class_name @ 地址的hash_code
        // 如果使用String, File, Date等包装类，打印的是该类重写的toString方法
        String s1 = new String("this is the way");
        String s2 = new String("that is the way");
        System.out.println(s1.toString());
        Integer a = 1;
        ArrayList<Integer> listA1 = new ArrayList<Integer>();
        listA1.add(1);
        listA1.add(2);

        System.out.println(a.toString());
        System.out.println(a);
        System.out.println(listA1);
        System.out.println(listA1.toString());
        System.out.println(listA1.get(0));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(String.class.getName());
        System.out.println(s1.getClass() + "@" + Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(s2.getClass() + "@" + Integer.toHexString(System.identityHashCode(s2)));
    }


}


class User extends Object{
    String name;
    int age;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{ name = " + name + ", age = " + age + " }";
    }
}