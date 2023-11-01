import java.util.Scanner;
public class HM1 {
    public static void main(String[] args) {
        Scanner getHeight = new Scanner(System.in);

        float[] heights = new float[2];
        System.out.println("Input father's height:");
        heights[0] = getHeight.nextInt();
        System.out.println("Input mother's height:");
        heights[1] = getHeight.nextInt();

        System.out.println("Son's height:" + (heights[0] + heights[1]) * 1.08 / 2);
        System.out.println("Daughter's height:" + (heights[0] * 0.923 + heights[1]) / 2);

    }
}