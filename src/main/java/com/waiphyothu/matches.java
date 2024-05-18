package main.java.com.waiphyothu;

public class matches {


    public static void main(String[] args) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
   /*     System.out.println(matches(new int[]{1, 1, 1, 2, 2, 1, 1, 3}, new int[]{1, 2, 1, 3}));
        System.out.println(matches(new int[]{1, 1, 1, 1, 1}, new int[]{1}));
        System.out.println(matches(new int[]{1}, new int[]{1}));
        System.out.println(matches(new int[]{1, 1, 2, 2, 2, 2}, new int[]{1, 2}));
        System.out.println(matches(new int[]{1, 2, 3}, new int[]{1, 2}));
        System.out.println(matches(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(matches(new int[]{1, 1, 2, 2, 2, 2, 3}, new int[]{1, 3}));
        System.out.println(matches(new int[]{1, 1, 1, 1}, new int[]{1, 2}));
        System.out.println(matches(new int[]{1, 1, 1, 1, 2, 2, 3, 3}, new int[]{1, 2}));
        System.out.println(matches(new int[]{1, 1, 10, 4, 4, 3}, new int[]{1, 4, 3}));*/

    }

    public static int matches(int[] a, int[] p) {
        int count = 0;
        for (int i : p) {
            count += i > 0 ? i : 0 - i;
        }
        if (a.length != count) {
            return 0;
        }
        int index = 0;
        for (int out : p) {
            int start = index;
            for (; start < (index + out > 0 ? out : 0 - out); start++) {
                if ((out > 0 && a[start] < 0) || (out < 0 && a[start] > 0)) {
                    return 0;
                }
            }
            index += start;
        }
        return 1;
    }

}