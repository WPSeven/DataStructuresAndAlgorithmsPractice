package main.java.com.waiphyothu;

public class isOnionArray {

    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
        System.out.println(isOnionArray(new int[]{1, 3, 9, 8}));
        System.out.println(isOnionArray(new int[]{2}));
        System.out.println(isOnionArray(new int[]{}));
        System.out.println(isOnionArray(new int[]{-2, 5, 0, 5, 12}));

    }

    static int isOnionArray(int[] a) {
        if (a.length == 1 || a.length ==0)
            return 1;

        int length = a.length - 1;

        for (int j = 0; j <= length / 2; j++) {
            int k = length - j;
            if (j != k && a[j] + a[k] > 10) {
                return 0;  // Not an onion array
            }
        }

        return 1;  // It is an onion array
    }

    static int isOnionArray2(int[] a) {
        if (a.length == 1 || a.length ==0)
            return 1;

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            if (i + j == a.length - 1) {
                if (a[i] + a[j] > 10)
                    return 0;
            }else return 0;
        }
        return 1;
    }
}
