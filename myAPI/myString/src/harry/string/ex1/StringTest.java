package harry.string.ex1;

public class StringTest {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";
        System.out.println(System.identityHashCode(str));
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(System.identityHashCode(ex.str));
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }
}