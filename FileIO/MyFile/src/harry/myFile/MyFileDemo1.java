package harry.myFile;

import org.junit.Test;
import java.io.File;
import java.util.Collection;
import java.util.Collections;

public class MyFileDemo1 {
    public static void main(String[] args) {


    }

    // 打印目录下的文件
    @Test
    public void test1() {
        // 绝对路径
        File f1 = new File("D:\\Cache\\尚硅谷\\2023\\01_课件与电子教材\\尚硅谷_第15章_File类与IO流");
        // 父路径+子路径
        String father = "D:\\Cache\\尚硅谷\\2023\\01_课件与电子教材";
        String child = "尚硅谷_第15章_File类与IO流";
        File f2 = new File(father, child);
        // 目录下的子目录和文件：字符串数组
        String[] s1 = f1.list();
        String[] s2 = f2.list();
        File[] s3 = f2.listFiles();

        for (String s: s1) {
            System.out.println(s);
        }
        for (String s: s2) {
            System.out.println(s);
        }
        for (File f : s3) {
            System.out.println(f);
        }

        System.out.println(String.join("", Collections.nCopies(10,"*")));

//        File f1 = new File("D:\\Cache\\尚硅谷\\2023\\01_课件与电子教材\\尚硅谷_第15章_File类与IO流");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(f1.length());
        System.out.println(f1.lastModified());

        System.out.println(String.join("", Collections.nCopies(10, "*")));
        File f3 = new File(f1, "尚硅谷_宋红康_第15章_File类与IO流.md");
        System.out.println(f3.length());
        System.out.println(f3);

    }

}
