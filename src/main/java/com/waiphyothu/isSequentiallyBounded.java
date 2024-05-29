package main.java.com.waiphyothu;

public class isSequentiallyBounded {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0}));
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }

    static int isSequentiallyBounded7(int[] a) {
        if (a.length == 0)
            return 1;
        if (a.length == 1 && a[0] == 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] > a[i + 1]) {
                return 0;
            }
            int total = 0;
            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    total++;
                }
            }
            if (total >= a[i]) {
                return 0;
            }
        }
        return 1;
    }


    public static int isSequentiallyBounded(int[] a) {
        int countSequence = 1;

        if (a.length == 1 && a[0] <= 0)
            return 0;

        for (int index = 0; index < a.length - 1; index++) {
            if (a[index] > a[index + 1])
                return 0;

            if (a[index] == a[index + 1])
                countSequence++;
            else
                countSequence = 1;

            if (a[index] <= countSequence)
                return 0;
        }
        return 1;
    }
}
