import java.util.Random;

public class DefineArray {
    public static void main(String[] args) {
        int [] arra;
        // static array initialization + concise form
        int [] aArray = new int[] {1, 2, 3};
        int [] bArray = {1, 2, 3};
        // dynamic array initialization
        int [] cArray = new int[3];

        double [] dArray = {1.0, 2.0, 3.0};

        System.out.println("aArray;" + aArray);
        System.out.println("bArray;" + bArray);


        int[] eArray = {1, 2, 3, 4, 5, 3, 4, 5, 332, 1, 2};

        if (eArray == null || eArray.length == 1) {
            return ;
        }

        for (int i = 0; i < eArray.length - 1; i++) {
            for (int j = 0; j < eArray.length - i - 1; j++) {
                if (eArray[j+1] <= eArray[j]) {
                    int temp = eArray[j];
                    eArray[j] = eArray[j+1];
                    eArray[j+1] = temp;
                }
            }
        }

        for (int k = 0; k < eArray.length; k++) {
            System.out.println(eArray[k] );
        }

        // scramble data
        Random getRandomIndex = new Random();
        for (int i = 0; i < eArray.length; i++) {
            // [ , )
            int randomIndex = getRandomIndex.nextInt(eArray.length);
            int temp = eArray[randomIndex];
            eArray[randomIndex] = eArray[i];
            eArray[i] = temp;
        }

        for (int i = 0; i < eArray.length; i++) {
            System.out.println(eArray[i]);
        }


    }
}