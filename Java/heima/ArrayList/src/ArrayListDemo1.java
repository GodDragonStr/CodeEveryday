import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(arrayList);
        arrayList.add("first word");
        arrayList.add("first word");
        arrayList.add("first word");
        arrayList.add("first word");
        System.out.println("arrayList:" + arrayList);

        String result = arrayList.remove(1);
        System.out.println(result);
        System.out.println("arrayList:" + arrayList);

        String oldValue = arrayList.set(1, "change word");
        System.out.println(arrayList);

        boolean howMany = arrayList.remove("first word");
        arrayList.remove("first word");
        System.out.println(howMany);
        System.out.println(arrayList.size());

    }
}
