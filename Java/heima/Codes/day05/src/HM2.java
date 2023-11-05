
public class HM2 {
    public static void main(String[] args) {
        // double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double[] arr = new double[] {12.9, 53.54, 75.0, 99.1, 3.14};

        double minA = arr[0];

        for (double i : arr) {
            if (minA > i) {
                minA = i;
            }
        }
        System.out.println("The minimal: " + minA);
    }
}