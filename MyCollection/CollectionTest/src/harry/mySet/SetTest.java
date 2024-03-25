package harry.mySet;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1 () {
        Set mySet1 = new LinkedHashSet();
        mySet1.add("111");
        mySet1.add("111");
        mySet1.add("111");
        mySet1.add("222");
        mySet1.add(new Person(11, "tom"));
        mySet1.add(new Person(11, "tom"));
        System.out.println(mySet1);
    }
}


class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}