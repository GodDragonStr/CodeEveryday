package harry.student;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/* System.out.println("1:添加学生");
 System.out.println("2:删除学生");
 System.out.println("3:修改学生");
 System.out.println("4:查询学生");
 System.out.println("5:退出");
 System.out.println("请输入您的选择：");*/

public class StudentSystem {

    static String name1 = "Harry";
    String name2 = "Ben";
    public static void main(String[] args) {

        System.out.println(StudentSystem.name1);
//        System.out.println(name2);

        List<Student> studentList = new ArrayList<Student>();
        Scanner consoleIn = new Scanner(System.in);

        System.out.println('-' * 50);
        System.out.println("Student system, please input number 1-5");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择：");
        while (true) {
            int choice = consoleIn.nextInt();
            switch (choice) {
                case 1 -> {addStudent(studentList);}
                case 2 -> {removeStudent(studentList);}
                case 3 -> {
                    System.out.println("Please input modified student's Id:");
                    String studentId = consoleIn.next();
                    reviseStudent(studentList, studentId);
                }
                case 4 -> {
                    System.out.println("Please input student's Id");
                    String studentIndex = consoleIn.next();
                    if (searchStudent(studentList, studentIndex) != -1) {
                        System.out.println("Student-" + studentIndex + "exit.");
                        printStudent(studentList.get(searchStudent(studentList, studentIndex)));
                    } else {
                        System.out.println("Student-" + studentIndex + " does not exit.");
                    }
                }
                case 5 -> {
                    System.out.println("exit");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please check your input number again.");
                }
            }
        }
    }

    // method: please add 'static' before the method to declare it is static
    public static void addStudent(List<Student> studentList) {
        System.out.println("please input student's information:");
        Scanner consoleIn = new Scanner(System.in);

        System.out.println("index:");
        String studentIndex = consoleIn.next();

//        for (Student s:studentList) {
//            if (s.getId() == studentIndex) {
//                System.out.println("Id-" + consoleIn + "has exited.");
//                return;
//            }
//        }

        if (searchStudent(studentList, studentIndex) != -1) {
            System.out.println("Id-" + consoleIn + "has exited.");
            return;
        }

        Student tempStudent = new Student();
        tempStudent.setId(studentIndex);

        System.out.println("name:");
        String studentName = consoleIn.next();
        tempStudent.setName(studentName);

        System.out.println("age:");
        int studentAge = consoleIn.nextInt();
        tempStudent.setAge(studentAge);

        System.out.println("address:");
        String studentAddress = consoleIn.next();
        tempStudent.setAddress(studentAddress);

        studentList.add(tempStudent);
        System.out.println("Add student successfully!!!");
        printStudent(tempStudent);

    }

    public static void removeStudent(List<Student> studentList) {
        System.out.println("Please input student's Id:");
        Scanner consoleIn = new Scanner(System.in);
        String studentIndex = consoleIn.next();
        int searchIndex = searchStudent(studentList, studentIndex);
        if (searchIndex != -1) {
            Student tempStudent = studentList.remove(searchIndex);
            System.out.println("Remove successfully!");
            printStudent(tempStudent);
        } else {
            System.out.println("Did not find student-" + studentIndex);
            return;
        }
    }

    public static void reviseStudent(List<Student> studentList, String studentId) {
        int searchIndex = searchStudent(studentList, studentId);
        if (searchIndex != -1) {
            Scanner consoleIn = new Scanner(System.in);
            System.out.println("Please modify age:");
            studentList.get(searchIndex).setAge(consoleIn.nextInt());
            System.out.println("Please modify name:");
            studentList.get(searchIndex).setName(consoleIn.next());
            System.out.println("Please modify address:");
            studentList.get(searchIndex).setAddress(consoleIn.next());

            System.out.println("Modify successfully!!!");
            printStudent(studentList.get(searchIndex));

        } else {
            System.out.println("Student-" + studentId + " does not exit.");
            return;
        }
    }

    public static int searchStudent(List<Student> studentList, String studentId) {
        int index = 0;
        for (Student s: studentList) {
            if (s.getId().equals(studentId)) {
                return index;
            }
            index++;
        }

        return -1;
    }


    public static void printStudent(Student tempStudent) {
        System.out.println("Student Id:" + tempStudent.getId());
        System.out.println("Student Name:" + tempStudent.getName());
        System.out.println("Student Age:" + tempStudent.getAge());
        System.out.println("Student Address:" + tempStudent.getAddress());
    }
}
