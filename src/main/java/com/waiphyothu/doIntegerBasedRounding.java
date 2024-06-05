package main.java.com.waiphyothu;

import java.util.Arrays;

public class doIntegerBasedRounding {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(a, 2);
        System.out.println(Arrays.toString(a)); // [2, 2, 4, 4, 6]

        int[] b = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(b, 3);
        System.out.println(Arrays.toString(b)); // [0, 3, 3, 3, 6]

        int[] c = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(c, -3);
        System.out.println(Arrays.toString(c)); // [1, 2, 3, 4, 5]

        int[] d = new int[]{-1, -2, -3, -4, -5};
        doIntegerBasedRounding(d, 3);
        System.out.println(Arrays.toString(d)); // [-1, -2, -3, -4, -5]

        int[] e = new int[]{-18, 1, 2, 3, 4, 5};
        doIntegerBasedRounding(e, 4);
        System.out.println(Arrays.toString(e)); // [-18, 0, 4, 4, 4, 4]

        int[] f = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(f, 5);
        System.out.println(Arrays.toString(f)); // [0, 0, 5, 5, 5]

        int[] g = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(g, 100);
        System.out.println(Arrays.toString(g)); // [0, 0, 0, 0, 0]
    }



    private static void doIntegerBasedRounding(int[ ] a, int n){
        if (n <= 0)
            return;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                int lower = (a[i] / n) * n;
                int upper = lower + n;
                int middle = n % 2 == 0 ? lower + n / 2 : lower + n / 2 + 1;
                if (a[i] >= middle)
                    a[i] = upper;
                else
                    a[i] = lower;
            }
        }
    }



    static void doIntegerBasedRounding2(int[] a, int n) {
        if (n > 0) {
            for (int i = 0; i < a.length; i++) {
                int j = 1;
                if (a[i] < 0)
                    continue;
                while (true) {
                    int prev = n * (j - 1);
                    int next = n * j;

                    if (a[i] >= prev && a[i] <= next) {
                        if (a[i] == prev)
                            a[i] = prev;
                        else if (a[i] == next)
                            a[i] = next;
                        else if (a[i] - prev == next - a[i])
                            a[i] = next;
                        else if (a[i] - prev > next - a[i])
                            a[i] = next;
                        else a[i] = prev;

                        break;
                    }
                    j++;
                }
            }
        }
    }

}
