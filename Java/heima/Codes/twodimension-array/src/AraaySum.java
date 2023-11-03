public class AraaySum {
    public static void main(String[] args) {
        int[][] doubleArra = {{11, 22},
                {22, 33},
                {33, 44}
        };

        int totalSum = 0;
        for (int i = 0; i < doubleArra.length; i++) {
            int tempSum = arraSum(doubleArra[i]);
            totalSum += tempSum;
            System.out.println("s" + i + " turnover:" + tempSum);
        }
        System.out.println("total turnover:" + totalSum);
    }

    public static int arraSum(int[] arra) {
        int sum = 0;
        for (int i = 0; i < arra.length; i++) {
            sum += arra[i];
        }
        return sum;
    }
}
