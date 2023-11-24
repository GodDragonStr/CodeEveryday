package harry.i_i;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static int reRandk(int key, int[] a, int lp, int hp) {
        if (hp <= lp || a == null || a.length == 0) return -1;

        int mid = (lp + hp) / 2;
        if (a[mid] == key)
            return mid;
        else if (a[mid] > key) {
            hp = mid;
            return reRandk(key, a, lp, hp);
        } else{
            lp = mid + 1;
            return reRandk(key, a, lp, hp);
        }
    }

    public static void main(String[] args) {
        int[] arra = {1, 2, 3, 4, 5, 7, 6};
        System.out.println(reRandk(8, arra, 0, arra.length));
    }
}
