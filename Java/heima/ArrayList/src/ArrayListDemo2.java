import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> newInt = new ArrayList<Integer>();
        newInt.add(1);
        System.out.println(newInt);

        Integer intTest = 1;
        System.out.println(intTest);
        Integer intTest2 = new Integer(1);
        System.out.println(intTest2);


        Integer intTest3 = 5;
        int intTest5 = Integer.valueOf(5);
        int intTest6 = intTest3.intValue();
        System.out.println(intTest5);

        newInt.add(2);
        System.out.println("size: " + newInt.size());
        System.out.println(intTest3);

        int[] testInt = new int[] {1, 2, 3, 4};
        System.out.println(testInt);

        Integer num1 = 200;
        Integer num2 = 200;
        System.out.println("num1==num2: "+(num1==num2));
        System.out.println(num1);
        Integer num3 = 100;
        Integer num4 = 100;
        System.out.println("num3==num4: "+(num3==num4));

    }
}
