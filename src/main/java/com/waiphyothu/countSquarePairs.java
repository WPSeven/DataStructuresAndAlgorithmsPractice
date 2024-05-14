package main.java.com.waiphyothu;

public class countSquarePairs {
    public static void main(String[] args) {

        //System.out.println("isPerfectSquare " + isPerfectSquare(8));
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{11, 5, 4, 20}));

        System.out.println(countSquarePairs(new int[]{9}));
    }

    static int countSquarePairs(int[] a) {
        int count = 0;
        for (int anA : a) {
            for (int j = 0; j < a.length; j++) {
                if (anA < a[j] & anA > 0 & a[j] > 0) {
                    if (isPerfectSquare(anA + a[j]) == 1) {
                        System.out.println("Square Pairs " + anA + " " + a[j]);
                        count++;
                    }
                }
            }

        }

        return count;
    }

    static int isPerfectSquare(int n) {
        if (n >= 0) {
            int sr = (int) Math.sqrt(n);

            if (sr * sr == n) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
