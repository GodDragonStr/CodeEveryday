import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner getWeight = new Scanner(System.in);
        int[] weights = new int[3];
//        System.out.println(weights.length);
        System.out.println("Please input weight of 1 animal:");
        weights[0] = getWeight.nextInt();

        System.out.println("Please input weight of 2 animal:");
        weights[1] = getWeight.nextInt();

        // can be replaced with math call
        int maxWeight = Math.max(weights[0], weights[1]);
//        int maxWeight = weights[0] > weights[1] ? weights[0] : weights[1];

        System.out.println("Max weight:" + maxWeight);

        // Compare three nums and choose the max
        String stringWeights = getWeight.next();

//        int temp1 = 10, temp2 = 20, temp3 = 30;
        int temp4 = Math.max( weights[1],  weights[0]);
/*
          int temp4 = temp1 > temp2 ? temp1 : temp2;
          int temp5 = temp4 > temp3 ? temp4 : temp3;
*/
        System.out.println(temp4);
    }

}