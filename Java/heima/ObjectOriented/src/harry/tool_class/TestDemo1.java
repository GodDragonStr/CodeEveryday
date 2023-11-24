package harry.tool_class;

import java.util.List;
import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        System.out.println(ArrayUtil.printArr(arr));
        System.out.println(ArrayUtil.average(arr));

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(12,"xiaoming"));
        studentList.add(new Student(13,"xiaoming"));
        studentList.add(new Student(14,"xiaoming"));
        studentList.add(new Student(9,"xiaoming"));
        System.out.println(AgeMax.getMaxAge(studentList));
    }
}
