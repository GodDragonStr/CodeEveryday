public class ScliceArray {
    public static void main(String[] args) {
        int [] aArray = {1, 2, 3, 4, 5, 3, 4, 5, 332, 1, 2};
        int fromIndex = 1;
        int toIndex = 3;
        int [] scliceArray = new int[toIndex - fromIndex + 1];
        scliceArray = arrayOfRange(aArray, fromIndex, toIndex);
        for (int i = 0; i < scliceArray.length; i++){
            System.out.println(scliceArray[i]);
        }
    }

    // function interface
    public static int[] arrayOfRange(int[] arra, int fromIndex, int toIndex) {
           int[] tempArray = new int[toIndex - fromIndex + 1];
           int tempIndex = 0;
           for ( int i = fromIndex; i < toIndex + 1; i++, tempIndex++) {
               tempArray[tempIndex] = arra[i];
           }

           return tempArray;
    }
}
