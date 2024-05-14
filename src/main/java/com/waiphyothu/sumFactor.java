package main.java.com.waiphyothu;

public class sumFactor {

    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0, 0, 0}));

    }

    static int sumFactor(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        int occurs = 0;
        for (int anA : a) {
            if (sum == anA) {
                occurs++;
            }
        }
        return occurs;
    }

}
