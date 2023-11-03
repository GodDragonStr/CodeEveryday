public class TwoDimension {

    public static void main(String[] args) {
        // static
        int[][] arra1 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] arra2 = {{1, 2, 3}};
        // dynamic
        int[][] arra3 = new int[1][3];
        int[][][] arr4 = new int[1][2][3];

        System.out.print(arra1 + " " + arra2 + " " + arra3);

        // row: arra1.length
        for (int i = 0; i < arra1.length; i++) {
            // column: arra2.length
            for (int j = 0; j < arra1[i].length; j++) {
                System.out.print(arra1[i][j] + " ");
            }
            System.out.println();
        }
    }


}