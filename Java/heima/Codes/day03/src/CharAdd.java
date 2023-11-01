public class CharAdd {
    public static void main(String[] args) {
        // '0'->48; 'A'->65; 'a'->97
        char charA = 'a';
        // +=: default type cast from int to char
        charA += 1;
        System.out.println(charA);
        System.out.println((char)(charA + 1));
    }
}