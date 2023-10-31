import javax.sound.sampled.AudioFileFormat.Type;

public class VariableDemo {
    public static void main(String[] args) {
        // system32: 1 Word = 4 Byte = 32 bit
        // system64: 1 Word = 8 Byte = 64 bit
        int a = 3;          // 4 Byte
        short f = 11111;    // 2 Byte
        float b = 10;       // 4 Byte
        double c = 3.333;   // 8 Byte

        byte d = 1;         // 1 Byte
        boolean e = false;  // 1 Byte
        char g = 'g';       // 2 Byte

        int h = 1, i = 2, j = 3;
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}