public class TypeConver {
    public static void main(String[] args) {
        Integer a = 10;
//        double b = 10.0;
        System.out.println(a.getClass());

        int intA = 1;
        double doubleB = 2.0;
        float floatC = 3.6F;
        System.out.println(intA % doubleB);
        System.out.println(floatC + intA);
//        Type cast
        System.out.println((int)floatC);

        int a2 = 1;
        double b = 2.0;
        a2 += b;
        System.out.println(a2);
    }
}
